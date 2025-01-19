package com.example.acitivityandfragmentlifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("MainActivity2", "onCreate")
        findViewById<Button>(R.id.go_back).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity2", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity2", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity2", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity2", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MainActivity2", "onSaveInstanceState")
    }
}