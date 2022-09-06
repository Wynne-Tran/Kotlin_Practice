package com.example.kotlincrash.HackerRank

/*
business_names[] = { "burger king", "McDonald's", "super duper burger's", "subway", "pizza hut"}
searchTerm = "bur"
Output: ["burger king", "super duper burger's"]

 */
fun main() {
    val a = arrayOf("burger king", "McDonald's", "super duper burger's", "subway", "pizza hut")
    //val word = "bur"
    val word = "duper bur"
    val res = a.filter { it.contains(word) }
    val rep = mutableListOf<String>()
    a.map {
        if(it.contains(word)) {
            rep.add(it.replace(word, word.replace("[^\\s+]".toRegex(), "*")))
        }
        else{
            rep.add(it)
        }
    }
    println(res.toString())
    println(rep.toString())
}