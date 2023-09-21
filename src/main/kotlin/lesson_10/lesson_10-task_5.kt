package lesson_10

/** Created by Platon2025 */

fun main() {
    val loginMinLength = 4
    val passwordLength = 6
    var loginGiven: String
    var passwordGiven: String
    var accessCode: Int
    var codeGiven: Int

    println("Придумайте логин :")
    val login = readln()
    if (!validateLogin(login, loginMinLength)) return

    val password = generatePassword(passwordLength)
    println("Ваш пароль : $password")

    do {
        println("Введите логин :")
        loginGiven = readln()
        println("Введите пароль")
        passwordGiven = readln()
        if (loginGiven != login || passwordGiven != password) println("Введенные данные неверны, попробуйте еще раз")
    } while (loginGiven != login || passwordGiven != password)
    println("Проверка пароля пройдена!")

    do {
        accessCode = getAccessCode()
        println("Ваш код доступа $accessCode")
        println("Введите код :")
        codeGiven = readln().toInt()
        if (codeGiven != accessCode) println("Код введен неверно, попробуйте ещё раз")

    } while (codeGiven != accessCode)

    println("Авторизация пройдена успешно!")

}

fun validateLogin(login: String, loginMinLength: Int): Boolean {
    if (login.length < loginMinLength) {
        println("Логин должен быть не короче $loginMinLength символов")
        return false
    }
    return true
}

fun generatePassword(length: Int): String {
    val chars = ('a'..'z') + ('0'..'9')
    var password = ""
    for (i in 1..length) password += chars.random()
    return password

}

fun getAccessCode(): Int {
    return (1000..9999).random()
}
