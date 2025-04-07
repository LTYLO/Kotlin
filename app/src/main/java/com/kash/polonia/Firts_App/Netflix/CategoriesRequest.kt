package com.kash.polonia.Firts_App.Netflix

sealed class CategoriesRequest {
    object rick : CategoriesRequest()
    object avengers : CategoriesRequest()
    object strangerThings : CategoriesRequest()
    object gameOfThrones : CategoriesRequest()
    object breakingBad : CategoriesRequest()
    object theWitcher : CategoriesRequest()
    object moneyHeist : CategoriesRequest()
    object inception : CategoriesRequest()

}