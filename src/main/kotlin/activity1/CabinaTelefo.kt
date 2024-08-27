package org.example.activity1

import java.util.Scanner
import kotlin.random.Random

/**
 * Un enum que facilita elegir entre las opciones
 */
enum class TipoLlamada(val costoMinuto: Int) {
    LOCAL(50),
    LARGADISTANCIA(350),
    CELULAR(150)
}

/**
 * Clase llamada que se le definen unas cracteristicas
 * se le definen unos comportamientos
 */
class Llamada(private val tipo: TipoLlamada, val duracion: Double) {
    fun costo(): Double {
        return tipo.costoMinuto * duracion
    }
}

/**
 * Clase Cabina de Telefono
 * Tiene como atributos un array de clases llamadas
 * Se definen comportamientos
 */
class CabinaTelefo(val id: Int) {
    private val llamadas = mutableListOf<Llamada>()

    fun registrarLlamada(tipo: TipoLlamada, duracion: Double) {
        llamadas.add(Llamada(tipo, duracion))
    }

    fun detalleInfo(): String {
        val totalLamdas = llamadas.size
        val duracion = llamadas.sumOf { it.duracion }
        val costo = llamadas.sumOf { it.costo() }

        return "Cabina numero $id: tiene un total de llamadas de $totalLamdas con un total de duracion de " +
                "$duracion y un costo total de $costo"
    }

    fun getTotalCost() = llamadas.sumOf { it.costo() }
    fun getTotalDuration() = llamadas.sumOf { it.duracion }
    fun getTotalCalls() = llamadas.size
}

fun Prueba() {

    val leer = Scanner(System.`in`)
    while (true) {
        val cabinas = mutableListOf<CabinaTelefo>()

        for (i in 1..10) {

            val cantidadLl: Int = Random.nextInt(1, 11)
            val cabina = CabinaTelefo(i)
            for (i in 0 until cantidadLl) {
                val randomDuracion: Double = Random.nextDouble(1.0, 59.0)
                var tipoLlamada: TipoLlamada? = null
                while (tipoLlamada == null) {
                    println("Ingrese el tipo de llamada (LOCAL, LARGADISTANCIA, CELULAR):")
                    val tipoInput = leer.nextLine().uppercase()
                    try {
                        tipoLlamada = TipoLlamada.valueOf(tipoInput)
                    } catch (e: IllegalArgumentException) {
                        println("Tipo de llamada no válido. Por favor, intente de nuevo.")
                    }
                }


                cabina.registrarLlamada(tipoLlamada, randomDuracion)

            }
            println(cabina.detalleInfo())
            cabinas.add(cabina)

        }

        val llamadaToCa = cabinas.sumOf { it.getTotalCalls() }

        val duracionToCa = cabinas.sumOf { it.getTotalDuration() }
        val costoToCa = cabinas.sumOf { it.getTotalCost() }
        val PromedicostoToCa = costoToCa / duracionToCa

        println("\n")
        println(
            "Todas las cabinas tuviron un total de llamadas de $llamadaToCa con una duracion " +
                    "de $duracionToCa y un costo total de $costoToCa \ncon un promedio de costo por minuto de " +
                    "$PromedicostoToCa\n"
        )

        println("Si desea reiniciar digite SI")
        val respuesta = leer.nextLine()
        if (respuesta != "SI") {
            break
        }
    }
}

