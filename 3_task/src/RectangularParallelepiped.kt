class RectangularParallelepiped(private val a: Double, private val b: Double, private val h: Double) : Figure() {

    override fun volume(): Double {
        return a * b * h
    }

    override fun space(): Double {
        return a * b
    }
}