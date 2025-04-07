package com.kash.polonia.Firts_App

import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.RangeSlider
import com.kash.polonia.R
import kotlin.math.pow

class weightActivity : AppCompatActivity() {
    private var curretHeight: Int = 120
    private var curretWeight: Int = 50
    private var curretAge: Int = 18
    private var isMaleSelected: Boolean = true
    private var isFameSelected: Boolean = false
    private lateinit var viewMale: CardView
    private lateinit var viewFame: CardView
    private lateinit var rsHeight: RangeSlider
    private lateinit var tv_hight: TextView
    private lateinit var btnWeight: AppCompatButton
    private lateinit var btnWeight_menos: AppCompatButton
    private lateinit var tvWeight: TextView
    private lateinit var btnAge: AppCompatButton
    private lateinit var btnAge_menos: AppCompatButton
    private lateinit var tvAge: TextView
    private lateinit var btnCalculator: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weight)

        initComponents()
        initListeners()
        genderSelected()
    }

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFame = findViewById(R.id.viewFame)
        rsHeight = findViewById(R.id.rsHeight)
        tv_hight = findViewById(R.id.tv_hight)
        btnWeight = findViewById(R.id.btnWeight)
        tvWeight = findViewById(R.id.tvWeight)
        btnWeight_menos = findViewById(R.id.btnWeight_menos)
        tvAge = findViewById(R.id.tvAge)
        btnAge = findViewById(R.id.btnAge)
        btnAge_menos = findViewById(R.id.btnAge_menos)
        btnCalculator = findViewById(R.id.btnCalculator)
    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            isMaleSelected = true
            isFameSelected = false
            genderSelected()
        }
        viewFame.setOnClickListener {
            isMaleSelected = false
            isFameSelected = true
            genderSelected()
        }
        rsHeight.addOnChangeListener { _, value, _ ->
            var df = DecimalFormat("#.##")
            curretHeight = df.format(value).toInt()
            tv_hight.text = "$curretHeight cm"

        }
        btnWeight.setOnClickListener {
            curretWeight += 1
            if (curretWeight > 250) {
                curretWeight = 250
                calculatorWeight(curretWeight)
            } else {
                calculatorWeight(curretWeight)
            }
        }

        btnWeight_menos.setOnClickListener {
            curretWeight -= 1
            if (curretWeight < 0) {
                curretWeight = 0
                calculatorWeight(curretWeight)
            } else {
                calculatorWeight(curretWeight)
            }

        }

        btnAge.setOnClickListener {
            curretAge += 1
            if (curretAge > 110) {
                curretAge = 110
                calculatorAge(curretAge)
            } else {
                calculatorAge(curretAge)
            }
        }

        btnAge_menos.setOnClickListener {
            curretAge -= 1
            if (curretAge < 0) {
                curretAge = 0
                calculatorAge(curretAge)
            } else {
                calculatorAge(curretAge)
            }
        }

        btnCalculator.setOnClickListener {
            val resultado = calculatorimc().toString()
            val intent = Intent(this, resultActivity::class.java)
            intent.putExtra("Resultado_Imc", resultado)
            startActivity(intent)

        }

    }


    private fun calculatorAge(curretAge: Int) {
        var resul1 = curretAge.toString()
        tvAge.text = "$resul1 años"


    }

    private fun calculatorWeight(curretWeight: Int) {
        var resul2 = curretWeight.toString()
        tvWeight.text = "$resul2 kg"

    }

    private fun calculatorimc(): Double {
        var df = DecimalFormat("#.##")
        val imc = curretWeight / (curretHeight.toDouble() / 100).pow(2)
        var res = df.format(imc).toDouble()
        Log.i("Prueba", "El imc es $res")
        return res
    }

    private fun genderSelected() {
        var colorMale = if (isMaleSelected) {
            ContextCompat.getColor(this, R.color.background_component_selected)
        } else {
            ContextCompat.getColor(this, R.color.background_component)
        }
        var colorFamele = if (isFameSelected) {
            ContextCompat.getColor(this, R.color.background_component_selected)
        } else {
            ContextCompat.getColor(this, R.color.background_component)
        }
        viewMale.setCardBackgroundColor(colorMale)
        viewFame.setCardBackgroundColor(colorFamele)
    }


}