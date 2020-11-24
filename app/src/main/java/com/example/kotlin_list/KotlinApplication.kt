package com.example.kotlin_list

import android.app.Application

/**
 * Created by sgao on 23/11/2020 12:15
 **/
class KotlinApplication: Application() {
    object getInstance {
        var instance = this
    }
    companion object{
        fun setData(){}

    }

    override fun onCreate() {
        super.onCreate()
    }
}