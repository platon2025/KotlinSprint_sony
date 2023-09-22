package lesson_11

/** Created by Platon2025 */

fun main() {
    val user1 = User1(1, "garrypotter", "qwerty", "gpotter@gmail.com",)
    val user2 = User1(2, "erastfandorin", "gFde!Lk#$", "fandorin@yandex.ru",)

    println("id: ${user1.id}\nlogin: ${user1.login}\npassword: ${user1.password}\nemail: ${user1.email}")
    println()
    println("id: ${user2.id}\nlogin: ${user2.login}\npassword: ${user2.password}\nemail: ${user2.email}")

}