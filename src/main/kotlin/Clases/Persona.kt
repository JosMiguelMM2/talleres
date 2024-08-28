package org.example.Clases

import java.time.LocalDate

open class Persona(
    val DNI: Long,
    val nombre: String,
    val apellido: String,
    val fechaNacimiento: LocalDate,
    val direction: String,
    val cuidadProcedencia: String
) {}