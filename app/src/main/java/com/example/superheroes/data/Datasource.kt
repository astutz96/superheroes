package com.example.superheroes.data

import com.example.superheroes.R
import com.example.superheroes.model.Superhero

class Datasource {

    fun loadSuperheroes(): MutableList<Superhero> {
        var heroes = mutableListOf<Superhero>()
        heroes.add(Superhero(R.string.hero1, R.string.description1, R.drawable.android_superhero1))
        heroes.add(Superhero(R.string.hero2, R.string.description2, R.drawable.android_superhero2))
        heroes.add(Superhero(R.string.hero3, R.string.description3, R.drawable.android_superhero3))
        heroes.add(Superhero(R.string.hero4, R.string.description4, R.drawable.android_superhero4))
        heroes.add(Superhero(R.string.hero5, R.string.description5, R.drawable.android_superhero5))
        heroes.add(Superhero(R.string.hero6, R.string.description6, R.drawable.android_superhero6))
        heroes.add(Superhero(R.string.hero1, R.string.description1, R.drawable.android_superhero1))
        heroes.add(Superhero(R.string.hero2, R.string.description2, R.drawable.android_superhero2))
        heroes.add(Superhero(R.string.hero3, R.string.description3, R.drawable.android_superhero3))
        heroes.add(Superhero(R.string.hero4, R.string.description4, R.drawable.android_superhero4))
        heroes.add(Superhero(R.string.hero5, R.string.description5, R.drawable.android_superhero5))
        heroes.add(Superhero(R.string.hero6, R.string.description6, R.drawable.android_superhero6))
        return heroes
    }
}