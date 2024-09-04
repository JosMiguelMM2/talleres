package org.example

import org.example.Clases.Audiolibro
import org.example.Clases.LibroElectronico
import org.example.Clases.MedioDigital
import java.util.Scanner


fun main() {
    val leerConsola = Scanner(System.`in`)
    val coleccion = mutableListOf<MedioDigital>()

    while (true) {
        println("Menú:")
        println("1. Agregar Medio")
        println("2. Mostrar Colección")
        println("3. Mostrar Información del Medio")
        println("4. Eliminar Medio")
        println("5. Salir")
        print("Elige una opción: ")
        val opcion = leerConsola.nextInt()
        when (opcion) {
            1 -> {
                println("Elige el tipo de medio a agregar:")
                println("1. Libro Electrónico")
                println("2. Audiolibro")
                print("Elige una opción: ")
                when (readLine()?.toIntOrNull()) {
                    1 -> {
                        print("Título: ")
                        val titulo = readLine() ?: ""
                        print("Autor: ")
                        val autor = readLine() ?: ""
                        print("Año de Publicación: ")
                        val añoPublicacion = leerConsola.nextLong()
                        print("Número de Páginas: ")
                        val numeroPaginas = readLine()?.toIntOrNull() ?: 0
                        val libro = LibroElectronico(titulo, autor, añoPublicacion, numeroPaginas)
                        coleccion.add(libro)
                    }

                    2 -> {
                        print("Título: ")
                        val titulo = readLine() ?: ""
                        print("Autor: ")
                        val autor = readLine() ?: ""
                        print("Año de Publicación: ")
                        val añoPublicacion = leerConsola.nextLong()
                        print("Narrador: ")
                        val narrador = readLine() ?: ""

                        val audiolibro = Audiolibro(titulo, autor, añoPublicacion, narrador)
                        coleccion.add(audiolibro)
                    }

                    else -> println("Opción no válida")
                }
            }

            2 -> {
                println("Colección:")
                println("Libros Electrónicos:")
                coleccion.filterIsInstance<LibroElectronico>().forEachIndexed { index, medio ->
                    println("${index + 1}. ${medio.titulo} - ${medio.autor}")
                }
                println("Audiolibros:")
                val offset = coleccion.filterIsInstance<LibroElectronico>().size
                coleccion.filterIsInstance<Audiolibro>().forEachIndexed { index, medio ->
                    println("${index + 1 + offset}. ${medio.titulo} - ${medio.autor}")
                }
            }

            3 -> {
                println("Selecciona el número del medio para ver detalles:")
                coleccion.forEachIndexed { index, medio ->
                    println("${index + 1}. ${medio.titulo} - ${medio.autor}")
                }
                val posicion = readLine()?.toIntOrNull()
                if (posicion != null && posicion in 1..coleccion.size) {
                    coleccion[posicion - 1].mostrarInformacion()
                } else {
                    println("Posición no válida")
                }
            }

            4 -> {
                println("Selecciona el número del medio para eliminar:")
                coleccion.forEachIndexed { index, medio ->
                    println("${index + 1}. ${medio.titulo} - ${medio.autor}")
                }
                val posicion = readLine()?.toIntOrNull()
                if (posicion != null && posicion in 1..coleccion.size) {
                    coleccion.removeAt(posicion - 1)
                    println("Medio eliminado")
                } else {
                    println("Posición no válida")
                }
            }

            5 -> {
                println("Saliendo...")
                break
            }

            else -> println("Opción no válida")
        }
        println()
    }
}