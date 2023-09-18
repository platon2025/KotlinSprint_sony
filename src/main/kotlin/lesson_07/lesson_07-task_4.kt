package lesson_07

/** Created by Platon2025 */

fun main() {
    println("Сколько секунд будем засекать? Введите число :")
    var counter = readln().toInt()
    for (i in 0 until counter) {
        println("Осталось $counter секунд")
        counter--
        Thread.sleep(1000)
    }
    println("Время вышло")

}