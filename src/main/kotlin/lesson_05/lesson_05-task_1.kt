package lesson_05

/** Created by Platon2025 */

fun main() {
    val number1 = 7
    val number2 = 5

    val input: String
    val message: String
    val task = "Реши арифметический пример и введи ответ :"
    var result = false

    println(task)
    println("$number1 + $number2 = ")

    input = readln()
    if (!input.isEmpty()) result = number1 + number2 == input.toInt()

    if (result) message = "\"Добро пожаловать!\""
    else message = "\"Доступ запрещен!\""

    println(message)

}