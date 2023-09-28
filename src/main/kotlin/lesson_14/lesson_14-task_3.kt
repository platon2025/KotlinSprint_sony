package lesson_14

/** Created by Platon2025 */

fun main() {
    val user1 = "Олег"
    val user2 = "Андрей"
    val message1 = "Are you guys gansters?"
    val message2 = "No. We are Russians!"

    val post = Message3(user1, message1)
    val comment = Comment3(user2, message2, post)

    post.printMessage()
    comment.printMessage()
}

open class Message3(
    val author: String,
    val text: String,
) {
    open fun printMessage() {
        println("Сообщение пользователя $author :\n$text")
    }
}

class Comment3(
    author: String,
    text: String,
    val parentMessage: Message3,

    ) : Message3(author, text) {
    override fun printMessage() {
        println("\nКомментарий к посту пользователя ${parentMessage.author}:\n${parentMessage.text}")
        println("\t$author написал : \n\t$text")
    }
}
