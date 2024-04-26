import kotlin.math.PI
import kotlin.math.pow

open class Cylinder(private val r: Double,private val h: Double) : Figure() {
    override fun volume(): Double {
        return PI * r.pow(2) * h
    }

    override fun space(): Double {
        return PI * r.pow(2)
    }
}