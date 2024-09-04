package org.example.Clases

class LibroElectronico(
    titulo: String,
    autor: String,
    yearPublicacion: Long,
    val numeroPaginas: Int
) : MedioDigital(titulo, autor, yearPublicacion) {
    override fun mostrarInformacion() {
        println("Libro Electrónico -> Título: $titulo, Autor: $autor, Año de publicación: $yearPublicacion, " +
                "Número de páginas: $numeroPaginas")
    }
}