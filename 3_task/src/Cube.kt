import kotlin.math.pow

class Cube(private val a: Double) : Figure() {

    override fun volume(): Double {
        return a.pow(3)
    }

    override fun space(): Double {
        return a.pow(2)
    }
}