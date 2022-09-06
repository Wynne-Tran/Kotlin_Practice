package com.example.kotlincrash

abstract class Animal (
    var name: String,
    var leg: Int = 4
 )
{
    init{
        println("Name: $name has $leg leg")
    }

    abstract fun makeSound()
}