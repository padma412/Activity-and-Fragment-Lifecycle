package com.example.activity_and_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print(" Called onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        print("Called onSaveInstanceState")
    }

    override fun onStart() {
        super.onStart()
        print("Called onStart")
    }

    override fun onResume() {
        super.onResume()
        print("Called onResume")
    }

    override fun onPause() {
        super.onPause()
        print("Called onPause")
    }

    override fun onStop() {
        super.onStop()
        print("Called onStop")
    }

    override fun onRestart() {
        super.onRestart()
        print("Called onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("Called onDestroy")
    }
    }

