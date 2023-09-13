package lesson_05

/** Created by Platon2025 */

fun main() {
    val input: String
    val message: String
    val task = "Напиши математический пример на сложение двух положительных чисел (без пробелов)\nЦифры могут быть целыми или десятичными дробями"
    val example: List<String>
    var result = false

    println("Бот не сможет это сделать, а ты сможешь :\n$task")

    input = readln()
    if (!input.isEmpty()) {
        example = input?.split('+', '=')
        if (example.size == 3 && input.contains('+') && input.contains('=')) {
            if (example[0].toFloat() + example[1].toFloat() == example[2].toFloat()) {
                result = true
            }
        }
    }

    if (result) message = "\"Добро пожаловать!\""
    else message = "\"Доступ запрещен!\""

    println(message)

}