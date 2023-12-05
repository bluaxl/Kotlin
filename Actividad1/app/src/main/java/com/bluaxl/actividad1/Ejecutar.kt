package com.bluaxl.actividad1

class Ejecutar {
}

fun main() {
    val banco = Banco()
    while (true) {

        print("Seleccione una opción \n1.Consutar saldo \n2.Depositar \n3.Retirar \n4.Salir\nOpcion: ")
        var opcion = readln().toInt()
        when (opcion) {
            1 ->{
                println("Su saldo es:")
                banco.consultarSaldo()
            }
            2 -> {
                println("Ingrese la cantidad a depositar: ")
                val montoDeposito = readln().toDouble()
                banco.depositarDinero(montoDeposito)
            }
            3 -> {
                println("Ingrese la cantidad a retirar: ")
                val montoRetiro = readln().toDouble()
                banco.retirarDinero(montoRetiro)
            }
            4 -> {
                println("Saliendo del programa.")
                return
            }
            else -> {
                println("Opción no válida. Inténtelo de nuevo.")
            }
        }
    }
}