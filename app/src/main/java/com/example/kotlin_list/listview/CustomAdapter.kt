package com.example.kotlin_list.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.kotlin_list.R

/**
 * Created by sgao on 18/11/2020 14:22
 **/
class CustomAdapter (context: Context, private val mListData: ArrayList<String>) :
    BaseAdapter() {
    private val mInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return mListData.size
    }

    override fun getItem(position: Int): Any {
        return mListData.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    class ViewHolder(){
        internal lateinit var mTextView: TextView
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val item = mListData[position]
        val mView: View
        val mHolder: ViewHolder
        if (convertView != null) {
            mView = convertView
            mHolder = convertView.tag as ViewHolder
        } else {
            mView = mInflater.inflate(R.layout.item_layout, parent, false)
            mHolder = ViewHolder()
            mHolder.mTextView = mView.findViewById(R.id.textView01)
            mView.tag = mHolder
        }
        mHolder.mTextView.text = (item)
        return mView
    }
}