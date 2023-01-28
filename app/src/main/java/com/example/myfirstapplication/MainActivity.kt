package com.example.myfirstapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    val a = 324
    val b = 100
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.button4.setOnClickListener{
            val resultValue  = bindingClass.edValue.text.toString()
            bindingClass.textView3.visibility =View.VISIBLE
            when(resultValue){

                in "" -> bindingClass.textView3.text ="Ошибка"
                else -> bindingClass.textView3.text = resultValue
            }
        }


    }


    override fun onPause() {
        super.onPause()
    }
}