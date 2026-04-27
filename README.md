# TareaIntregadora_Cando_
# Sistema de Subsidio de Gasolina y Sistema Bancario en Java

Integrantes del grupo: Ivory Cando
Curso: GR1

## Descripción del proyecto

Este proyecto tiene como objetivo aplicar los principios fundamentales de la Programación Orientada a Objetos (POO) en Java mediante el desarrollo de dos sistemas:

### 1. Sistema de Subsidio de Gasolina

Se implementa una clase que representa a un solicitante de subsidio en Ecuador, evaluando si cumple con los requisitos establecidos:

* Ingresos mensuales ≤ $1200
* Máximo un vehículo registrado
* Residencia en Ecuador

Se aplican conceptos como:

* Encapsulamiento
* Uso de getters y setters
* Validaciones
* Métodos sobrecargados
* Lógica condicional

### 2. Sistema Bancario

Se desarrolla un sistema basado en:

* Herencia
* Abstracción
* Polimorfismo

Incluye diferentes tipos de cuentas:

* Cuenta de Ahorros
* Cuenta Corriente
* Cuenta de Inversión

Cada cuenta implementa su propio cálculo de interés mensual mediante polimorfismo, sin uso de estructuras condicionales para diferenciar tipos.

## Instrucciones para ejecutar el proyecto

1. Clonar el repositorio:

2. Abrir el proyecto en un IntelliJ IDEA.

3. Ubicar la clase `Main`.

4. Ejecutar el programa.

5. Ingresar los datos solicitados en consola para probar el sistema de subsidio.

6. Observar los resultados del sistema bancario en la salida del programa.

## Distribución de responsabilidades

* Integrante 1:

  * Desarrollo de la clase `SolicitanteSubsidio`
  * Implementación de validaciones y lógica del subsidio

* Integrante 2:

  * Desarrollo de la clase abstracta `CuentaBancaria`
  * Implementación de métodos comunes (depósito, retiro)

* Integrante 3:

  * Implementación de clases derivadas:

    * CuentaAhorros
    * CuentaCorriente
    * CuentaInversion
  * Cálculo de intereses y polimorfismo

* Integrante 4 (opcional):

  * Clase `Main`
  * Pruebas del sistema
  * Integración general del proyecto

## Evidencia de trabajo colaborativo

El repositorio incluye múltiples commits realizados por los integrantes del grupo, lo que permite evidenciar:

* Participación activa de cada miembro
* Desarrollo progresivo del proyecto
* Trazabilidad de cambios y aportes

Se utilizó control de versiones con GitHub para la gestión del proyecto.
