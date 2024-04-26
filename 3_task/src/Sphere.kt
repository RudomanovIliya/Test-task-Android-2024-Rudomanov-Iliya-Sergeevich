import kotlin.math.PI
import kotlin.math.pow

class Sphere(private val r: Double) : Figure() {
    override fun volume(): Double {
        return 4.0 / 3.0 * PI * r.pow(3)
    }

    override fun space(): Double {
        return 4 * PI * r.pow(2)
    }
}