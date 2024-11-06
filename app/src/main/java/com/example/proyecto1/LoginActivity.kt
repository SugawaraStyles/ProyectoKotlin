package com.example.proyecto

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto1.R
import java.sql.Connection

class LoginActivity : AppCompatActivity() {
    var txtUsuario: EditText? = null
    var txtContraseña: EditText? = null
    var lblRegistrar: TextView? = null
    var btnInegistrar: Button? = null
    var con: Connection? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        txtUsuario = findViewById<View>(R.id.txtUsuario) as EditText
        txtContraseña = findViewById<View>(R.id.txtUsuario) as EditText
        lblRegistrar = findViewById<View>(R.id.lblRegistrar) as TextView
        btnInegistrar = findViewById<View>(R.id.btnIngresar) as Button
    }
}