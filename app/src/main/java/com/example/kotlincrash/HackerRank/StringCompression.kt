package com.example.kotlincrash.HackerRank

/**
 * 1.5
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become
 * a2b1c5a3. If the "compressed" string would not become smaller than the
 * original string, your method should return the original string.
 */

fun main() {

    val str = "aabcccccaaa"
    //val str = "ababbba"
    val res = compressString(str)
    print(res)
}

fun compressString(str: String): String {
    var count = 1
    if (str.length <= 1) return str
    val temp = mutableListOf<Char>()
    var result = ""
    for(i in str.indices) {
        if(temp.size == 0){
            temp.add(str[i])
            result += str[i]
        }
        else if(temp[temp.size - 1] == str[i]){
            ++count
            continue
        }
        else{
            temp.add(str[i])
            if(count > 1){
                result += count.toString()
            }
            result += temp[temp.size - 1]
            count = 1
        }
    }
    if(count > 1){
        return result + count.toString()
    }
    return result
}

