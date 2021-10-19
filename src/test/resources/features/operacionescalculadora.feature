#language: es

Característica: Ejecución de las operaciones básicas de una calculadora

  Como usuario que maneja constantemente una calculadora
  Quiero probar la correcta funcionalidad de las 4 operaciones basicas
  para garantizar un buen servicio de la aplicacion
  generando valor para los clientes que descarguen el producto.

  Esquema del escenario: Ejecutar las operaciones basicas de uso de una calculadora en un dispositivo movil emulado
  Dado que el usuario hace uso de la calculadora de un movil
  Cuando decide realizar una de las operaciones basicas
  | primerNumero   | segundoNumero   | operacion   |
  | <primerNumero> | <segundoNumero> | <operacion> |
  Entonces podria validar el resultado exacto de cada operacion
  | resultado   |
  | <resultado> |
  Ejemplos:
  | primerNumero | segundoNumero | operacion      | resultado |
  | 2            | 2             | suma           | 4         |
  | 5            | 2             | resta          | 3         |
  | 2            | 5             | multiplicacion | 10        |
  | 4            | 2             | division       | 2         |