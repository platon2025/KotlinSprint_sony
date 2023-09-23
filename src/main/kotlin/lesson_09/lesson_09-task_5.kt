package lesson_09

/** Created by Platon2025 */

fun main() {
    val qty = 5
    var input: String
    val ingredients: MutableSet<String> = mutableSetOf()

    println("Давайте введем $qty ингредиентов для вашего блюда")

    do {
        println("Введите ингредиент :")
        ingredients.add(readln().lowercase().trim())
    } while (ingredients.size < qty)

    println("${ingredients.sorted().joinToString(", ").replaceFirstChar { it.uppercase() }}.")

}