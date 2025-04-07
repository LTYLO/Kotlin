package com.kash.polonia.Firts_App.Netflix

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kash.polonia.R

class CategoriesOnlyNetflixAdapter(private var Categories: List<CategoriesOnlyNetflix>) :
    RecyclerView.Adapter<CategoriesOnlyNetflixViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesOnlyNetflixViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.items_only_netflix,parent,false)
        return CategoriesOnlyNetflixViewHolder(view)
    }

    override fun getItemCount(): Int {
       return Categories.size
    }

    override fun onBindViewHolder(holder: CategoriesOnlyNetflixViewHolder, position: Int) {
        holder.rander(Categories[position])
    }

}