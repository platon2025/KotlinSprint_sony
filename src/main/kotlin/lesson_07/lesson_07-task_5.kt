package lesson_07

/** Created by Platon2025 */

fun main() {
    val chars = ('0'..'9') + ('A'..'Z') + ('a'..'z')
    println("Введите желаемую длину пароля : ")
    val passwordLength = readln().toInt()

    var password = ""
    for (i in 1..passwordLength) {
        password += chars.random()
    }
    println("Пароль : $password")
}