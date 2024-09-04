package org.example

import org.example.Clases.Audiolibro
import org.example.Clases.LibroElectronico
import org.example.Clases.MedioDigital
import java.util.Scanner


fun main() {
    val leerConsola = Scanner(System.`in`)

    /**
     * Se crea una lista mutable para almacenas la coleccion
     * aprovechando la herencia y con ello el polimorfismo
     * se puede agregar cualquier medio digital a la coleccion
     * sea libro electronico o audiolibro
     */
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
                /**
                 * Se piden los datos del medio digital a agregar
                 * y se agrega a travez de su respectiva clase
                 */
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
                        val yearPublicacion = leerConsola.nextLong()
                        print("Número de Páginas: ")
                        val numeroPaginas = readLine()?.toIntOrNull() ?: 0
                        val libro = LibroElectronico(titulo, autor, yearPublicacion, numeroPaginas)
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
                /**
                 * Se muestra la coleccion de medios digitales
                 * clasificados por el tipo de medio
                 */
                println(" ")
                println(" ")
                println("Colección:")
                println("Libros Electrónicos:")

                /**
                 * filterIsInstance
                 * devuelve una lista de datos de a coleccion
                 * que sean del tipo de dato especificado que se le pasa
                 *
                 * Se lleva el conteo del elemento de la coleccion
                 *
                 * y se muestran algunos datos de los medios digitales
                 */
                coleccion.filterIsInstance<LibroElectronico>().forEachIndexed { index, medio ->
                    println("${index + 1}. ${medio.titulo} - ${medio.autor}")
                }
                println(" ")
                println("Audiolibros:")
                val offset = coleccion.filterIsInstance<LibroElectronico>().size
                coleccion.filterIsInstance<Audiolibro>().forEachIndexed { index, medio ->
                    println("${index + 1 + offset}. ${medio.titulo} - ${medio.autor}")
                }
            }

            3 -> {
                /**
                 * Se muestra la coleccion de medios digitales
                 * de manera detallada, se llama el metodo mostrarInformacion
                 * el cual se encuentra en la clase padre MedioDigital
                 * pero se sobre escribe en las clases hijas LibroElectronico y Audiol
                 * esto es posible con polomorfismo
                 */
                println("Selecciona el número del medio para ver detalles:")

                /**
                 * forEachIndexed
                 * metodo permite recorrer una coleccion de datos
                 * y da el numero del indece de cada elemento de la coleccion
                 */
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

                /**
                 * Al igual que el metodo anterior se busca el medio digital
                 * y se remueve de la coleccion
                 */

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