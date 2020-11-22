package com.example.kotlin_list.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.kotlin_list.R

/**
 * Created by sgao on 23/11/2020 09:13
 **/
class CustomDialog(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_layout)
        val button= findViewById<Button>(R.id.test_button)
        button.setOnClickListener {
            Toast.makeText(context, button.text, Toast.LENGTH_SHORT).show()
            this.dismiss()
        }
    }
}