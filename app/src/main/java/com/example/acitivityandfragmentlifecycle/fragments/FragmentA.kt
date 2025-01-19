package com.example.acitivityandfragmentlifecycle.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.acitivityandfragmentlifecycle.R

class FragmentA : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("ActivityFragmentA", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ActivityFragmentA", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("ActivityFragmentA", "onCreateView")
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ActivityFragmentA", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityFragmentA", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityFragmentA", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityFragmentA", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityFragmentA", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("ActivityFragmentA", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ActivityFragmentA", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityFragmentA", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("ActivityFragmentA", "onDetach")
    }
}