package com.example.listViewExample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var array = arrayOf("5", "4", "3", "2", "1")

        var adapter = ArrayAdapter(this, R.layout.listview_item, array)
        val listView:ListView = findViewById(R.id.listview)
        listView.setAdapter(adapter)

        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val itemValue = listView.getItemAtPosition(position) as String
                Toast.makeText(applicationContext, "$itemValue", Toast.LENGTH_SHORT).show()
            }
        }

        val changeButton:Button = findViewById(R.id.changeButton)
        val refreshButton:Button = findViewById(R.id.refreshButton)

        var i = 6;

        changeButton.setOnClickListener{
            array.set(0, ""+i++)

            Log.d("Main2Activity", "array:")
            for (element in array) {
                println(element)
            }
        }

        refreshButton.setOnClickListener{
            adapter.notifyDataSetChanged()
        }
    }
}
