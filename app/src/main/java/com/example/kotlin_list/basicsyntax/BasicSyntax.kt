package com.example.kotlin_list.basicsyntax

/**
 * Created by sgao on 19/11/2020 10:23
 **/
class BasicSyntax {


    fun main() {
        fun printLength(obj: Any) {
            println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} ")
        }
        printLength("Incomprehensibilities")
        printLength(1000)
        printLength(listOf(Any()))
    }

    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }

        // `obj` is still of type `Any` outside of the type-checked branch
        return null
    }




    fun printArray(){
        val data = listOf("apple", "banana", "kiwifruit") as List
        for(index in data.indices)
        {
          print("the $index is ${data[index]}\n")
        }
    }


    fun stepNumber()
    {
        for(i in 10 downTo 1 step 2) {
            print(i)
        }

    }
}