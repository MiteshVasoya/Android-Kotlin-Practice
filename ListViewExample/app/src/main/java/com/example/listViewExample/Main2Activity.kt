package com.example.listViewExample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var array = arrayOf("1", "2", "3", "4", "5")

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
    }
}
