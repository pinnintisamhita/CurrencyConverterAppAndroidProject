package com.example.currencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
          editText=findViewById(R.id.editText)
          button=findViewById(R.id.btn)
          textView=findViewById(R.id.ResultText)
          button.setOnClickListener {
              var enteredtext:String=editText.text.toString()
              var indianRupees:Double=enteredtext.toDouble()
              var usd=currencyConverter(indianRupees)
              textView.text= "$usd Dollars"
          }
        }
       fun currencyConverter(p:Double):Double
       {
           return p*0.012
       }
    }
