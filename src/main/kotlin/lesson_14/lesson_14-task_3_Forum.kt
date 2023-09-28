package lesson_14

/** Created by Platon2025 */

fun main() {
    val message1 = Post(1, 1, "Это первый пост", "post", mutableListOf(2, 3, 4))
    val message2 = Comment(2, 2, "Это первый комментарий к первому посту", "comment", 1)
    val message3 = Comment(3, 3, "Это второй комментарий к первому посту", "comment", 1)
    val message4 = Comment(4, 4, "Это третий комментарий к первому посту", "comment", 1)
    val message5 = Post(5, 1, "Это второй пост", "post", mutableListOf(6, 7))
    val message6 = Comment(6, 2, "Это первый комментарий ко второму посту", "comment", 2)
    val message7 = Comment(7, 3, "Это второй комментарий ко второму посту", "comment", 2)
    val user1 = User(1, "Петя")
    val user2 = User(2, "Маша")
    val user3 = User(3, "Вася")
    val user4 = User(4, "Глаша")
    val forumPosts = mutableListOf(message1, message5)
    val forumComments = mutableListOf(message2, message3, message4, message6, message7)
    val forumUsers = mutableListOf(user1, user2, user3, user4)
    val forum = Forum(forumPosts, forumComments, forumUsers)

    forum.printForum(forumPosts, forumComments, forumUsers)
}

class Forum(postsList: MutableList<Post>, commentsList: MutableList<Comment>, authorsList: MutableList<User>) {
    fun printForum(forumPosts: MutableList<Post>, forumComments: MutableList<Comment>, forumUsers: MutableList<User>) {
        forumPosts.forEach {
            Post.printMessage(it, forumUsers)
            it.childMessagesId.forEach {
                val searchId = it
                val commentIndex = forumComments.indices.find { forumComments[it].id == searchId }
                if (commentIndex != null) Comment.printMessage(forumComments[commentIndex], forumUsers)
            }
        }

    }
}

class User(
    val userId: Int,
    val userName: String,
) {
    companion object {
        fun getUserNameById(userId: Int, forumUsers: MutableList<User>): String {
            val userIndex = forumUsers.indices.find { forumUsers[it].userId == userId } ?: -1
            return forumUsers[userIndex].userName ?: "[пользователь не определён]"
        }
    }
}

open class Message(
    val id: Int,
    val authorId: Int,
    val text: String,
    val type: String,
)

class Post(
    id: Int,
    authorId: Int,
    text: String,
    type: String,
    val childMessagesId: MutableList<Int>,
) : Message(id, authorId, text, "post") {

    companion object {
        fun printMessage(message: Message, forumUsers: MutableList<User>) {
            println("\nПост пользователя ${User.getUserNameById(message.authorId, forumUsers)}")
            println(message.text)
        }
    }

}

class Comment(
    id: Int,
    authorId: Int,
    text: String,
    type: String,
    val parentMessageId: Int,
) : Message(id, authorId, text, "comment") {
    companion object {
        fun printMessage(message: Message, forumUsers: MutableList<User>) {
            println("\n\tКомментарий пользователя ${User.getUserNameById(message.authorId, forumUsers)}")
            println("\t${message.text}")
        }
    }
}