package com.kash.polonia.Firts_App.Netflix

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.kash.polonia.R

class CategoriesFlimsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val img : ImageView = view.findViewById(R.id.img)

    fun render(categoriesRequest: CategoriesRequest) {


        when(categoriesRequest){
            CategoriesRequest.avengers -> {
                img.setImageResource(R.drawable.avengers)

            }
            CategoriesRequest.breakingBad -> {

                img.setImageResource(R.drawable.breaking)
            }
            CategoriesRequest.gameOfThrones -> {
                img.setImageResource(R.drawable.gamestron)
            }
            CategoriesRequest.inception -> {
                img.setImageResource(R.drawable.inception)
            }
            CategoriesRequest.moneyHeist -> {
                img.setImageResource(R.drawable.money)
            }
            CategoriesRequest.rick -> {
                img.setImageResource(R.drawable.rick_and_morty)
            }
            CategoriesRequest.strangerThings -> {
                img.setImageResource(R.drawable.stranger)
            }
            CategoriesRequest.theWitcher -> {
                img.setImageResource(R.drawable.stranger)
            }
        }


    }
}