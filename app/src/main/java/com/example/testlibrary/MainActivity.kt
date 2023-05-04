package com.example.testlibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test_library.NameAndPasswordView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nmp = NameAndPasswordView(this, null)
    }
}