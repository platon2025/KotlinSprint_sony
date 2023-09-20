package lesson_09

/** Created by Platon2025 */

fun main() {
    val listOfIngredients = mutableListOf("мука", "сахар", "яйцо")
    println("В рецепте есть базовые ингредиенты : ${listOfIngredients.joinToString(", ")}.\nЖелаете добавить ещё? ( Да / Нет)")
    if (readln().lowercase() != "да") return
    println("Какой ингредиент вы хотите добавить?")
    listOfIngredients.add(readln())
    println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString(", ")}.")

}