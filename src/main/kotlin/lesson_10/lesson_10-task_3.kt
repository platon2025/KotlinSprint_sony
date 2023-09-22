package lesson_10

/** Created by Platon2025 */

fun main() {
    println("Введите желаемую длину пароля:")
    println("Ваш пароль: ${generatePassword2(readln().toInt())}")

}

fun generatePassword2(length: Int): String {
    val numberChars = '0'..'9'
    val specialChars = ' '..'/'
    var password = ""
    for (i in 1..length) {
        if (i % 2 == 1) password += numberChars.random()
        else password += specialChars.random()
    }
    return password
}