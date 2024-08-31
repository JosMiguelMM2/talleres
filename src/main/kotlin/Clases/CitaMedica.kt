package org.example.Clases

import java.time.LocalDateTime

class CitaMedica(
    val paciente: Paciente,
    val medico: Medico,
    val servicio: String,
    val fecha: LocalDateTime
) {
    override fun toString(): String {
        return "CitaMedica(paciente=$paciente, medico=$medico, servicio='$servicio', fecha=$fecha')"
    }
}
