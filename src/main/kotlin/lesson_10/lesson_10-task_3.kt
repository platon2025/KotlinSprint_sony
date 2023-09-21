package lesson_10

/** Created by Platon2025 */

fun main() {
    println("Введите желаемую длину пароля :")
    println("Ваш пароль: ${generatePassword(readln().toInt())}")

}

fun generatePassword(length: Int): String {
    val chars1 = '0'..'9'
    val chars2 = ' '..'/'
    var password = ""
    for (i in 1..length) {
        if (i % 2 == 1) password += chars1.random()
        else password += chars2.random()
    }
    return password
}