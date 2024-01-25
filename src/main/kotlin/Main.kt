/*
1. Crear una clase Person que tenga nombre, peso (en kg con decimales),
 altura (en metros con decimales) y su imc.
 */

/*
2. Crear un constructor primario con todos los atributos,
 excepto nombre e imc.
 Este último atributo se calcula en función del peso y la altura.
 Por tanto no se debe poder modificar, pero si consultar.
 */

/*
3. Crear un constructor secundario que también incluya el nombre
 de la persona cómo parámetro.
 */

/*
4. Implementa el método toString,
 representación del objeto en forma de String:
 override fun toString() = "". (Pulsa Ctrl+o)
 */

/*
5. En el main() a) crear 3 personas diferentes (la primera sin nombre)
 utilizando el constructor primario y secundario
 y b) mostrarlas por consola.
 A continuación, realizar lo siguiente:

Sobre la persona 1:
 a) modificar su nombre y para ello debes solicitarlo al usuario
  por consola.
  No puede ser nulo o vacio.
 b) Mostrar por consola sólo el nombre, peso y altura.

Sobre la persona 3:
 a) Mostrar el peso, altura y imc.
 b) Modificar la altura, por ejemplo a 1.80
 c) Mostrar el peso, altura y imc.

Sobre la persona 2:
 a) Modificar la altura para que tenga el mismo valor
  que la persona 3.
 b) Mostrar la persona 2 y persona 3.
 c) Comparar si las dos personas son iguales, y mostrar el resultado.
 d) Implementa el método equals():
  boolean (Pulsa Ctrl+o). e) Ejecutar la comparación.
 */

package org.example

fun main() {
    val person1 = Person(47.5, 1.77)
    val person2 = Person("Pepe", 83.12, 2.03)
    val person3 = Person("Josefa", 84.0, 1.55)

    println(person1.toString())
    Thread.sleep(3000)
    println(person2.toString())
    Thread.sleep(3000)
    println(person3.toString())
    Thread.sleep(3000)

    print("Introduce el nombre de la persona 1:")
    person1.name = readln().trim()
    println("Nombre: ${person1.name}\nPeso: ${person1.weight}\nAltura: ${person1.height}\n")
    Thread.sleep(3000)

    println("Peso: ${person3.weight}\nAltura: ${person3.height}\nIMC: ${person3.bmi}\n")
    Thread.sleep(3000)
    person3.height = 1.8
    println("Peso: ${person3.weight}\nAltura: ${person3.height}\nIMC: ${person3.bmi}\n")

    person2.height = person3.height
    println("Person 2: $person2\n")
    Thread.sleep(3000)
    println("Person 3: $person3\n")
    Thread.sleep(3000)
    println("Person 2 y Person 3 son ${if (person2 == person3) "iguales" else "distintas"}")

}