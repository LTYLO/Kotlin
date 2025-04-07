package com.kash.polonia.Firts_App

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText

import com.kash.polonia.R

class Firts_App_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_firts_app)
        val btn_enter = findViewById<Button>(R.id.btn_enter)
        val text_nombre = findViewById<AppCompatEditText>(R.id.text_nombre)
        val text_apellido = findViewById<AppCompatEditText>(R.id.text_apellido)
        text_nombre.text.toString()
        text_apellido.text.toString()

        btn_enter.setOnClickListener{
            val name = text_nombre.text.toString()
            val lastname =  text_apellido.text.toString()
            if (name.isNotEmpty() and (lastname.isNotEmpty())){
                Log.i("btn_enter", "Boton pulsado ${text_nombre.text.toString()} ${text_apellido.text.toString()}")
                val intent = Intent(this,requestActivity::class.java)
                intent.putExtra("Nombre", name)
                startActivity(intent)
            }else{
                Log.i("Btn_enter", "No han llenado el resgistro")
            }

        }


    }
}