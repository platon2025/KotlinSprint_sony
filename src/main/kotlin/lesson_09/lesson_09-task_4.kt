package lesson_09

/** Created by Platon2025 */

fun main() {
    val qty = 5
    println("Введите $qty ингредиентов, разделенных запятой,без пробелов")
    val list = readln().split(',')
    println(list.sorted())


}