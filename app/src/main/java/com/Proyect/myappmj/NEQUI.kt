var saldodisponible: Int = 4500
val registros = mutableListOf<Pair<Long, Long>>()

fun main() {
    var telefono: Long
    var pass: Long
    var opc: Int
    var retirar: Int
    var cajeropunto: Int
    var codConfirm: Int
    var telUsuario =
        mutableListOf<Long>(
            3023801778,
            3195837260,
            3013519220,
            3214243125,
            3224664740,
            3045495927
        )
    var enviar: Int
    var recarga: Int
    var salir: Int

    var intentosFallidos = 0

    while (intentosFallidos < 3) {
        println("Ingresa tu número de teléfono:")
        telefono = readLine()?.toLongOrNull() ?: continue

        val registro = registros.find { it.first == telefono }

        if (registro == null) {
            println("¡Número de teléfono no registrado! Regístrate:")
            println("Ingresa tu contraseña:")
            pass = readLine()?.toLongOrNull() ?: continue
            registros.add(Pair(telefono, pass))
            println("¡Registro exitoso! Tu número de teléfono y contraseña se han guardado.")
        } else {
            println("Ingresa tu contraseña:")
            pass = readLine()?.toLongOrNull() ?: continue
            if (registro.second == pass) {
                println("¡Contraseña correcta! Acceso permitido.")
                intentosFallidos = 0 // Reiniciar el contador de intentos fallidos si el inicio de sesión es exitoso
            } else {
                println("¡Contraseña incorrecta! Acceso denegado.")
                intentosFallidos++
                if (intentosFallidos >= 3) {
                    println("¡Has superado el límite de intentos! Salir del programa.")
                    return
                }
                continue
            }
        }

        println("¡¡¡Bienvenido!!!")
        println("Que deseas hacer:")
        println("1. Sacar dinero.")
        println("2. Enviar dinero.")
        println("3. Recargar dinero.")
        println("4. Salir.")
        opc = readLine()?.toIntOrNull() ?: 4

        // Resto del código existente...
        // ...

        println("deseas salir:")
        println("1. salir , 2. regresar al menu")
        salir = readLine()?.toIntOrNull() ?: 2

        if (salir == 1) {
            break // Salir del bucle principal si el usuario decide salir
        }
    }

    println("¡¡¡Que tengas un lindo día!!!")
}