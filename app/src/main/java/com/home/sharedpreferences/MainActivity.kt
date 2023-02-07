package com.home.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import com.home.sharedpreferences.SharedPreferencesApplication.Companion.prefs

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
        checkUserValues()
    }

    //funcion para vericiar si las sharedpreferences no estan vacias
    fun checkUserValues(){
        if(prefs.getName().isNotEmpty()){
            goToDetail()
        }
    }
    fun initUI(){
        btnContinuar!!.setOnClickListener{ accessToDetail() }
    }

    //FUNCINON PARA ALMACENAR LAS SHAREDPREFERENCES
    fun accessToDetail(){
        if(etNombre!!.text.toString().isNotEmpty()){
            prefs.saveName(etNombre!!.text.toString())
            prefs.saveVip(cbVip!!.isChecked)
            goToDetail()
        }else{

        }
    }

    //FUNCION PARA ACCEDER A UN NUEVA ACTIVIDAD DESPUES DE DAR CLIC EN EL BOTON
    fun goToDetail(){
        startActivity(Intent(this, ResultActivity::class.java))
    }
}