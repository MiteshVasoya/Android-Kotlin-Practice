package com.example.listViewExample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var i: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
    }

    fun buttonclick(view: View) {
        findViewById<TextView>(R.id.textView).text = "Button click $i"
        i = i+1
    }

    fun goToSecondActivity(view: View) {
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
}
