package lesson_06

/** Created by Platon2025 */

fun main() {
    var verify = false
    val login: String
    val password: String
    var loginGiven: String
    var passwordGiven: String

    println("Регистрация нового пользователя")
    println()
    println("Придумайте логин :")
    login = readln()
    println("Логин $login")
    println("Придумайте пароль :")
    password = readln()
    println("Отлично! Теперь вы можете авторизоваться.")
    Thread.sleep(1000)
    do {
        println("Введите логин :")
        loginGiven = readln()
        println("Введите пароль: ")
        passwordGiven = readln()
        if (loginGiven == login && passwordGiven == password) {
            verify = true
        } else println("Пользователь с указанными данными не найден.\nПопробуйте ещё раз")
    } while (!verify)

    println("Авторизация прошла успешно")
}