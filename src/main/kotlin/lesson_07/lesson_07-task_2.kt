package lesson_07

/** Created by Platon2025 */

fun main() {
    var input: Int
    var oneTimePassword: Int
    val numberDiapasone = 1000..9999
    var success = false

    do {
        oneTimePassword = numberDiapasone.random()
        println("Ваш код авторизации : $oneTimePassword")
        println("Введите код :")
        input = readln().toInt()
        if (input == oneTimePassword) success = true
    } while (!success)
    println("Добро пожаловать")
}