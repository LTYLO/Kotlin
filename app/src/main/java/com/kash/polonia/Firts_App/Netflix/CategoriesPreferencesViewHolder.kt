package com.kash.polonia.Firts_App.Netflix

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kash.polonia.R

class CategoriesPreferencesViewHolder(view:View) : RecyclerView.ViewHolder(view) {

    private var imgPreferences : ImageView = view.findViewById(R.id.imgPreferences)

    fun render(categoriesPreferences: CategoriesPreferences){

        imgPreferences.setImageResource(R.drawable.rick_and_morty)

    }

}
