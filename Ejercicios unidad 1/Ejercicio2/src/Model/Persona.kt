package Model

import kotlin.math.pow

class Persona {

    constructor(){
        GenerarDNI()
    }

    constructor(nombre: String?, edad: Int?, sexo: Char?) {
        GenerarDNI()
        if (nombre != null) {
            this.nombre = nombre
        }
        if (edad != null) {
            this.edad = edad
        }
        if (sexo != null) {
            this.sexo = sexo
        }
    }

    constructor(nombre: String?, edad: Int?, sexo: Char?, peso: Double?, altura: Double?) {
        GenerarDNI()
        if (nombre != null) {
            this.nombre = nombre
        }
        if (edad != null) {
            this.edad = edad
        }
        if (sexo != null) {
            this.sexo = sexo
        }

        if (peso != null) {
            this.peso = peso
        }
        if (altura != null) {
            this.altura = altura
        }
    }


    var nombre:String=""
        set(value) {
            if (field == null) {
                field = ""
            } else {
                field = value
            }
        }
       get() = field
    var edad: Int=18
        get() = field
        set(value) {
            if (field == null) {
                field = 18
            } else {
                field = value
            }
        }
    var DNI: String = ""
        get() = field

    var sexo: Char='M'
        get() = field
        set(value) {
            if (field == null) {
                field = 'M'
            } else {
                field = value
            }
        }
    var peso: Double=50.0
        get() = field
        set(value) {
            if (field == null) {

                field = 50.0
            } else {
                field = value
            }
        }
    var altura: Double=1.0
        get() = field
        set(value) {
            if (field == null) {
                field = 1.0
            } else {
                field = value
            }
        }

    fun CalcularIMC(): Int {
        var IMC = this.peso / (this.altura.pow(2))
        if (IMC < 20) {
            return -1
        } else if (IMC >= 20 && IMC <= 25) {
            return 0
        } else if (IMC > 25) {
            return 1
        }
        return 0
    }

    fun esMayorDeEdad(): String {
        return if (this.edad >= 18) "Es mayor" else "Es menor"
    }

    fun comprobarSexo(sexo: Char) {
        if (sexo == 'H' || sexo == 'M') {

        } else {
            this.sexo = 'H'
        }
    }

    private fun GenerarDNI() {

        for (i in 1..8) {
            var x = (0..9).random()
            DNI += x.toString()
        }


    }

    override fun toString(): String {
        var resultado = ""

        if (this.CalcularIMC() == -1) {
            resultado = "peso ideal"
        } else if (this.CalcularIMC() == 0) {
            resultado = "bajo el peso ideal"
        } else {
           resultado= "sobre peso"
        }
        return "Persona: " + this.nombre + "\nEdad: " + this.edad + "\nDNI: " + DNI + "\nSexo: " + this.sexo + "\nPeso: " + this.peso + "\naltura: " + this.altura + "\nIMC: " + resultado + "\nMayor de edad: " + this.esMayorDeEdad()
    }
}