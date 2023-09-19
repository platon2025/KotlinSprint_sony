package lesson_08

/** Created by Platon2025 */

fun main() {
    println("Сколько ингредиентов в составе рецепта? Введите число :")
    val ingredientQty = readln().toInt()
    val contents = arrayOfNulls<String>(ingredientQty)

    for (i in 0 until ingredientQty) {
        if (i == 0) println("Введите первый ингредиент :")
        else if (i == ingredientQty - 1) println("Введите последний ингредиент :")
        else println("Введите следующий ингредиент :")
        contents[i] = readln()
    }

    var output = "Ваш состав ингредиентов: "
    for (i in contents) output += "$i, "
    println(output.substring(0, output.length - 2))

}