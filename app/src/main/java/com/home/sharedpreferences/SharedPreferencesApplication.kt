package com.home.sharedpreferences

import android.app.Application

//ESTA CLASE SE EJECUTARA ANTES DE IR AL MAIN_ACTIVITY
class SharedPreferencesApplication: Application() {

    //METODO PARA HACER PUBLICA UNA CLASE EN TO_DO EL PROYECTO
    companion object{
        lateinit var prefs:Prefs //INDICAMOS QUE ESTA VARIABLE SE INICIALIZARA MAS ADELANTE
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext) //aplicationContext es el contexto general de la activity
    }
}