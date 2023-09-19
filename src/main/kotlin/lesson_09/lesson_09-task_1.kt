package lesson_09

/** Created by Platon2025 */

fun main() {
    // Рецепт блинов
    val contents = listOf("молоко", "вода", "мука", "яйцо", "масло", "соль", "сахар")
    println("В рецепте есть следующие ингредиенты : $contents")
    contents.forEach { println(it) }
}