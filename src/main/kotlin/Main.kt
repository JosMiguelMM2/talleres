package org.example

import org.example.Clases.Elecciones


fun main() {
    // Se predefinen los candidados debido a que el programa no requiere ponerlos desde la consola
    val eleccion = Elecciones()
    eleccion.agregarCandidato("Candidato 1")
    eleccion.agregarCandidato("Candidato 2")
    eleccion.agregarCandidato("Candidato 3")
    while (true) {
        println("\n--- Elecciones Municipio Premier ---")
        println("1. Votar por un candidato")
        println("2. Calcular el costo de campaña de un candidato")
        println("3. Vaciar urnas")
        println("4. Ver número total de votos")
        println("5. Ver porcentaje de votos por candidato")
        println("6. Ver costo promedio de campaña")
        println("7. Ver candidato ganador")
        println("8. Salir")
        print("Selecciona una opción: ")

        when (readln()?.toInt()) {
            1 -> {
                println("Selecciona un candidato (1, 2, 3): ")
                val candidatoIndex = readLine()?.toInt()?.minus(1) ?: -1
                val candidatos = eleccion.getCandidatos()
                if (candidatoIndex in candidatos.indices) {
                    println("Medio que influyó (internet, radio, tv): ")
                    val medio = readLine() ?: ""
                    eleccion.votar(candidatos[candidatoIndex], medio)
                } else {
                    println("Candidato inválido")
                }
            }

            2 -> {
                println("Selecciona un candidato (1, 2, 3): ")
                val candidatoIndex = readLine()?.toInt()?.minus(1) ?: -1
                val candidatos = eleccion.getCandidatos()
                if (candidatoIndex in candidatos.indices) {
                    println("El costo de campaña de ${candidatos[candidatoIndex].nombre} es: ${candidatos[candidatoIndex].costoCampania()}")
                } else {
                    println("Candidato inválido")
                }
            }

            3 -> {
                eleccion.vaciarUrnas()
                println("Urnas vaciadas")
            }

            4 -> {
                println("El número total de votos es: ${eleccion.totalVotos()}")
            }

            5 -> {
                val candidatos = eleccion.getCandidatos()
                candidatos.forEachIndexed { index, candidato ->
                    println("Porcentaje de votos de ${candidato.nombre}: ${eleccion.porcentajeVotos(candidato)}%")
                }
            }
            6 -> {
                println("El costo promedio de campaña es: ${eleccion.costoPromedioCampania()}")
            }
            7 -> {
                val ganador = eleccion.ganador()
                if (ganador != null) {
                    println("El candidato ganador es: ${ganador.nombre} con ${ganador.totalVotos()} votos")
                } else {
                    println("No hay votos registrados")
                }
            }
            8 -> return

            else -> println("Opcion no valida")
        }
    }

}