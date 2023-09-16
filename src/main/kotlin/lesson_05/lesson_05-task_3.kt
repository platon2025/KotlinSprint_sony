package lesson_05

/** Created by Platon2025 */

fun main() {
    val secret1 = 9
    val secret2 = 54

    val secret = mutableSetOf(secret1, secret2)
    var finalScore = 0

    println("Загадано два числа от 1 до 100\nУгадайте оба числа и получите ГЛАВНЫЙ ПРИЗ !")

    println("Сделайте первую ставку :")
    val bet1 = readln().toInt()
    var result = betChecker(bet1, secret)
    if (result) {
        secret.remove(bet1)
        finalScore++
    }
    println(getCommentOnBet(result))

    println("Сделайте вторую ставку")
    val bet2 = readln().toInt()
    result = betChecker(bet2, secret)
    if (result) {
        secret.remove(bet2)
        finalScore++
    }
    println(getCommentOnBet(result))

    val finalComment = when (finalScore) {
        2 -> "Поздравляем! Вы выиграли главный приз!"
        1 -> "Вы выиграли утешительный приз!"
        else -> "Неудача! Крутите барабан!"
    }

    println(finalComment)
}

fun betChecker(bet: Int, secret: Set<Int>): Boolean = secret.contains(bet)

fun getCommentOnBet(result: Boolean): String = if (result) "В яблочко !" else "Мимо"