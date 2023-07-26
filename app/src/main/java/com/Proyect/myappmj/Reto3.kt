package com.Proyect.myappmj

fun main() {
    var opcion=0
    var opcion2=0
    val carros= mutableListOf("mercedez benz","ford", "chebrolec","ferrari")
    var opcion3=0
    var eliminar=0
    while (opcion3==0) {
        println("bienvenido nuestra pagina de carros lujosos y solo pa ti bb ")
        println("elija la opcion dee 1 a 5 dependiendo de lo que quiere hacer")
        println("1. insertar nuevos autos")
        println("2. mostar todos los datos de la lista")
        println("3. buscar un carro en particular")
        println("4. modificar un vehiculo existente")
        println("5. eliminar un vehiculo existente")
        opcion = readln()!!.toInt()
        if (opcion == 1) {
            while (opcion2 == 0) {
                println("digite el nombre del carro")
                var nom: String = readln()!!.toString()
                carros.add(nom)


                println("digite 0 si quiere seguir insertando nombres si, no digite 1")
                opcion2 = readln()!!.toInt()
            }
            println("los carros resgitadro son: " + carros)
        } else if (opcion == 2) {
            println("Aqui estan todos los carros regitrados")
            for ((index, element) in carros.withIndex()) {
                println("la mascota No. $index es $element")
            }
        } else if (opcion == 3) {
            println("¿que auto desea buscar?")
            var buscarCar: Int = readln()!!.toInt()

            println("el carro buscado es: ${carros.get(buscarCar)}")
        }else if (opcion==4){

            println("digite el vehiculo que desea actualizar")
            var numvVehiculo:Int= readln()!!.toInt()
            println("el veiculo que ha seleccionado es: "+carros[numvVehiculo])
            println("digite el nuevo nombre")
            var nombreNuevo:String= readln()!!.toString()
            carros[numvVehiculo]=nombreNuevo


        }else if (opcion==5){
            println("que vehiculo le gustaria eliminar")
            eliminar= readln()!!.toInt()
            carros.removeAt(eliminar)
        }
        println("¿le gustaria seguir en el sistema?")
        println("si quiere seguir digite 0 y si no quiere seeguir digite 1")
        opcion3= readln()!!.toInt()
    }
    if (opcion3==1){
        println("hasta luego, pronto volveras a utilizarme")
    }
}