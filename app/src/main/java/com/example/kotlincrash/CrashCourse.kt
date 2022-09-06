package com.example.kotlincrash

fun main() {
//    val number1 = readLine() ?: "0"
//    val number2 = readLine() ?: "0"
    // validation input
    //val result = number1.toInt() + number2.toInt()

//    val result = try {
//        number1.toInt() + number2.toInt()
//    } catch (e: Exception) { 0 }
//    println("result is $result")


    //listOf<>() is mutable
    val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex")
    print(shoppingList[1])

    //lambda function
    var countLength = shoppingList.count { currString ->
        currString.length > 5
    }
    println("countLength return $countLength")

    //create lambda function
    fun List<String>.customCount(function: (String) -> Boolean):Int {
        var counter = 0
        for(string in this){
            if(function(string)) { counter++ }
        }
        return counter
    }
    countLength = shoppingList.customCount { currString ->
        currString.length < 5
    }
    println("countLength return $countLength")

    //Using generic type
    fun <T>List<T>.customCount(function: (T) -> Boolean):Int {
        var counter = 0
        for(string in this){
            if(function(string)) { counter++ }
        }
        return counter
    }

    val newShoppingList = mutableListOf(1, 2, 3)

    countLength = newShoppingList.customCount { currString ->
        currString < 5
    }
    println("newShoppingList return $countLength")

    newShoppingList.add(5)
    newShoppingList.removeAt(0)
    newShoppingList[0] = 8
    print(newShoppingList)
    println()
    var count = newShoppingList.size - 1;
    while (count >= 0) {
        print(newShoppingList[count--])
        print(' ')
    }

    for(item in shoppingList) {
        print(item)
        print(' ')
    }

    for(i in 0 until newShoppingList.size){
        print(newShoppingList[i])
        print(' ')
    }

    when(val item = 2){
        in 1..newShoppingList.size -> println(newShoppingList[item])
        else -> {
            println("error")
        }
    }

    val dog = Dog()
    dog.makeSound()

    //Anonymous class
    //temporary class/object
    val bear = object : Animal("CananaBear", 2) {
        override fun makeSound() {
            println("Bibi")
        }
    }

    bear.makeSound()


    val originalMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    val filteredMap = originalMap.filterValues { it >= 2 }
    println(filteredMap) // {key2=2, key3=3}
    // original map has not changed
    println(originalMap) // {key1=1, key2=2, key3=3}

    val nonMatchingPredicate: (Int) -> Boolean = { it == 0 }
    val emptyMap = originalMap.filterValues(nonMatchingPredicate)
    println(emptyMap) // {}


    //FILTER
    val list = listOf(1,2,3,4,5) //read only list of collections(immutable).

    val selecteditems = list.filter { it < 4 }

    for (i:Int in selecteditems){
        println(i)
    }

    //MAP
    val transformedItems = list.map { it*it }

    for (i:Int in transformedItems){
        println(i)
    }

}