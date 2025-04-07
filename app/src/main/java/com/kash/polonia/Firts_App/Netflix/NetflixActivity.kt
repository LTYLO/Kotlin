package com.kash.polonia.Firts_App.Netflix

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kash.polonia.R

class NetflixActivity : AppCompatActivity() {

    private var CategoriesMyPreferences = listOf(
        CategoriesPreferences.office,
        CategoriesPreferences.bigbang,
        CategoriesPreferences.friends,
        CategoriesPreferences.theBoys
    )

    private var Categories = listOf(
        CategoriesRequest.rick,
        CategoriesRequest.avengers,
        CategoriesRequest.inception,
        CategoriesRequest.moneyHeist,
        CategoriesRequest.inception,
        CategoriesRequest.theWitcher,

    )

    private var CategoriesNetflix = listOf(
        CategoriesOnlyNetflix.Ironman,
        CategoriesOnlyNetflix.Eldragon,
        CategoriesOnlyNetflix.Accidente,
        CategoriesOnlyNetflix.primeraVez
    )

    private lateinit var btnmando: AppCompatButton
    private lateinit var btnhome: AppCompatButton
    private lateinit var btnplayer: AppCompatButton
    private lateinit var btnuser: AppCompatButton
    private lateinit var punter: View


    private lateinit var rcViewMore : RecyclerView
    private lateinit var categoriesFlimsAdapter: CategoriesFlimsAdapter
    private lateinit var rcViewNetflix: RecyclerView
    private lateinit var categoriesOnlyNetflixAdapter: CategoriesOnlyNetflixAdapter
    private lateinit var rcPreferences: RecyclerView
    private lateinit var categoriesPreferencesAdapter: CategoriesPreferencesAdapter



    var isClickhome: Boolean = true
    var isClickgame: Boolean = false
    var isClicknew: Boolean = false
    var isClickuser: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_netflix)
        initComponents()
        initListerint()
        enterFullScreenMode()
        initUI()

    }

    private fun initUI() {
        categoriesFlimsAdapter = CategoriesFlimsAdapter(Categories)
        rcViewMore.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcViewMore.adapter = categoriesFlimsAdapter

        categoriesOnlyNetflixAdapter = CategoriesOnlyNetflixAdapter(CategoriesNetflix)
        rcViewNetflix.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcViewNetflix.adapter = categoriesOnlyNetflixAdapter

        categoriesPreferencesAdapter = CategoriesPreferencesAdapter(CategoriesMyPreferences)
        rcPreferences.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcPreferences.adapter = categoriesPreferencesAdapter
    }

    private fun enterFullScreenMode() {
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                )
    }

    private fun initComponents() {
        btnmando = findViewById(R.id.btnmando)
        btnhome = findViewById(R.id.btnhome)
        btnplayer = findViewById(R.id.bntplayer)
        btnuser = findViewById(R.id.btnuser)
        punter = findViewById(R.id.punter)
        rcViewMore = findViewById(R.id.rcViewMore)
        rcViewNetflix = findViewById(R.id.rcOnly)
        rcPreferences = findViewById(R.id.rcPreferences)

    }

    private fun initListerint() {
        btnhome.setOnClickListener {
            var isClickhome: Boolean = true
            if (isClickhome) {
                btnhome.setBackgroundResource(R.drawable.casa)
                btnmando.setBackgroundResource(R.drawable.mando)
                btnplayer.setBackgroundResource(R.drawable.playafter)
                punter.setBackgroundResource(R.drawable.btn19)
            } else {
                btnhome.setBackgroundResource(R.drawable.casaafter)
            }
        }

        btnmando.setOnClickListener {
            var isClickgame: Boolean = true
            if (isClickgame) {
                btnmando.setBackgroundResource(R.drawable.mandoclick)
                btnhome.setBackgroundResource(R.drawable.casaafter)
                btnplayer.setBackgroundResource(R.drawable.playafter)
                punter.setBackgroundResource(R.drawable.btn19)
            } else {
                btnmando.setBackgroundResource(R.drawable.mando)
            }
        }

        btnplayer.setOnClickListener {
            var isClicknew: Boolean = true
            if (isClicknew) {
                btnplayer.setBackgroundResource(R.drawable.playbefore)
                btnhome.setBackgroundResource(R.drawable.casaafter)
                btnmando.setBackgroundResource(R.drawable.mando)
                punter.setBackgroundResource(R.drawable.btn19)
            }

        }
        btnuser.setOnClickListener {
            var isClickuser: Boolean = true
            if (isClickuser) {
                punter.setBackgroundResource(R.drawable.btn18)
                btnhome.setBackgroundResource(R.drawable.casaafter)
                btnmando.setBackgroundResource(R.drawable.mando)
                btnplayer.setBackgroundResource(R.drawable.playafter)

            }
        }


    }
}