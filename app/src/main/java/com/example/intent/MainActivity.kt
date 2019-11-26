package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSend.setOnClickListener{
            //Create an eXPLICIT INTENT.
            // Two para (this, Component Name)
            val intent = Intent(this, SecondActivity::class.java)

            val phone = editTextPhone.text.toString()
            intent.putExtra(EXTRA_PHONE,phone)
            startActivity(intent)
        }
    }
    companion object {
        const val EXTRA_PHONE = "com.example.intent.PHONE"
    }
}
