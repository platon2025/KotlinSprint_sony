package lesson_06

/** Created by Platon2025 */

fun main() {
    println("На сколько секунд ставим таймер?\nВведите число :")
    val time = readln().toInt()
    var count = time
    while (count > 0) {
        println("Осталось секунд: $count")
        Thread.sleep(1000)
        count--
    }
    println("Время вышло")
}