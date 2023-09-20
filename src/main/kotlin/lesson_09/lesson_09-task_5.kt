package lesson_09

/** Created by Platon2025 */

fun main() {
    val qty = 5
    var input: String
    val list: MutableList<String> = mutableListOf()

    println("Давайте введем $qty ингредиентов для вашего блюда")

    for (i in 0 until qty) {
        println("Введите ингредиент №${i + 1}")
        input = readln().lowercase().trim()
        while (input in list) {
            println("Ингредиент \"$input\" уже есть в списке\nВведите другой:")
            input = readln().lowercase().trim()
        }
        list.add(input)
    }

    list.sort()
    println("${list.joinToString(", ").replaceFirstChar { it.uppercase() }}.")
}