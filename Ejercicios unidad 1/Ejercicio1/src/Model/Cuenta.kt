package Model

class Cuenta {
    var titular: String
        get() = titular
        set(value) {
            titular = value
        }
    var cantidad: Double?
        get() = cantidad
        set(value) {
            cantidad = value
        }

    override fun toString(): String {
        return "Titular:" + titular + " cantidad: " + cantidad
    }

    constructor(titular: String) {
        this.titular = titular
    }

    constructor(titular: String, cantidad: Double) {
        this.titular = titular
        this.cantidad = cantidad
    }

    fun Ingresar(cantidad: Double) {
        if (cantidad < 0) {
            return
        } else {
            this.cantidad = this.cantidad?.plus(cantidad);
        }
    }

    fun Retirar(cantidad: Double): Double? {
        if (cantidad > this.cantidad!!) {
            this.cantidad = 0.0
            return this.cantidad
        } else {
            this.cantidad = this.cantidad!! - cantidad
            return cantidad
        }
    }
}