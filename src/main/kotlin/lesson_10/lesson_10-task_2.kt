package lesson_10

/** Created by Platon2025 */

fun main() {
    println("Введите логин :")
    if (!validatePassword(readln())) return
    println("Введите пароль :")
    if (!validatePassword(readln())) return
    println("Ваши данные приняты. Добро пожаловать!")
}

fun validatePassword(word: String): Boolean {
    val minLength = 4
    if (word.length < minLength) {
        println("Логин или пароль недостаточно длинные")
        return false
    }
    return true
}