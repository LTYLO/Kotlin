package com.kash.polonia.Firts_App.Netflix

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kash.polonia.Firts_App.CategoriesViewHolder
import com.kash.polonia.R

class CategoriesFlimsAdapter(private var Categories: List<CategoriesRequest>) :
    RecyclerView.Adapter<CategoriesFlimsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesFlimsViewHolder {
    var view = LayoutInflater.from(parent.context).inflate(R.layout.item_flims_categories,parent,false)
        return CategoriesFlimsViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesFlimsViewHolder, position: Int) {
        holder.render(Categories[position])
    }

    override fun getItemCount(): Int {
        return Categories.size
    }

}