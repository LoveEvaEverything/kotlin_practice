package com.example.kotlin_list.listview

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.kotlin_list.KotlinApplication
import com.example.kotlin_list.R
import com.example.kotlin_list.dialog.CustomDialog
import com.example.kotlin_list.fragment.KotlinFragment

class MainActivity : AppCompatActivity() {

    private val mListData: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mListView: ListView = findViewById(R.id.recipe_list_view)
        setList(mListView)
        mListView.onItemClickListener = setOnClickListener()


//        DBGetter(this).db.execSQL("select * from Account")


//        KotlinApplication.getInstance.instance
//
//        val mDialog = CustomDialog(this)
//        mDialog.show()
        showFragment()
    }


    private fun setList(mListView: ListView){

        mListData.add("TEST 01")
        mListData.add("TEST 02")
        mListData.add("TEST 03")
        mListData.add("TEST 04")
        mListData.add("TEST 05")
        mListData.add("TEST 06")
        mListData.add("TEST 07")
        mListData.add("TEST 08")
        mListData.add("TEST 09")
        mListData.add("TEST 10")
        mListData.add("TEST 11")
        mListData.add("TEST 12")

        val mAdapter = CustomAdapter(this, mListData)
        mListView.adapter = mAdapter
    }

    private fun setOnClickListener(): AdapterView.OnItemClickListener {
        return AdapterView.OnItemClickListener{ _: AdapterView<*>, _: View, i: Int, _: Long ->
            val item = mListData[i]
            Toast.makeText(this, "Clicked ${i + 1} $item", Toast.LENGTH_SHORT).show()
        }
    }


    private fun showFragment(){
        val fragment: FragmentTransaction = supportFragmentManager.beginTransaction()
        val mKotlinFragment = KotlinFragment()
        fragment.add(R.id.frame_container01, mKotlinFragment).commit()


        val fragment02: FragmentTransaction = supportFragmentManager.beginTransaction()
        val mKotlinFragment02 = KotlinFragment()
        fragment02.add(R.id.frame_container02, mKotlinFragment02).commit()
    }

}