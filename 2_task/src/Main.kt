fun main() {
    val list = readln().split(' ')
    println(list.groupingBy { it }.eachCount())
}