# Sistema de Gestión Hospitalaria

Este proyecto es un sistema de gestión para un hospital que permite registrar empleados, médicos, pacientes y citas médicas, así como listar médicos por especialidad y pacientes atendidos por un médico específico.

## Requisitos

- **Kotlin**: Asegúrate de tener Kotlin instalado en tu entorno de desarrollo.
- **Java**: El proyecto también requiere Java para ejecutar Kotlin.

## Funcionalidades

El sistema ofrece las siguientes funcionalidades:

1. **Registrar Empleados**: Permite registrar empleados en el sistema ingresando su información personal, laboral, y otros datos relevantes.
2. **Registrar Médicos**: Registra médicos con información adicional como especialidad, servicio, y consultorio.
3. **Registrar Pacientes**: Permite registrar pacientes con sus datos personales y detalles médicos.
4. **Listar Médicos por Especialidad**: Busca y lista médicos según su especialidad.
5. **Listar Pacientes por Médico**: Lista los pacientes que han sido atendidos por un médico específico.
6. **Registrar Cita Médica**: Registra citas médicas entre pacientes y médicos, especificando el servicio y la fecha.
7. **Salir del Menú**: Cierra el programa.

## Cómo ejecutar el programa

1. **Compilar y ejecutar**: Puedes compilar y ejecutar el programa en tu IDE de preferencia que soporte Kotlin (por ejemplo, IntelliJ IDEA) o utilizando la línea de comandos.

2. **Interfaz de usuario**: El programa se ejecuta en la consola y guía al usuario a través de un menú interactivo.

### Ejemplo de Uso

Al iniciar el programa, se mostrará un menú con las opciones mencionadas anteriormente. A continuación se muestra un ejemplo de cómo se pueden utilizar algunas de estas opciones:

- **Registrar un Empleado**:
  - Se solicitará ingresar el DNI, nombre, apellido, fecha de nacimiento, dirección, ciudad de procedencia, código de empleado, número de horas extras, fecha de ingreso, área, y cargo del empleado.
  - Tras ingresar todos los datos, el empleado será registrado en el sistema.

- **Registrar un Paciente**:
  - Se solicitará el DNI, nombre, apellido, fecha de nacimiento, dirección, ciudad de procedencia, género, grupo sanguíneo, y medicamentos a los que es alérgico.
  - El paciente será registrado después de ingresar todos los datos.

- **Registrar una Cita Médica**:
  - Se pedirá el DNI del paciente, el DNI del médico, el servicio, y la fecha de la cita en formato `YYYY-MM-DDTHH:MM`.
  - Una vez ingresada toda la información, la cita será registrada en el sistema.

## Manejo de Errores

- El sistema maneja errores comunes como la entrada de datos incorrectos o incompletos. Por ejemplo, si se ingresa un género no válido, se asigna un valor por defecto.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o tienes sugerencias de mejoras, no dudes en crear un issue o un pull request.

## Licencia

Este proyecto está bajo la Licencia MIT. Para más detalles, consulta el archivo `LICENSE`.
