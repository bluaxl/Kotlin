package com.bluaxl.actividad2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)

        val Username = findViewById<EditText>(R.id.editTextUser);
        val Password = findViewById<EditText>(R.id.editTextPassword);
        val Login = findViewById<Button>(R.id.buttonLogin);

        Login.setOnClickListener{
            if (Username.text.toString().equals("admin") && Password.text.toString().equals("Pass")){
                val intento = Intent(this, Menu::class.java)

                startActivity(intento)
            }else{
                Toast.makeText(this, "Datos Incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}