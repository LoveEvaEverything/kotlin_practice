package com.example.kotlin_list.thread

/**
 * Created by sgao on 25/11/2020 10:37
 **/
class CustomThread {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            testThread()
        }
        fun testThread()
        {
            Thread{ println("test") }.run()
            println("test02")
        }
    }

}