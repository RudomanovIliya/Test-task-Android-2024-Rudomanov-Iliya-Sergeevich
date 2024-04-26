import kotlin.math.PI
import kotlin.math.pow

class Cone(private val r: Double, private val h: Double) : Cylinder(r, h) {

    override fun volume(): Double {
        return (1.0 / 3.0) * PI * r.pow(2) * h
    }
}