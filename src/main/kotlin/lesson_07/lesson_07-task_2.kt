package lesson_07

/** Created by Platon2025 */

fun main() {
    var input: Int
    var oneTimePassword: Int
    val numberDiapasone = 1000..9999

    do {
        oneTimePassword = numberDiapasone.random()
        println("Ваш код авторизации : $oneTimePassword")
        println("Введите код :")
        input = readln().toInt()
    } while (input != oneTimePassword)

    println("Добро пожаловать!")
}