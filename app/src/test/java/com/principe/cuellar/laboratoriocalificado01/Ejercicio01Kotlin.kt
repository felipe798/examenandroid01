package com.principe.cuellar.laboratoriocalificado01
// importamos la funcion para poder hacer la ejecucion en la consola
import org.junit.Test

class Ejercicio01Kotlin {


    // declaramos la funcion con main para declarar las variables que vamos a comparar

    @Test
    fun main() {
        // ejemplo de palabras
        val palabra1 = "listent"
        val palabra2 = "silent"
        val palabra3 = "hello"
        val palabra4 = "world"

        // aqui imprimimos en consola usando las $(palabra) para que se vean de verdad a que palabras hacen referencia
        println("¿Son '$palabra1' y '$palabra2' anagramas?: ${verificarAnagrama(palabra1, palabra2)}")
        println("¿Son '$palabra3' y '$palabra4' anagramas?: ${verificarAnagrama(palabra3, palabra4)}")
    }

    // funcion para verificar si son o no anagramas aqui llamamos a las variables
    private fun verificarAnagrama(palabra1: String, palabra2: String): Boolean {
        // con lowecase :convertimos ambas palabras a minúsculas para evitar problemas
        //con el tocharArray :comvertimos la palabra en una rreglo
        //con sorted :ordenamos alfaveticamanet el array para poder comprar si tieen las mismas letras
        return palabra1.lowercase().toCharArray().sorted() == palabra2.lowercase().toCharArray().sorted()
    }

}