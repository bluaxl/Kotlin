package com.bluaxl.actividad2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class Banco : AppCompatActivity(){
    private var balance = 0.0
    private lateinit var balanceTextView: TextView
    private lateinit var amountEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_bank)

        balanceTextView = findViewById(R.id.balanceTextView)
        amountEditText = findViewById(R.id.amountEditText)

        val depositButton: Button = findViewById(R.id.depositButton)
        val withdrawButton: Button = findViewById(R.id.withdrawButton)

        depositButton.setOnClickListener {
            depositMoney()
        }

        withdrawButton.setOnClickListener {
            withdrawMoney()
        }
    }

    private fun updateBalanceText() {
        val decimalFormat = DecimalFormat("#.##")
        balanceTextView.text = "Balance: $${decimalFormat.format(balance)}"
    }

    private fun depositMoney() {
        val amount = amountEditText.text.toString().toDoubleOrNull()
        if (amount != null && amount > 0) {
            balance += amount
            updateBalanceText()
            amountEditText.text.clear()
        }
    }

    private fun withdrawMoney() {
        val amount = amountEditText.text.toString().toDoubleOrNull()
        if (amount != null && amount > 0 && amount <= balance) {
            balance -= amount
            updateBalanceText()
            amountEditText.text.clear()
        }
    }
}