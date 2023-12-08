 package com.zarenonathanielblock6p1quiz.nathanielzareno_block6_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

 class MainActivity : AppCompatActivity() , View.OnClickListener{

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var etF : EditText
    lateinit var etS : EditText
    lateinit var resultTV : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.button_add)
        btnSub = findViewById(R.id.button_sub)
        btnMul = findViewById(R.id.button_mul)
        btnDiv = findViewById(R.id.button_div)
    }

     override fun onClick(v: View?) {
         var f = etF.text.toString().toDouble()
         var s = etS.text.toString().toDouble()
         var result = 0.0
         when(v?.id){
             R.id.button_add -> {
                 result = f+s
             }
             R.id.button_sub -> {
                 result = f-s
             }
             R.id.button_mul -> {
                 result = f*s
             }
             R.id.button_div -> {
                 result = f/s
             }
         }
         resultTV.text = "Result is $result"
     }
 }