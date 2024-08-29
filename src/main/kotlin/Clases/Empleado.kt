package org.example.Clases

import java.time.LocalDate

open class Empleado(
    DNI: Long,
    nombre: String,
    apellido: String,
    fechaNacimiento: LocalDate,
    direccion: String,
    ciudadProcedencia: String,
    val codigoEmpleado: Long,
    val numeroHorasExtras: Int,
    val fechaIngreso: LocalDate,
    val area: String,
    val cargo: String
) : Persona(DNI, nombre, apellido, fechaNacimiento, direccion, ciudadProcedencia) {
    override fun toString(): String {
        return "Empleado(codigoEmpleado=$codigoEmpleado, numeroHorasExtras=$numeroHorasExtras, fechaIngreso=$fechaIngreso, area='$area', cargo='$cargo')"
    }
}
