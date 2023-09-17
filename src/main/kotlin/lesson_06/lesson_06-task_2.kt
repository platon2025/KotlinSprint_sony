package lesson_06

/** Created by Platon2025 */

fun main() {
    println("На сколько секунд ставим таймер? Введите число :")
    val time = readln().toInt()
    var counter = time
    while (counter > 0) {
        Thread.sleep(1000)
        counter--
    }
    println("Прошло $time секунд")
}