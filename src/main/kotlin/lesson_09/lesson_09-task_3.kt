package lesson_09

/** Created by Platon2025 */

fun main() {
    val specification = listOf(2, 50, 15)
    println("Сколько порций омлета хотите приготовить?\nВведите число :")
    val qty = readln().toInt()
    val customized = specification.map { it * qty }
    println("Для $qty порций вам понадобится яиц – ${customized[0]}, молока – ${customized[1]}, сливочного масла – ${customized[2]}.")

}