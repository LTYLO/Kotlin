package com.kash.polonia.Firts_App

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kash.polonia.R

class homeActivity : AppCompatActivity() {

    private val categories = listOf(
        TaskCategory.Business, TaskCategory.Other, TaskCategory.Personal
    )

    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var rcViewVertical: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        initComponents()
        initListeners()
        initUI()

    }

    private fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rcViewVertical = findViewById(R.id.rcViewVertical)

    }

    private fun initListeners() {

    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter
    }
}