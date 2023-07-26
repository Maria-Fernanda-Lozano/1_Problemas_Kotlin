package com.Proyect.myappmj

fun main() {
    println("bienvenido, juega con nosotros en juegos craps")
    println("las reglas del juego son que si sacas con los dados los siguientes resultados ganas si no pierdes:")
    println("1. Un par de unos en los dados")
    println("2. Un total de 3 en los dados")
    println("3. Un total de 11 en los dados")
    println("4. Si se obtiene 2 o 12 en los dados")
    println("5. Un total de 7 en los dados")

    var dado1:Int= (1..6).random()
    var dado2:Int=(1..6).random()

    println("el resultado del dado1 es: $dado1")
    println("el resultado del dado2 es: $dado2")

    var result=dado1+dado2
    println("el resultado de la suma de los dos dados es: $result")

    when(result){
        2-> println("felicidaedes ganaste bebe")
        3->println("felicidaedes ganaste bebe")
        11->println("felicidaedes ganaste bebe")
        12->println("felicidaedes ganaste bebe")
        7->println("felicidaedes ganaste bebe")
        else-> println("perdiste bb:(")
    }
}