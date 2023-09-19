package lesson_07

/** Created by Platon2025 */

fun main() {
    val chars = ('0'..'9') + ('A'..'Z') + ('a'..'z')
    var password = ""
    println("Введите желаемую длину пароля : ")

    for (i in 1..readln().toInt()) password += chars.random()

    println("Пароль : $password")
}