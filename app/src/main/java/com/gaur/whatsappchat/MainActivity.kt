package com.gaur.whatsappchat

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.openWhatsAppChat)


        button.setOnClickListener {

            val uri = Uri.parse("smsto"+"+91") // please add your number here
            val intent = Intent(Intent.ACTION_SENDTO,uri)
            intent.setPackage("com.whatsapp")
            if(intent.resolveActivity(this.packageManager)!=null){
                startActivity(intent)
            }else{
                Toast.makeText(this,"Package is not installed",Toast.LENGTH_SHORT).show()
            }

        }

    }


}