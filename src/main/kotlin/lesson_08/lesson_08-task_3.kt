package lesson_08

/** Created by Platon2025 */

fun main() {
    //рецепт винегрета
    val contents = arrayOf("свёкла", "картофель", "морковь", "капуста", "масло")
    val response: String
    println("Какой ингредиент вы хотите проверить?")
    val search = readln()
    if (contents.contains(search)) response = "Ингридиент $search в рецепте есть"
    else response = "Такого ингредиента в рецепте нет"
    println(response)
}