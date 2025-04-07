package com.kash.polonia.Firts_App.Netflix

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kash.polonia.R

class CategoriesPreferencesAdapter(private var Categories: List<CategoriesPreferences>) :
    RecyclerView.Adapter<CategoriesPreferencesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesPreferencesViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.item_preferences,parent,false)
        return CategoriesPreferencesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return Categories.size
    }

    override fun onBindViewHolder(holder: CategoriesPreferencesViewHolder, position: Int) {
        holder.render(Categories[position])
    }


}