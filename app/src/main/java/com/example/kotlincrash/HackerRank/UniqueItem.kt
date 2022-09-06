package com.example.kotlincrash.HackerRank

class Meal(
    var cuisine: String,
    var dish: Array<String>
        ) {}

fun main(){
    val a = listOf(1, 2, 3, 4, 5, 5, 5, 1, 2)

    val u = a.distinct()

    print(u)

    val dictionary = listOf<Meal>(
        Meal("American", arrayOf("A", "B", "C", "D")),
        Meal("Mexico", arrayOf("A", "B", "C", "F")),
        Meal("Canada", arrayOf("A", "B", "C", "D")),
        Meal("Japan", arrayOf("A", "B", "C", "F")),
    )
    val temp = mutableSetOf<String>()
    var res  = listOf<Meal>()
    dictionary.forEach {
        if(!temp.contains(it.dish.contentToString())){
            temp.add(it.dish.contentToString())
            res = res + it
        }
    }
    res.forEach { println(it.cuisine) }
}