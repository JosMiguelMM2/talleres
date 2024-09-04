package org.example.Clases

/**
 * Se crea la clase medios digitales
 */

open class MedioDigital(
    val titulo: String,
    val autor: String,
    val yearPublicacion: Long
) {
    open fun mostrarInformacion() {
        println("Título: $titulo, Autor: $autor, Año de Publicación: $yearPublicacion")
    }
}