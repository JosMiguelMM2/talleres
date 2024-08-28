package org.example.Clases

import java.time.LocalDate

enum class Genero {
    MASCULINO,
    FEMENINO
}

class Paciente(
    DNI: Long,
    nombre: String,
    apellido: String,
    fechaNacimiento: LocalDate,
    direction: String,
    cuidadProcedencia: String,
    val nHistoria: Genero,
    val grupoSanguin: String,
    val medicamentosAlergicos:List<String>
) : Persona(DNI, nombre, apellido, fechaNacimiento, direction, cuidadProcedencia) {
}