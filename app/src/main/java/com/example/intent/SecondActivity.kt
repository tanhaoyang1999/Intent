package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE) //Who called me?
        //val age:Int = intent.getIntExtra("AGE",0)
        textViewPhone.text = String.format("%s", phone)

        buttonCall.setOnClickListener{
            val phoneUri = Uri.parse("tel:" + phone)

            //declare an implicit intent
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(phoneUri)
            //Validate intent using the packageManager
            if(intent.resolveActivity(packageManager)!= null){
                startActivity(intent)
            }

        }
    }
}
