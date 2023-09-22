package lesson_11

/** Created by Platon2025 */

fun main() {
    val user = User2(1011, "petrov", "123321", "petrov@bashirov.ru")
    println("Добавьте информацию о себе: ")
    user.updateBio()
    user.printUserInfo()
    var message = "Дорогой ${user.login},\n"
    println("Введите текущий пароль: ")
    if (user.changePassword()) message += "Ваш пароль был успешно изменен на: ${user.password}"
    else message += "Ваш пароль не был изменен"
    message += "\nС наилучшими пожеланиями,\nАдминистрация Галактики"
    user.sendEmailToUser(message)

}

