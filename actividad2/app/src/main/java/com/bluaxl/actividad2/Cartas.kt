package com.bluaxl.actividad2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class Cartas : AppCompatActivity(){
    lateinit var Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cards)
    }
    fun ButtonClick(view: View) {
        val image = findViewById<ImageView>(R.id.imageView)
        val numberCard = findViewById<TextView>(R.id.textViewNumberCard)

        val palos = arrayOf("Corazones", "Diamantes", "Treboles", "Picas")
        val valores = arrayOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey", "As")

        val paloAleatorio = palos.random()
        val valorAleatorio = valores.random()


        val nombreImagen = "${paloAleatorio.toLowerCase()}"

        val imagenId = resources.getIdentifier(nombreImagen, "drawable", packageName)

        if (imagenId != 0) {
            image.setImageResource(imagenId)
            numberCard.text = valorAleatorio.toString();
        }


        println("Carta aleatoria: $valorAleatorio de $paloAleatorio y nombre $nombreImagen")
    }
}