package com.kash.polonia.Firts_App

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kash.polonia.R

class resultActivity : AppCompatActivity() {


    private lateinit var reCalculator : AppCompatButton
    private lateinit var numImc :TextView
    private lateinit var estado :TextView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        initComponents()
        listeners()
        showResult()


    }

    private fun initComponents() {
        reCalculator = findViewById(R.id.reCalculator)
        numImc = findViewById(R.id.numImc)
        estado = findViewById(R.id.estado)
    }

    private fun showResult() {
        val resultado = intent.getStringExtra("Resultado_Imc").orEmpty()
        numImc.text = resultado
        val weight = resultado.toDoubleOrNull()
        Log.i("Prueba2","$weight")
        if (weight != null) {
            if (weight > 22 && weight < 29 ){
                estado.text = "Normal"
            }else if( weight > 29.4 ){
                estado.text = "Sobrepeso"
            }
        }
    }

    private fun listeners() {
        reCalculator.setOnClickListener {
            val intent = Intent(this,weightActivity::class.java)
            startActivity(intent)
        }
    }
}