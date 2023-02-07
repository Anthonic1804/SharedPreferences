package com.home.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.home.sharedpreferences.SharedPreferencesApplication.Companion.prefs
import org.w3c.dom.Text

@Suppress("DEPRECATION")
class ResultActivity : AppCompatActivity() {
    private var tvNombre: TextView? = null
    private var btnSalir: Button? = null
    private var container: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvNombre = findViewById(R.id.tvNombre)
        btnSalir = findViewById(R.id.btnsalir)
        container = findViewById(R.id.container)

        initUI()
    }

    //FUNCNION PARA INICIARLIZAR EN LAS ACTIVITYS TODA LA LOCA QUE NECESITEMOS
    fun initUI(){
        btnSalir!!.setOnClickListener(){
            prefs.wipe()
            onBackPressed()
        }

        val userName = prefs.getName()
        tvNombre!!.text = "Bienvenido $userName"
        if(prefs.getVip()){
            setVipBackground()
        }

    }

    fun setVipBackground(){
        container!!.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow))
    }
}