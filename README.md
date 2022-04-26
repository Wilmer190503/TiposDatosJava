# TIPOS DE DATOS EN JAVA

## JVM (Java Virtual Machine)

* Realiza una gestion eficiente de la memoria.
* Distrubiye la memoria en dos zonas: stack (pila) y heap(montón)

![RAM](/modelo/ram.jpeg.jpg)

### Stack
* Se almacenan variables locales, llamadas a métodos ( parametroa y resultados), variables primitivas, referencias a objetos del heap.
* Memoria estática.

### Heap
* Gestionado por el Garbage Collector.
* Espacio de memoria en tiempo de ejecución donde se registran los objetos.
* Memoria dinámica.
* No posee estructura de asignación de espacios.

### Variable
* Contenedor de memoria donde se almacena información.
* En java de declara con un tipo que se conservará durante doto su ciclo de vida en el interior de la app.
* La variable debe tener un nombre.
* Existen de tippo primitivo y referenciado.

## PRIMITIVOS
* Contenedores de tipo especifico, que almacenan valores y no tienen métodos.
* Ejemplos: boolean, char, byte, short, long, float, double.

## REFERENCIADOS
* Almacenan las referencias a los datos.
* Estos datos se escriben en una zona de memoria llamada heap.
* Accesible desde otras instancias de clase.
* Su ciclo de vida termina cuando no se necesita más.
* Mientras exista al menos una referencia activa en la zona de datos esta se mantendrá.
* Tan pronto como no haya más referencias, la zona se considera no utilizada y se procede a su destrucción por parte del Garbage collector.
* Un tipo referenciado uede no referenciar nada -> null.
* new: instanciación de una clase.  Reserva una dirección de un área de memoria.

### Variable de referencia.
* Caracteriza una instancia de clase, es decir la dirección de donde está el objeto.
* Contiene la dirección de un objeto, cuyo valor por defecto es null.
* Durante una prueba e igualdad entre dos variables por referencia, son las direcciónes de los objetos lo que se compara, y no el contenido de los objetos en si mismo.
* cuando se usa una referencia como argumento de un método es la dirección del objeto lo que se pasa, y no el objeto en si mismo.