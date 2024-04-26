fun main() {
    val newPosters = NewPosters()
    val testClass = TestClass("address")
    newPosters.subscribe(testClass)
    newPosters.postNews("test")
    newPosters.unsubscribe(testClass)
    newPosters.postNews("test1")
}