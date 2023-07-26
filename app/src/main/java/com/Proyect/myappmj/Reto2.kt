package com.Proyect.myappmj

fun main() {

    var num1=1
    var total:Float=0.0F
    var descuento:Float=0.0f
    while (num1==1){
        println("Digite el nombre del producto")
        var nombre:String= readln()!!.toString()
        println("Digte el precio del producto")
        var precio:Float= readln()!!.toFloat()

        println("desea digitar otro producto 1 = si, 0 = no ")
        num1= readln()!!.toInt()
        total=precio+total
        println("el total es: "+total)
    }


    if (total>=50000){
        var bolita:Int=(1..4).random()
        println(bolita)
        if (bolita==1){
            println("felicidades has sacado la bolita roja")
            descuento=total/10.0f
            println(descuento)
            total=(total-descuento)

            println("el total de su compra actual es: "+total)
        }else if (bolita==2){
            println("felicidades has sacasado la bolita azul")
            descuento=total/30.0f
            println(descuento)
            total=(total-descuento)

            println("el total de su compra actual es: "+total)

        }else if (bolita==3){
            println(" que buena suerte has sacado la mejor bolita, la bolita amarilla")

            descuento=total/50.0f
            println(descuento)
            total=(total-descuento)

            println("el total de su compra actual es: "+total)

        }else if (bolita==4){
            println("has sacado bolita blanca")
            println("que mala suerte sacaste la que no tiene descuento")
            println("el total de su compra actual es: "+total)

        }
        println("con cuanto vas a pagar")
        var pago:Float= readln()!!.toFloat()

        var resultado=total-pago
        println("sus vueltas son: "+resultado)

    }
}