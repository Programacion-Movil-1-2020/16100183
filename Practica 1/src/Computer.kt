public class Computer (){
    var Procesador:Int = 0
    var Grafica:Int=0
    var Ram:Int=0
    var NProcesador:String=""
    var NGrafica:String=""
    var NRam:String=""

    fun NombreProcesador() {
        when (Procesador) {
            1 ->NProcesador= "Intel i9"
            2 ->NProcesador= "Ryzen 7"
            3 ->NProcesador= "Pentium"
        }
    }
    fun NombreGrafica() {
        when (Grafica) {
            1 -> NGrafica ="2080Ti"
            2 ->NGrafica= "1050ti"
            3 -> NGrafica="Quadro rtx 4000"
        }
    }
    fun NombreRam(){
        when (Ram) {
            1 ->NRam ="8GB"
            2 -> NRam="4GB"
            3 -> NRam="16GB"
        }
    }

}