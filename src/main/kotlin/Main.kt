package org.example

import org.example.Clases.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Scanner

fun main() {
    val leerConsola = Scanner(System.`in`)
    val hospital = Hospital()

    println("Bienvenido al Hospital")
    println("1- Registrar Empleados")
    println("2- Registrar Medicos")
    println("3- Registrar nuevos pacientes")
    println("4- Listar medico por especialidad")
    println("5- Listar pacientes por medico que los atendio")
    println("6- Registrar cita medica")
    println("7- Salir del menu")

    val opcion: Int = leerConsola.nextInt()
    while (true) {
        when (opcion) {
            1 -> {
                println("A continuacion registrara el empleado")
                println("Ingrese el DNI: ")
                val dni: Long = leerConsola.nextLong()

                println("Ingrese el nombre: ")
                val nombre: String = leerConsola.next()

                println("Ingrese el apellido: ")
                val apellido: String = leerConsola.next()

                println("Ingrese la fecha de nacimiento (YYYY-MM-DD): ")
                val fechaNacimiento: LocalDate = LocalDate.parse(leerConsola.next())

                println("Ingrese la dirección: ")
                val direccion: String = leerConsola.next()

                println("Ingrese la ciudad de procedencia: ")
                val ciudadProcedencia: String = leerConsola.next()

                println("Ingrese el código de empleado: ")
                val codigoEmpleado: Long = leerConsola.nextLong()

                println("Ingrese el número de horas extras: ")
                val numeroHorasExtras: Int = leerConsola.nextInt()

                println("Ingrese la fecha de ingreso (YYYY-MM-DD): ")
                val fechaIngreso: LocalDate = LocalDate.parse(leerConsola.next())

                println("Ingrese el área: ")
                val area: String = leerConsola.next()

                println("Ingrese el cargo: ")
                val cargo: String = leerConsola.next()

                val empleado = Empleado(
                    DNI = dni,
                    nombre = nombre,
                    apellido = apellido,
                    fechaNacimiento = fechaNacimiento,
                    direccion = direccion,
                    ciudadProcedencia = ciudadProcedencia,
                    codigoEmpleado = codigoEmpleado,
                    numeroHorasExtras = numeroHorasExtras,
                    fechaIngreso = fechaIngreso,
                    area = area,
                    cargo = cargo
                )

                hospital.regitarEmpleado(empleado)
            }

            2 -> {
                println("A continuación registrará al médico")

                println("Ingrese el DNI: ")
                val dni: Long = leerConsola.nextLong()

                println("Ingrese el nombre: ")
                val nombre: String = leerConsola.next()

                println("Ingrese el apellido: ")
                val apellido: String = leerConsola.next()

                println("Ingrese la fecha de nacimiento (YYYY-MM-DD): ")
                val fechaNacimiento: LocalDate = LocalDate.parse(leerConsola.next())

                println("Ingrese la dirección: ")
                val direccion: String = leerConsola.next()

                println("Ingrese la ciudad de procedencia: ")
                val ciudadProcedencia: String = leerConsola.next()

                println("Ingrese el código de empleado: ")
                val codigoEmpleado: Long = leerConsola.nextLong()

                println("Ingrese el número de horas extras: ")
                val numeroHorasExtras: Int = leerConsola.nextInt()

                println("Ingrese la fecha de ingreso (YYYY-MM-DD): ")
                val fechaIngreso: LocalDate = LocalDate.parse(leerConsola.next())

                println("Ingrese el área: ")
                val area: String = leerConsola.next()

                println("Ingrese el cargo: ")
                val cargo: String = leerConsola.next()

                println("Ingrese el salario mensual: ")
                val salarioMensual: Double = leerConsola.nextDouble()

                println("Ingrese el porcentaje adicional por hora extra: ")
                val porcentajeAdicionalPorHoraExtra: Double = leerConsola.nextDouble()

                println("Ingrese la especialidad: ")
                val especialidad: String = leerConsola.next()

                println("Ingrese el servicio: ")
                val servicio: String = leerConsola.next()

                println("Ingrese el número de consultorio: ")
                val numeroConsultorio: Int = leerConsola.nextInt()

                val medico = Medico(
                    DNI = dni,
                    nombre = nombre,
                    apellido = apellido,
                    fechaNacimiento = fechaNacimiento,
                    direccion = direccion,
                    ciudadProcedencia = ciudadProcedencia,
                    codigoEmpleado = codigoEmpleado,
                    numeroHorasExtras = numeroHorasExtras,
                    fechaIngreso = fechaIngreso,
                    area = area,
                    cargo = cargo,
                    salarioMensual = salarioMensual,
                    porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra,
                    especialidad = especialidad,
                    servicio = servicio,
                    numeroConsultorio = numeroConsultorio
                )

                hospital.registrarMedicos(medico)
            }

            3 -> {
                println("A continuación registrará al paciente")

                println("Ingrese el DNI: ")
                val dni: Long = leerConsola.nextLong()

                println("Ingrese el nombre: ")
                val nombre: String = leerConsola.next()

                println("Ingrese el apellido: ")
                val apellido: String = leerConsola.next()

                println("Ingrese la fecha de nacimiento (YYYY-MM-DD): ")
                val fechaNacimiento: LocalDate = LocalDate.parse(leerConsola.next())

                println("Ingrese la dirección: ")
                val direccion: String = leerConsola.next()

                println("Ingrese la ciudad de procedencia: ")
                val ciudadProcedencia: String = leerConsola.next()

                println("Ingrese el género (MASCULINO/FEMENINO): ")
                val genero: Genero = Genero.valueOf(leerConsola.next().toUpperCase())

                println("Ingrese el grupo sanguíneo: ")
                val grupoSanguineo: String = leerConsola.next()

                println("Ingrese los medicamentos alérgicos (separados por comas): ")
                val medicamentosAlergicos: List<String> = leerConsola.next().split(",")

                val paciente = Paciente(
                    DNI = dni,
                    nombre = nombre,
                    apellido = apellido,
                    fechaNacimiento = fechaNacimiento,
                    direction = direccion,
                    cuidadProcedencia = ciudadProcedencia,
                    nHistoria = genero,
                    grupoSanguin = grupoSanguineo,
                    medicamentosAlergicos = medicamentosAlergicos
                )

                hospital.registrarPaciente(paciente)
            }

            4 -> {
                println("Buscar un medico por especialidad")
                val especialidad: String = leerConsola.nextLine()
                println("El medico es ${hospital.listarMedicosPorEspecialidad(especialidad)}")
            }

            5 -> {
                println("Buscar pacientes por medico que los atencio")
                println("Ingrese el DNO del medico para listar los pacientes ")
                val dni = leerConsola.nextLong()
                println("Los pacientes atendidos por el medico con dni $dni son ${hospital.listarPacientesPorMedico(dni)}")
            }

            6 -> {
                println("A continuación registrará la cita médica")

                println("Ingrese el DNI del paciente: ")
                val dniPaciente: Long = leerConsola.nextLong()
                val paciente: Paciente? = hospital.buscarPacientePorDNI(dniPaciente)

                println("Ingrese el DNI del médico: ")
                val dniMedico: Long = leerConsola.nextLong()
                val medico: Medico? = hospital.listarMedicosPorDNI(dniMedico)

                println("Ingrese el servicio: ")
                val servicio: String = leerConsola.next()

                println("Ingrese la fecha de la cita (YYYY-MM-DDTHH:MM): ")
                val fecha: LocalDateTime = LocalDateTime.parse(leerConsola.next())

                println("Ingrese la hora de la cita: ")
                val hora: String = leerConsola.next()
                if (paciente != null && medico != null) {


                    val citaMedica = CitaMedica(
                        paciente = paciente,
                        medico = medico,
                        servicio = servicio,
                        fecha = fecha,
                        hora = hora
                    )
                    if (citaMedica != null) {
                        hospital.registrarCitaMedica(citaMedica)
                    }

                }

            }

            7 -> break
        }
    }
}