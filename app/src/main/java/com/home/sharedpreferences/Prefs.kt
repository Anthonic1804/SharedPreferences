package com.home.sharedpreferences

import android.content.Context

class Prefs(val context:Context) {

    val SHARED_DATABASE = "Mydtb" //NOMBRE DE BD LOCAL DE SHAREDPREFERENCES
    val SHARED_USER_NAME = "username"
    val SHARED_VIP = "vip"

    val storage = context.getSharedPreferences(SHARED_DATABASE, 0)

    //FUNCION PARA ALMACER EL NOMBRE DEL USUARIO EN SHAREDPREFERENCES
    fun saveName(name:String){
        storage.edit().putString(SHARED_USER_NAME, name).apply()
    }

    fun saveVip(vip:Boolean){
        storage.edit().putBoolean(SHARED_VIP, vip).apply()
    }

    //FUNCION PARA OBTENER EL NOMBRE DEL USUARIO ALMACENADO
    fun getName():String{
        return storage.getString(SHARED_USER_NAME, "")!!
    }

    fun getVip():Boolean{
        return storage.getBoolean(SHARED_VIP, false)
    }

    fun wipe(){
        storage.edit().clear().apply()
    }

}