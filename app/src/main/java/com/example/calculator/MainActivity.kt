package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun number(view: View)
    {
        if(view is Button)
        {
            result.append(view.text)
        }
    }
    fun operation(view: View)
    {
        if(view is Button)
        {
            result.append(view.text)
        }
    }

    fun equals(view: View) {

    }

    fun clear(view: View)
    {
        result.text = ""

    }
}
