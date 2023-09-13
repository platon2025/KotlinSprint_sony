package lesson_05

/** Created by Platon2025 */

fun main() {
    val userMap = mapOf("Zaphod" to "PanGalactic", "Trillian" to "qwerty")

    println("Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\".")
    Thread.sleep(1000)
    println(" [вздыхает...] ")
    Thread.sleep(2000)
    println("Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.")
    Thread.sleep(1000)
    println("Да, вперед, пожалуйста, вводите свои данные...")
    val enterName = readln()
    val password: String? = userMap.get(enterName)
    if (password == null) {
        println("Вы ранее не были зарегистрированы. Необходимо пройти несложную систему регистрации")
        return
    }
    println("Введите пожалуйста ваш код доступа :")
    var enterPswd: String
    var checkResult = false

    while (!checkResult) {
        enterPswd = readln()
        if (enterPswd != password) println("К сожалению вы ошиблись при вводе пароля\nДавайте попробуем ещё раз")
        else checkResult = true
    }

    println("[вздыхает...]")
    Thread.sleep(100)
    println("Ваши данные проверены, и о, чудо, они верны...")
    println("Пользователь \"$enterName\", вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... ")
    Thread.sleep(2000)
    println("[меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.")


}