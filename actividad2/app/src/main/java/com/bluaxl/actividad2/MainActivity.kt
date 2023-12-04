package com.bluaxl.actividad2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    // 0->nada; 1->suma; 2->resta; 3->mult; 4->div; 5->cos; 6->tan; 7->sin
    var oper: Int = 0
    var numero1: Double = 0.0
    lateinit var tv_num1: TextView
    lateinit var tv_num2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIgual: Button = findViewById(R.id.buttonEqual)
        val btnBorrar: Button = findViewById(R.id.buttonDelete)
        tv_num1 = findViewById(R.id.TextProcedure)
        tv_num2 = findViewById(R.id.TextResult)

        btnIgual.setOnClickListener {
            var num2 = tv_num2.text.toString().toDouble()
            var res = 0.0
            when (oper) {
                1 -> res = numero1 + num2
                2 -> res = numero1 - num2
                3 -> res = numero1 * num2
                4 -> res = numero1 / num2
                5 -> res = cos(Math.toRadians(numero1))
                6 -> res = tan(Math.toRadians(numero1))
                7 -> res = sin(Math.toRadians(numero1))
            }
            tv_num2.text = res.toString()
            tv_num1.text = ""
        }

        btnBorrar.setOnClickListener {
            tv_num1.text = ""
            tv_num2.text = ""
            oper = 0
        }
    }

    fun clicNumero(view: View) {
        var num2 = tv_num2.text.toString()

        when (view.id) {
            R.id.buttonN0 -> tv_num2.text = num2 + "0"
            R.id.buttonN1 -> tv_num2.text = num2 + "1"
            R.id.buttonN2 -> tv_num2.text = num2 + "2"
            R.id.buttonN3 -> tv_num2.text = num2 + "3"
            R.id.buttonN4 -> tv_num2.text = num2 + "4"
            R.id.buttonN5 -> tv_num2.text = num2 + "5"
            R.id.buttonN6 -> tv_num2.text = num2 + "6"
            R.id.buttonN7 -> tv_num2.text = num2 + "7"
            R.id.buttonN8 -> tv_num2.text = num2 + "8"
            R.id.buttonN9 -> tv_num2.text = num2 + "9"
            R.id.buttonPoint -> tv_num2.text = num2 + "."
        }
    }

    fun clicOperacion(view: View) {
        var num2 = tv_num2.text.toString()
        numero1 = num2.toString().toDouble()
        tv_num2.text = ""
        when (view.id) {
            R.id.buttonPlus -> {
                tv_num1.text = num2 + "+"
                oper = 1
            }
            R.id.buttonDecrese -> {
                tv_num1.text = num2 + "-"
                oper = 2
            }
            R.id.buttonMultiply -> {
                tv_num1.text = num2 + "*"
                oper = 3
            }
            R.id.buttonDivide -> {
                tv_num1.text = num2 + "/"
                oper = 4
            }
            R.id.buttonCos -> {
                tv_num1.text = "cos($num2)"
                oper = 5
            }
            R.id.buttonTan -> {
                tv_num1.text = "tan($num2)"
                oper = 6
            }
            R.id.buttonSin -> {
                tv_num1.text = "sin($num2)"
                oper = 7
            }
        }
    }
}
