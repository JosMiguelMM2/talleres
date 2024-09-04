package org.example.Clases

// Clase derivada para audiolibros
class Audiolibro(
    titulo: String,
    autor: String,
    yearPublicacion: Long,
    val narrador: String
) : MedioDigital(titulo, autor, yearPublicacion) {
    override fun mostrarInformacion() {
        println("Audiolibro -> Título: $titulo, " +
                "Autor: $autor, Año de publicación: $yearPublicacion, " +
                "Narrador: $narrador")
    }
}