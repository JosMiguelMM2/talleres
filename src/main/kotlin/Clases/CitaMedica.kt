package org.example.Clases

import java.time.LocalDateTime

class CitaMedica(
    val paciente: Paciente,
    val medico: Medico,
    val servicio: String,
    val fecha: LocalDateTime,
    val hora: String
)
