package com.bluaxl.actividad1

class Banco {
    private var balance = 0.0

    fun consultarSaldo() {
        println("Saldo: $$balance")
    }

    fun depositarDinero(monto: Double) {
        if (monto > 0) {
            balance += monto
            println("Deposito Exitoso")
        } else {
            println("El monto debe ser mayor que cero para depositar.")
        }
    }

    fun retirarDinero(monto: Double) {
        if (monto > 0 && monto <= balance) {
            balance -= monto
            println("Retiro Exitoso")
        } else {
            println("Monto inválido o insuficiente para retirar.")
        }
    }

}


