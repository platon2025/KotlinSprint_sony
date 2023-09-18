package lesson_06

/** Created by Platon2025 */

fun main() {
    val login: String
    val password: String
    var loginGiven: String
    var passwordGiven: String

    println("Регистрация нового пользователя\n\nПридумайте логин :")
    login = readln()
    println("Логин $login\n Придумайте пароль :")
    password = readln()
    println("Отлично! Теперь вы можете авторизоваться.")
    Thread.sleep(1000)
    do {
        println("Введите логин :")
        loginGiven = readln()
        println("Введите пароль: ")
        passwordGiven = readln()
        if (loginGiven != login || passwordGiven != password) {
            println("Пользователь с указанными данными не найден.\nПопробуйте ещё раз")
        }
    } while (loginGiven != login || passwordGiven != password)

    println("Авторизация прошла успешно")
}