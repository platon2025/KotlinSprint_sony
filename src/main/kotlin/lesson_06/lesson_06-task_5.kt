package lesson_06

/** Created by Platon2025 */
const val MIN_NUM = 1
const val MAX_NUM = 9
fun main() {
    var firstNum: Int
    var secondNum: Int
    var enter: Int
    var success = false
    var counter = 3

    println("Чтобы пройти антибот-проверку, реши арифметический пример и введи ответ :")

    do {
        firstNum = (MIN_NUM..MAX_NUM).random()
        secondNum = (MIN_NUM..MAX_NUM).random()
        println("$firstNum + $secondNum = ")
        enter = readln().toInt()
        if (firstNum + secondNum == enter) success = true
        if (success) println("Добро пожаловать!")
        else {
            counter--
            if (counter > 0) println("Давай еще раз попробуем")
        }
    } while (!success && counter > 0)
    if (!success) println("Доступ запрещен!")

}