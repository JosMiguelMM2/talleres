package org.example.Clases

import java.time.LocalDate

open class Persona(
    val DNI: Long,
    val nombre: String,
    val apellido: String,
    val fechaNacimiento: LocalDate,
    val direction: String,
    val cuidadProcedencia: String
) {
    override fun toString(): String {
        return "Persona(DNI=$DNI, nombre='$nombre', apellido='$apellido', fechaNacimiento=$fechaNacimiento, " +
                "direction='$direction', cuidadProcedencia='$cuidadProcedencia')"
    }
}