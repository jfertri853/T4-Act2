package org.example

class Person(weight: Double, height: Double) {

    var weight = verifyWeight(weight)
        set(value) {
            field = verifyWeight(value)
        }

    private fun verifyWeight(weight: Double): Double {
        return if (weight <= 0) {
            1.0
        } else {
            weight
        }
    }


    var height: Double = verifyHeight(height)
        set(value) {
            field = verifyHeight(value)
        }

    private fun verifyHeight(height: Double): Double {
        return if (height <= 0) {
            1.0
        } else {
            height
        }
    }


    var name: String? = null
        set(value) {
            field = verifyName(value)
        }

    private fun verifyName(name: String?): String {
        return if (name!!.isBlank()) {
            "Sin nombre"
        } else {
            name
        }
    }


    val bmi: Double
        get() = calculateBMI(this.weight, this.height)

    private fun calculateBMI(weight: Double, height: Double): Double {
        return weight / (height * height)
    }

    constructor(name: String, weight: Double, height: Double): this(weight, height) {
        this.name = verifyName(name)
    }

    override fun toString(): String {
        return "Nombre: $name\nPeso: $weight\nAltura: $height\nIMC: $bmi\n"
    }

    override fun equals(other: Any?): Boolean {
        var areEquals = true

        if (other is Person) {
            if (this.name != other.name) {areEquals = false}
            else if (this.weight != other.weight) {areEquals = false}
            else if (this.height != other.height) {areEquals = false}
        }

        return areEquals
    }

    // Modificado para no generar hashCode de la propiedad bmi,
    // no es necesario porque si weight y height son iguales generan siempre el mismo bmi
    override fun hashCode(): Int {
        var result = weight.hashCode()
        result = 31 * result + height.hashCode()
        result = 31 * result + (name?.hashCode() ?: 0)
        return result
    }

}