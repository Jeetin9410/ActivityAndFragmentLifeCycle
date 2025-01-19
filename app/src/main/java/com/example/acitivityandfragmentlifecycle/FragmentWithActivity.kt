package com.example.acitivityandfragmentlifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.acitivityandfragmentlifecycle.fragments.FragmentA
import com.example.acitivityandfragmentlifecycle.fragments.FragmentB

class FragmentWithActivity : AppCompatActivity() {

   private var isFragmentAVisible : Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_fragment)
        Log.d("FragmentActivity", "onCreate")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentA())
            .commit()

        findViewById<Button>(R.id.go_forward).setOnClickListener {
            if(isFragmentAVisible) {
                supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, FragmentB())
                    .commit()
            } else {
                supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, FragmentA())
                    .commit()
            }
            isFragmentAVisible = !isFragmentAVisible
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("FragmentActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FragmentActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FragmentActivity", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("FragmentActivity", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("FragmentActivity", "onSaveInstanceState")
    }
}