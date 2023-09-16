package lesson_05

/** Created by Platon2025 */

const val MIN = 1
const val MAX = 100
fun main() {
    val secret1 = (MIN..MAX).random()
    var secret2: Int
    do {
        secret2 = (MIN..MAX).random()
    } while (secret2 == secret1)
    val secret = mutableSetOf(secret1, secret2)
    val winNumbers = secret.toString()
    var finalScore = 0

    println("Загадано два числа от 1 до 100\nУгадайте оба числа и получите ГЛАВНЫЙ ПРИЗ !")

    println("Сделайте первую ставку :")
    val bet1 = readln().toInt()
    var result = checkBet(bet1, secret)
    if (result) {
        secret.remove(bet1)
        finalScore++
    }
    println(getCommentOnResult(result))

    println("Сделайте вторую ставку")
    val bet2 = readln().toInt()
    result = checkBet(bet2, secret)
    if (result) {
        secret.remove(bet2)
        finalScore++
    }
    println(getCommentOnResult(result))

    val finalComment = when (finalScore) {
        2 -> "Поздравляем! Вы выиграли главный приз!"
        1 -> "Вы выиграли утешительный приз!"
        else -> "Неудача! Крутите барабан!"
    }

    println(finalComment)
    println("\nЗагаданные числа : $winNumbers")

}

fun checkBet(bet: Int, secret: Set<Int>): Boolean = secret.contains(bet)

fun getCommentOnResult(result: Boolean): String = if (result) "В яблочко !" else "Мимо"