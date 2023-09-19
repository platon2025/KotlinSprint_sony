package lesson_09

/** Created by Platon2025 */

fun main() {
    val ingredient = listOf("яйцо", "молоко", "сливочное масло")
    val perPortion = listOf(2, 50, 15)
    val unit = listOf("шт", "мл", "гр")

    println("Сколько порций омлета хотите приготовить?\nВведите число :")
    val qty = readln().toInt()
    var output = "Для $qty порций вам понадобится: "
    for (i in 0 until ingredient.size) output += "${ingredient[i]} - ${perPortion[i] * qty} ${unit[i]}, "

    println(output.substring(0, output.length - 2))
}