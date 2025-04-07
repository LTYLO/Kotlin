package com.kash.polonia.Firts_App

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kash.polonia.R

class CategoriesViewHolder(view: View) :RecyclerView.ViewHolder(view){
    private val tvCagoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)

    fun render(taskCategory: TaskCategory){
        tvCagoryName.text = "Ejemplo"

        when(taskCategory){
            TaskCategory.Business -> {
                tvCagoryName.text = "Negocios"
            }
            TaskCategory.Other -> {
                tvCagoryName.text = "Otros"
            }
            TaskCategory.Personal -> {
                tvCagoryName.text = "Personal"
            }
        }
    }
}