import Model.Password


fun main() {

    menu()
}

fun menu() {
    println("Capturar cantidad de contrasenas")
    val cantidad = readLine()
    if (cantidad != null) {
        println("Captura la longitud")
        val longitud = readLine()
        if (longitud != null) {
            var contrasenas=Array(cantidad.toInt()){Password(longitud = longitud.toInt())}
            var fuertes=BooleanArray(cantidad.toInt())
            for (i in 0..contrasenas.size-1){
                contrasenas[i]= Password()
                fuertes[i]=contrasenas[i].esFuerte()
                println(contrasenas[i].contrasena + " " + fuertes[i].toString())
            }
        } else {
            println("Error")
            menu()
        }
    } else {
        println("Error")
        menu()
    }

}
