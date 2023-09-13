package lesson_05

/** Created by Platon2025 */

fun main() {
    val secret1 = 9
    val secret2 = 54

    val secret = mutableSetOf(secret1, secret2)
    var finalResult = 0

    println("Загадано два числа от 1 до 100\nУгадайте оба числа и получите ГЛАВНЫЙ ПРИЗ !")

    println("Сделайте первую ставку :")
    val bet1 = readln().toInt()
    var result = checkBet(bet1, secret)
    if (result) {
        secret.remove(bet1)
        finalResult++
    }
    println(getCommentOnResult(result))

    println("Сделайте вторую ставку")
    val bet2 = readln().toInt()
    result = checkBet(bet2, secret)
    if (result) {
        secret.remove(bet2)
        finalResult++
    }
    println(getCommentOnResult(result))

    val finalComment = when (finalResult) {
        2 -> "Поздравляем! Вы выиграли главный приз!"
        1 -> "Вы выиграли утешительный приз!"
        else -> "Неудача! Крутите барабан!"
    }

    println(finalComment)


}

fun checkBet(bet: Int, secret: Set<Int>): Boolean {
    return secret.contains(bet)
}

fun getCommentOnResult(result: Boolean): String {
    if (result) return "В яблочко !"
    else return "Мимо"
}