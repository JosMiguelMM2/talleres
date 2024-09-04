# Sistema de Gestión de Medios Digitales

## Problema 
Quiz linea III
Enunciado:
Desarrolla un sistema para administrar una colección de libros electrónicos y audiolibros. La colección contiene diferentes tipos de
medios, como libros electrónicos y audiolibros. Cada medio tiene atributos comunes como título, autor y año de publicación, pero cada
uno también tiene características específicas.

Crea una clase base MedioDigital que incluya propiedades como titulo, autor, y añoPublicacion. Además, define un método
mostrarInformacion() que será implementado por las clases derivadas para mostrar la información del medio de manera específica.

Implementa clases derivadas LibroElectronico y Audiolibro. La clase LibroElectronico debe incluir una propiedad adicional numeroPaginas,
y el método mostrarInformacion() debe mostrar un mensaje indicando el título, autor, año de publicación y el número de páginas. La clase
Audiolibro debe incluir una propiedad narrador, y el método mostrarInformacion() debe mostrar el título, autor, año de publicación y el
nombre del narrador.

Desarrolla un menú interactivo en la consola que permita al usuario realizar las siguientes operaciones:

Agregar Medio: El usuario puede elegir entre agregar un libro electrónico o un audiolibro. Luego, se le pedirá ingresar los datos
correspondientes para cada tipo de medio, y se añadirá a una lista en la colección.
Mostrar Colección: Muestra todos los medios en la colección, organizados por tipo (libros electrónicos primero, luego audiolibros).
Mostrar Información del Medio: Permite al usuario seleccionar un medio de la lista por su posición e invoca el método mostrarInformacion
() correspondiente para mostrar los detalles del medio seleccionado.
Eliminar Medio: Permite al usuario seleccionar un medio para eliminarlo de la lista.
Salir: Finaliza la ejecución del programa.
El menú debe ser cíclico, permitiendo al usuario realizar varias acciones hasta que decida salir.

Este proyecto en Kotlin implementa un sistema para administrar una colección de libros electrónicos y audiolibros. La colección permite agregar, mostrar, mostrar información detallada y eliminar medios digitales. Utiliza principios de programación orientada a objetos como herencia y polimorfismo.

## Estructura del Código

El código está compuesto por las siguientes clases y funciones:

### Clases

- **MedioDigital**: Clase base que representa un medio digital genérico.
  - **Propiedades**:
    - `titulo`: Título del medio.
    - `autor`: Autor del medio.
    - `añoPublicacion`: Año de publicación del medio.
  - **Método**:
    - `mostrarInformacion()`: Método abstracto que será implementado por las clases derivadas.

- **LibroElectronico**: Clase derivada de `MedioDigital` que representa un libro electrónico.
  - **Propiedades**:
    - `numeroPaginas`: Número de páginas del libro electrónico.
  - **Método**:
    - `mostrarInformacion()`: Implementa la visualización específica para libros electrónicos.

- **Audiolibro**: Clase derivada de `MedioDigital` que representa un audiolibro.
  - **Propiedades**:
    - `narrador`: Nombre del narrador del audiolibro.
  - **Método**:
    - `mostrarInformacion()`: Implementa la visualización específica para audiolibros.

### Función Principal

La función `main()` contiene un menú interactivo que permite al usuario realizar varias operaciones con la colección de medios digitales:

1. **Agregar Medio**: Permite al usuario agregar un libro electrónico o un audiolibro a la colección.
  - **Datos requeridos**:
    - Para un libro electrónico: título, autor, año de publicación y número de páginas.
    - Para un audiolibro: título, autor, año de publicación y narrador.

2. **Mostrar Colección**: Muestra todos los medios en la colección, organizados por tipo.
  - **Orden**:
    - Libros electrónicos primero.
    - Audiolibros después.

3. **Mostrar Información del Medio**: Permite al usuario seleccionar un medio por su número y muestra su información detallada utilizando el método `mostrarInformacion()`.

4. **Eliminar Medio**: Permite al usuario seleccionar un medio por su número y eliminarlo de la colección.

5. **Salir**: Finaliza la ejecución del programa.