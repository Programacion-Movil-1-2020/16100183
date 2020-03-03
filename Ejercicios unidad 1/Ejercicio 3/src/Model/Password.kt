package Model

import kotlin.random.Random

class Password {
    constructor(

    ) {
        generarPassword()
    }

    constructor(longitud: Int) {
        this.longitud = longitud
        generarPassword()
    }

    var longitud: Int = 8
        set(value) {
            if (field == null) {
                field = 8
            } else {
                field = value
            }
        }
        get() = field
    var contrasena: String = ""
        get() = field

    fun esFuerte(): Boolean {
        var minusculas = 0
        var mayusculas = 0
        var numeros = 0
        for (c in contrasena) {
            if (c.toInt() in 97..122) {
                minusculas++
            } else if (c.toInt() in 65..90) {
                mayusculas++
            } else if (c.toInt() in 48..57) {
                numeros++
            }
        }

        return minusculas >= 1 && mayusculas >= 2 && numeros >= 5
    }

    fun generarPassword() {
        val alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
        for (i in 0..longitud+1) {
            var indice = Random.nextInt(0, alfabeto.length)
            contrasena += alfabeto[indice].toString()
        }
    }
}