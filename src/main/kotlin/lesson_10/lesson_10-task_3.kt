package lesson_10

/** Created by Platon2025 */

fun main() {
    println("Введите желаемую длину пароля :")
    println("Ваш пароль: ${generatePassword(readln().toInt())}")
}

fun generatePassword(length: Int): String {
    val chars = ('0'..'9') + (' '..'/')
    var password = ""
    for (i in 1..length) password += chars.random()
    return password
}