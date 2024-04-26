fun main() {
    val array = readln().split(' ').map { it.toInt() }
    val arrayAns = Array(100) { 0 }

    run breaking@{
        array.forEach { item ->
            arrayAns[item] += 1
            if (arrayAns[item] == 2) {
                println(item)
                return@breaking
            }
        }
    }

    // Второй способ
    println()
    println(array.groupingBy { it }.eachCount().filter { it.value == 2 })
}