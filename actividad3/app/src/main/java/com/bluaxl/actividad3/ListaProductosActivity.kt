package com.bluaxl.actividad3

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListaProductosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_productos)

        val productosList =
            intent.getStringArrayListExtra("productosList") ?: emptyList()

        val listView = findViewById<ListView>(R.id.listViewProductos)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, productosList)
        listView.adapter = adapter

        val btnCerrar = findViewById<Button>(R.id.btnCerrar)
        btnCerrar.setOnClickListener {
            finish()
        }
    }
}
