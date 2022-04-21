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
