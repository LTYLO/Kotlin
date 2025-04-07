package com.kash.polonia.Firts_App

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TaksAdapter(private var Categories: List<TaskCategory>) :
    RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return Categories.size
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}