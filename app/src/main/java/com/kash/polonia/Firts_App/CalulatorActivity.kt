package com.kash.polonia.Firts_App

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kash.polonia.R

class CalulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calulator)
        val menu = findViewById<Button>(R.id.imagen)
        menu.setOnClickListener{
            val intet = Intent(this,MenuActivity::class.java)
            startActivity(intet)
        }

    }
}