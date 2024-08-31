// src/main/kotlin/Clases/EmpleadoEventual.kt
package org.example.Clases

import java.time.LocalDate

class EmpleadoEventual(
    DNI: Long,
    nombre: String,
    apellido: String,
    fechaNacimiento: LocalDate,
    direccion: String,
    ciudadProcedencia: String,
    codigoEmpleado: Long,
    numeroHorasExtras: Int,
    fechaIngreso: LocalDate,
    area: String,
    cargo: String,
    val honorariosPorHora: Double,
    val numeroHorasTotales: Int,
    val fechaTerminoContrato: LocalDate
) : Empleado(
    DNI,
    nombre,
    apellido,
    fechaNacimiento,
    direccion,
    ciudadProcedencia,
    codigoEmpleado,
    numeroHorasExtras,
    fechaIngreso,
    area,
    cargo
){
    override fun toString(): String {
        return "${super.toString()}, EmpleadoEventual(honorariosPorHora=$honorariosPorHora, numeroHorasTotales=$numeroHorasTotales, " +
                "fechaTerminoContrato=$fechaTerminoContrato)"
    }
}