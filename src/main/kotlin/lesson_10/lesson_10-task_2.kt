package lesson_10

/** Created by Platon2025 */

fun main() {
    val minLength = 4
    println("Введите логин :")
    if (!validatePassword(readln(), minLength)) return
    println("Введите пароль :")
    if (!validatePassword(readln(), minLength)) return
    println("Ваши данные приняты. Добро пожаловать!")

}

fun validatePassword(word: String, minLength: Int): Boolean = if (word.length < minLength) {
    println("Логин или пароль недостаточно длинные")
    false
} else true