class ejemplo_Dataclass {
}data class Operacion(val n1: Double, val n2: Double)

class Operaciones(val n1: Double, val n2: Double)
fun suma(): Double {
    return n1 + n2
}
override fun toString(): String {
    return "Operaciones(n1=$n1, n2=$n2)"
}
var n1: Double = 0.0
    get() = field
    set(value) {
        field = value
    }
