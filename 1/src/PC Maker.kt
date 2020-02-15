
var computadoras:MutableList<Computer> = mutableListOf()
fun main(){
    menu()
}
fun menu(){
    println("Armar un equipo nuevo [1]")
    println("Ver Equipos armados [2]")
    println("Salir [3]")
    val opc= readLine()
    if (opc != null) {
        Opcion(opc.toInt())

    }else
    {
        println("Error")
        menu()
    }
}
fun Opcion(op:Int){
    when(op){
        1-> ArmarEquipo()
        2-> MostrarEquipo()
        3-> return
    }
}
fun ArmarEquipo() {
    var c :Computer= Computer()
    c.Procesador=Procesador()
    c.NombreProcesador()
    c.Grafica=Grafica()
    c.NombreGrafica()
    c.Ram=Ram()
    c.NombreRam()
    computadoras.add(c)
    println("Computadora con : \nProcesador:${c.NProcesador}\nTarjetaGrafica:${c.NGrafica}\nRAM:${c.NRam} \nAgregada")
    println("Teclee cualquier tecla para volver")
    readLine()
    menu()
}
fun Procesador():Int{
    println("Escoger Procesador")
    println("Intel i9 [1]")
    println("Ryzen 7 [2]")
    println("Pentium [3]")
    val proc=readLine()
    if (proc != null) {
        var rn= 1..3
        if(rn.contains(proc.toInt())) {
            return proc.toInt()
        }else{
            println("Opcion no valida intente de nuevo por favor")
            readLine()
           return Procesador()
        }
    }else
    {
        println("Error")
        Procesador()
    }
return 0
}
fun Grafica(): Int {
    println("Escoger Tarjeta grafica")
    println("2080 ti [1]")
    println("1050 ti [2]")
    println("Quadro rtx 4000 [3]")
    val graf=readLine()
    if (graf != null) {
        var rn= 1..3
        if(rn.contains(graf.toInt())) {
            return graf.toInt()
        }else{
            println("Opcion no valida intente de nuevo por favor")
            readLine()
           return Grafica()
        }
    }else
    {
        println("Error")
        Grafica()
    }
    return  0
}
fun Ram():Int{
    println("Escoger RAM")
    println("8GB [1]")
    println("4GB 7 [2]")
    println("16GB [3]")

    val ram=readLine()
    if (ram != null) {
        var rn= 1..3
        if(rn.contains(ram.toInt())) {
            return ram.toInt()
        }else{
            println("Opcion no valida intente de nuevo por favor")
            readLine()
            return Ram()
        }
    }else
    {
        println("Error")
        Ram()
    }
    return 0
}

fun MostrarEquipo(){
    if(computadoras.isEmpty()){
        println("No tiene Computadoras");
        readLine()
        menu()
    }
    else{
        computadoras.forEachIndexed { index, computer -> println("Computadora ${index+1}: \nProcesador:${computer.NProcesador}\nTarjetaGrafica:${computer.NGrafica}\nRAM:${computer.NRam} ")
        }
        println("Teclee cualquier tecla para volver")
        readLine()
        menu()
        }
}