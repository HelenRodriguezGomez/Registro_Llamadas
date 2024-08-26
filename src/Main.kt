//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Definición de la clase Operaciones
class Operaciones(val n1: Double, val n2: Double) {

    // Método para sumar n1 y n2
    fun suma(): Double {
        return n1 + n2
    }

    // Método toString para representar el objeto como una cadena de texto
    override fun toString(): String {
        return "Operaciones(n1=$n1, n2=$n2)"
    }
}

// Función principal para ejecutar el código
fun main() {
    // Crear una instancia de la clase Operaciones con valores específicos
    val op = Operaciones(50.0, 72.0)

    // Llamar al método suma y mostrar el resultado
    println("La suma es: ${op.suma()}")

    // Mostrar la representación en cadena de texto del objeto
    println(op.toString())
}
