package org.example.Clases

import java.time.Duration
import java.time.LocalDateTime

class Hospital {
    private val empleados = mutableListOf<Empleado>()
    private val pacientes = mutableListOf<Paciente>()
    private val medicos = mutableListOf<Medico>()
    private val citasMedicas = mutableListOf<CitaMedica>()

    fun regitarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun registrarPaciente(paciente: Paciente) {
        pacientes.add(paciente)
    }

    fun registrarMedicos(medico: Medico) {
        medicos.add(medico)
    }

    private fun esMedicoDisponible(medico: Medico, fecha: LocalDateTime): Boolean {
        for (cita in citasMedicas) {
            if (cita.medico == medico) {
                val diferencia = Duration.between(cita.fecha, fecha).toMinutes()
                if (diferencia in -20..20) {
                    return false
                }
            }
        }
        return true
    }

    fun registrarCitaMedica(citaMedica: CitaMedica): Boolean {
        if (esMedicoDisponible(citaMedica.medico, citaMedica.fecha)) {
            citasMedicas.add(citaMedica)
            return true
        }
        return false
    }

    // Métodos para acceder a las listas privadas
    fun obtenerEmpleados(): List<Empleado> {
        return empleados
    }

    fun obtenerPacientes(): List<Paciente> {
        return pacientes
    }

    fun obtenerMedicos(): List<Medico> {
        return medicos
    }

    fun obtenerCitasMedicas(): List<CitaMedica> {
        return citasMedicas
    }

    fun listarMedicosPorEspecialidad(espcialidad: String): List<String> {
        return medicos.filter { it.especialidad == espcialidad }.map { it.toString() }
    }

    fun listarMedicosPorDNI(dniMedico: Long): Medico? {
        return medicos.find { it.DNI == dniMedico }
    }

    fun listarMedicosPorDNI2(dniMedico: Long): String {
        val medico = medicos.find { it.DNI == dniMedico }
        return medico?.toString() ?: "Medico no encontrado"
    }

    fun listarPacientesPorMedico(dniMedico: Long): List<Paciente> {
        val pacientesAtendidos = mutableListOf<Paciente>()
        for (cita in citasMedicas) {
            if (cita.medico.DNI == dniMedico) {
                pacientesAtendidos.add(cita.paciente)
            }
        }
        return pacientesAtendidos
    }

    fun buscarPacientePorDNI(dniPaciente: Long): Paciente? {
        return pacientes.find { it.DNI == dniPaciente }
    }

    override fun toString(): String {
        return "Hospital(empleados=$empleados, pacientes=$pacientes, medicos=$medicos, citasMedicas=$citasMedicas)"
    }
}