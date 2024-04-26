fun main() {
    val cone = Cone(3.0,5.0)
    println(cone.volume())
    println(cone.space())
    val rp = RectangularParallelepiped(3.0,5.0, 4.0)
    println(rp.volume())
    println(rp.space())
    val sphere = Sphere(3.0)
    println(sphere.volume())
    println(sphere.space())
}