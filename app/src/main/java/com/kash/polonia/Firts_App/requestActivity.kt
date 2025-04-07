package com.kash.polonia.Firts_App

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.kash.polonia.R

class requestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_request)
        val menu = findViewById<Button>(R.id.menu)
        val saludo = findViewById<TextView>(R.id.saludo)
        val name: String = intent.extras?.getString("Nombre").orEmpty()
        saludo.text = "Hola! ${name}"
        menu.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        }


    }
