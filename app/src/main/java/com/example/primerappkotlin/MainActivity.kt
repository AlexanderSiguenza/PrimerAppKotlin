package com.example.primerappkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombre : EditText = findViewById(R.id.txtnombre)
        val enviar : Button = findViewById(R.id.btnenviar)
        val resultado: TextView = findViewById(R.id.llbresultado)

        enviar.setOnClickListener{
            val nombreusuario: String = nombre.text.toString()
            resultado.text = nombreusuario
        }
    }
}