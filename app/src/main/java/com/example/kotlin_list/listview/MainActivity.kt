package com.example.kotlin_list.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.kotlin_list.R
import com.example.kotlin_list.database.DBGetter
import com.example.kotlin_list.dialog.CustomDialog

class MainActivity : AppCompatActivity() {

    private val mListData: ArrayList<String> = ArrayList();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mListView: ListView = findViewById(R.id.recipe_list_view);
        setList(mListView)
        mListView.onItemClickListener = setOnClickListener()


//        DBGetter(this).db.execSQL("select * from Account")


        val mDialog = CustomDialog(this)
        mDialog.show()
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
        return AdapterView.OnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
            val item = mListData.get(i)
            Toast.makeText(this, "Clicked $i $item", Toast.LENGTH_LONG).show()
        }
    }

}