// src/main/kotlin/Clases/Medico.kt
package org.example.Clases

import java.time.LocalDate

class Medico(
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
    salarioMensual: Double,
    porcentajeAdicionalPorHoraExtra: Double,
    val especialidad: String,
    val servicio: String,
    val numeroConsultorio: Int
) : EmpleadoPorPlanilla(
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
    cargo,
    salarioMensual,
    porcentajeAdicionalPorHoraExtra
)