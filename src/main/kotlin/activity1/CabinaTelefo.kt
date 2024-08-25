package org.lpii.activity1

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
 * Clae llamada
 */
class Llamada(private val tipo: TipoLlamada, val duracion: Double) {
    fun costo(): Double {
        return tipo.costoMinuto * duracion
    }


}

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

fun clearConsole() {
    try {
        val os = System.getProperty("os.name").toLowerCase()
        if (os.contains("win")) {
            ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
        } else {
            ProcessBuilder("clear").inheritIO().start().waitFor()
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
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
                val ramdomTipo = TipoLlamada.entries.toTypedArray().random()
                cabina.registrarLlamada(ramdomTipo, randomDuracion)

            }

            println(cabina.detalleInfo())
            cabinas.add(cabina)

        }

        /*val cabina1 = CabinaTelefo(1)
        val cabina2 = CabinaTelefo(2)

        cabina1.registrarLlamada(TipoLlamada.LOCAL, 10.0)
        cabina1.registrarLlamada(TipoLlamada.LARGADISTANCIA, 5.0)
        cabina2.registrarLlamada(TipoLlamada.CELULAR, 20.0)

        cabinas.add(cabina1)
        cabinas.add(cabina2)

        println(cabina1.detalleInfo())
        println(cabina2.detalleInfo())*/


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
        }else{
            clearConsole()
        }

    }
}

