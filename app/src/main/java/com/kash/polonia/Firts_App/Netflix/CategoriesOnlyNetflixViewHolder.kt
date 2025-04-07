package com.kash.polonia.Firts_App.Netflix

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kash.polonia.R

class CategoriesOnlyNetflixViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val imgNetflix : ImageView = view.findViewById(R.id.imgNetflix)

    fun rander(categoriesOnlyNetflix: CategoriesOnlyNetflix){


            when(categoriesOnlyNetflix){
                CategoriesOnlyNetflix.Accidente -> {
                    imgNetflix.setImageResource(R.drawable.rick_and_morty)
                }
                CategoriesOnlyNetflix.Eldragon -> {
                    imgNetflix.setImageResource(R.drawable.rick_and_morty)
                }
                CategoriesOnlyNetflix.Ironman -> {
                    imgNetflix.setImageResource(R.drawable.rick_and_morty)
                }
                CategoriesOnlyNetflix.primeraVez -> {
                    imgNetflix.setImageResource(R.drawable.rick_and_morty)
                }
            }

    }


}