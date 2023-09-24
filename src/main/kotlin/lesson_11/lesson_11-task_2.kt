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

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printUserInfo() {
        println("id: $id\nlogin: $login\npassword: $password\nemail: $email\nbio: $bio")
    }

    fun updateBio() {
        bio = readln()
    }

/*  Иван, у меня вопрос по поводу функции changePassword() ниже
    А есть ли возможность при таком построении функции вставить что-то, например println("Введите текущий пароль: "),  в начало функции,
    чтоб оно выполнилось ещё до if ?
    Просто, по моей логике, этот приветственный println по хорошему должен быть тут, а не в основной фунции
    Но тогда у меня не получается обойтись без return в этой функции
*/

    fun changePassword(): Boolean = if (readln() == password) {
        println("Введите новый пароль: ")
        password = readln()
        println("Пароль успешно изменён")
        true
    } else {
        println("Неверный пароль")
        false
    }

    fun changePasswordWithoutReturnedAnything(){
        println("Введите текущий пароль: ")
        if (readln() == password) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменён")
        } else {
            println("Неверный пароль")
        }
    }

    fun sendEmailToUser(message: String) {
        println(message)
    }
}
