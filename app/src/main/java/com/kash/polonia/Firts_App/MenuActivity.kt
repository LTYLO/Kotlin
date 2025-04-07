package com.kash.polonia.Firts_App

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kash.polonia.Firts_App.Netflix.NetflixActivity
import com.kash.polonia.R

class MenuActivity : AppCompatActivity() {


    private lateinit var app_1: CardView
    private lateinit var app_2: CardView
    private lateinit var app_3: CardView
    private lateinit var app4: CardView
    private lateinit var app5 :CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        initComponents()
        initListeners()
        enterFullScreendMode()

    }

    private fun enterFullScreendMode() {
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                )

    }


private fun initComponents() {
        app_1 = findViewById(R.id.circulo_uno)
        app_2 = findViewById(R.id.app_2)
        app_3 = findViewById(R.id.app_3)
        app4 = findViewById(R.id.app4)
        app5 = findViewById(R.id.App5)

    }

    private fun initListeners() {
        app_1.setOnClickListener {
            val intent = Intent(this, Firts_App_Activity::class.java)
            startActivity(intent)
        }
        app_2.setOnClickListener {
            val intent = Intent(this, CalulatorActivity::class.java)
            startActivity(intent)
        }
        app_3.setOnClickListener {
            val intent2 = Intent(this, weightActivity::class.java)
            startActivity(intent2)
        }
        app4.setOnClickListener{
            val intent = Intent(this, homeActivity::class.java)
            startActivity(intent)
        }

        app5.setOnClickListener{
            val intent = Intent(this,NetflixActivity::class.java)
            startActivity(intent)
        }

    }


}