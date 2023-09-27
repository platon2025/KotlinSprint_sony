package lesson_13

/** Created by Platon2025 */

fun main() {
    val number: Long
    println("Введите номер телефона:")
    val input = readln()

    number = try {
        input.toLong()
    } catch (e: NumberFormatException) {
        println("Номер может содержать только цифры !")
        0
    }
    println(number)
}