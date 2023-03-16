package com.example.pemrogramanberbasismobile_activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var et1: EditText? = null
    var et2: EditText? = null
    var et3: EditText? = null
    var btn1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = findViewById<View>(R.id.editTextNim) as EditText
        et2 = findViewById<View>(R.id.editTextNama) as EditText
        et3 = findViewById<View>(R.id.editTextAlamat) as EditText
        btn1 = findViewById<View>(R.id.buttonClear) as Button
        btn1!!.setOnClickListener {
            et1!!.setText("")
            et2!!.setText("")
            et3!!.setText("")
        }
    }
}