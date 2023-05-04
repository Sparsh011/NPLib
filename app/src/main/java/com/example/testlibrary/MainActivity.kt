package com.example.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.test_library.NameAndPasswordView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nmp = NameAndPasswordView(this, null)
        Toast.makeText(applicationContext, "${nmp.name} and ${nmp.password}", Toast.LENGTH_SHORT).show()
    }
}