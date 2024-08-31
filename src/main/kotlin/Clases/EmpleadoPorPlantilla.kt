// src/main/kotlin/Clases/EmpleadoPorPlanilla.kt
package org.example.Clases

import java.time.LocalDate

open class EmpleadoPorPlanilla(
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
    val salarioMensual: Double,
    val porceAdicPorHoraExtra: Double
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
) {
    override fun toString(): String {
        return "${super.toString()}, EmpleadoPorPlanilla(salarioMensual=$salarioMensual, porceAdicPorHoraExtra=$porceAdicPorHoraExtra)"
    }
}