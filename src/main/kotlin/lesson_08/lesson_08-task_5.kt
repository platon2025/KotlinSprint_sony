package lesson_08

/** Created by Platon2025 */

fun main() {
    println("Сколько ингредиентов в составе рецепта? Введите число :")
    val ingredientQty = readln().toInt()
    val contents =
        Array<String>(ingredientQty) { "" }  //как в данном случае применить arrayOf я так и не разобрался. Сделал так.
        //можно еще использовать emptyArray<String>() , но он должен быть var чтобы потом добавлять в него contents +=

    for (i in 0 until ingredientQty) {
        if (i == 0) println("Введите первый ингредиент :")
        else if (i == ingredientQty - 1) println("Введите последний ингредиент :")
        else println("Введите следующий ингредиент :")
        contents[i] = readln()
    }

    println("Ваш состав ингредиентов: ${contents.joinToString(", ")}.")

}