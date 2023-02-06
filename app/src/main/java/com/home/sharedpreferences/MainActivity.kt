package com.home.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var btnContinuar: Button? = null
    private var etNombre: EditText? = null
    private var cbVip: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnContinuar = findViewById(R.id.btncontinuar)
        etNombre = findViewById(R.id.etNombre)
        cbVip = findViewById(R.id.cbVip)

        initUI()
    }


    fun initUI(){
        btnContinuar!!.setOnClickListener{ accessToDetail() }
    }

    fun accessToDetail(){

    }
}