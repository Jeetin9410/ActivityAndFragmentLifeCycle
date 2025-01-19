package com.example.acitivityandfragmentlifecycle.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.acitivityandfragmentlifecycle.R

class FragmentB : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("ActivityFragmentB", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ActivityFragmentB", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("ActivityFragmentB", "onCreateView")
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ActivityFragmentB", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityFragmentB", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityFragmentB", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityFragmentB", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityFragmentB", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("ActivityFragmentB", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ActivityFragmentB", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityFragmentB", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("ActivityFragmentB", "onDetach")
    }
}