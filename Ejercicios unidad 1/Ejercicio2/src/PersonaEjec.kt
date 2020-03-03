import Model.Persona

var personas: MutableList<Persona> = mutableListOf()
fun main() {
    personas.add(Persona())

    menu()
}

fun menu() {
    println("Capturar getPersonas [1]")
    println("Ver Personas [2]")
    println("Salir [3]")
    val opc = readLine()
    if (opc != null) {
        Opcion(opc.toInt())

    } else {
        println("Error")
        menu()
    }
}

fun Opcion(op: Int) {
    when (op) {
        1 -> datos()
        2 -> MostrarPersonas()
        3 -> return
    }
}

fun datos() {

    println("Capture el nombre")
    var nombre = readLine()
    if (nombre != null) {
    } else {
        println("Error")
    }
    println("Capture la edad")
    var edad = readLine()
    if (edad != null) {
    } else {
        println("Error")
    }
    println("Capture el sexo")
    var sexo = readLine()
    if (sexo != null) {
    } else {
        println("Error")
    }
    println("Capture el peso puede ser 0")
    var peso = readLine()
    if (peso != null) {
        if (peso=="") {
            peso = null
        } else {
            peso = null
        }
    } else {
    }
    println("Capture el altura puede ser 0")
    var altura = readLine()
    if (altura != null) {
        if (altura=="") {
            altura = null
        } else {

        }
    } else {
    }

    if (altura == null && peso == null) {
        val nuevaPersona: Persona = Persona(
            nombre = nombre,
            edad = edad?.toInt(),
            sexo = sexo?.toCharArray()?.get(0)

        )
        personas.add(nuevaPersona)

    }
    else {
        val nuevaPersona: Persona = Persona(
            nombre = nombre,
            edad = edad?.toInt(),
            sexo = sexo?.toCharArray()?.get(0),
            peso = peso?.toDouble(),
            altura = altura?.toDouble()
        )
        personas.add(nuevaPersona)
    }
    menu()
}

fun MostrarPersonas() {
    if(personas.isEmpty()){
        println("No tiene getPersonas");
        readLine()
        menu()
    }
    else{
        personas.forEachIndexed { index, persona -> println(persona.toString()) }
        menu()
    }
}