package lesson_08

/** Created by Platon2025 */

fun main() {
    //рецепт винегрета
    val contents = arrayOf("свёкла", "картофель", "морковь", "капуста", "масло")
    println("Какой ингредиент вы хотите проверить?")
    val search = readln()
    for (i in contents) {
        if (i == search) {
            println("Ингридиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}