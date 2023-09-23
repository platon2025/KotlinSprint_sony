package lesson_11

/** Created by Platon2025 */

fun main() {
    val user1 = User5(1, "garry", "qwerty", "gpotter@gmail.com")
    val user2 = User5(2, "erast", "123321", "fandorin@yandex.ru")
    val user3 = User5(3, "oleg", "555", "oleg@mail.ru")
    val users = mutableListOf(user1, user2, user3)

    val thread1 = Thread5(1, "Тема №1", 1, mutableListOf(1, 2, 3))
    val thread2 = Thread5(2, "Тема №2", 2, mutableListOf(4, 5, 6))
    val threads = mutableListOf(thread1, thread2)

    val message1 = Message5(1, 1, 1, "Тема №1", "Кто медведям лапы рвёт?")
    val message2 = Message5(2, 2, 1, "Re: Тема №1", "Зайчиков под дождь кладёт?")
    val message3 = Message5(3, 3, 1, "Re: Тема №1", "Танин мячик бросил в речку")
    val message4 = Message5(4, 1, 2, "Тема №2", "Изломал бычку дощечку")
    val message5 = Message5(5, 2, 2, "Re: Тема №2", "Каждый знает это кто")
    val message6 = Message5(6, 3, 2, "Re: Тема №2", "Это Агния Барто")
    val messages = mutableListOf(message1, message2, message3, message4, message5, message6)

    val forum = Forum5(users, threads, messages)

    println("Текущий список пользователей: ")
    forum.users.forEach { println(it.login) }

    println("\nРегистрация нового пользователя :")
    val user4 = forum.createNewUser()
    forum.userId = user4.id //Сразу же авторизовались

    println("Создан пользователь с параметрами :\nid: ${user4.id}, login : ${user4.login}, password: ${user4.password}, email: ${user4.email}")
    println("\nТекущий список пользователей: ")
    forum.users.forEach { println(it.login) }

    println("\nСообщения из ветки №1 :")
    forum.printThread(1)

    println("\nСообщения из ветки №2 :")
    forum.printThread(2)

    println("\nДобавление нового сообщения в ветку №2\nНапишите сообщение :")
    forum.createNewMessage(forum.userId, 2, "Re: Тема №2", readln())
    println("\nОбновлённые сообщения из ветки №2 :")
    forum.printThread(2)

}

class Forum5(
    val users: MutableList<User5>,
    private val threads: MutableList<Thread5>,
    private val messages: MutableList<Message5>,
    var userId: Int = 0, // получается при авторизации

) {
    fun createNewUser(): User5 {
        println("Введите логин: ")
        val userLogin = readln()
        println("Введите email: ")
        val userEmail = readln()
        println("Введите пароль: ")
        val userPassword = readln()

        val newUser = User5(getNewUserId(), userLogin, userPassword, userEmail)
        this.users.add(newUser)
        return newUser
    }

    fun createNewMessage(
        authorId: Int,
        threadId: Int,
        messageSubject: String,
        messageText: String,
    ) {

        val newMessageId = this.getNewMessageId()

        val newMessage = Message5(
            newMessageId,
            authorId,
            threadId,
            messageSubject,
            messageText,
        )
        addMessageToThread(threadId, newMessageId)
        this.messages.add(newMessage)
    }

    fun printThread(threadId: Int) {
        val threadIndex = getThreadIndexbyId(threadId)
        var message: Message5
        this.threads[threadIndex].threadMessages.forEach {
            message = getMessageById(it)
            val author = getUserById(message.messageAuthorId)
            println("${author.login} : ${message.messageText}")
        }
    }

    fun getThreadIndexbyId(threadId: Int): Int {
        threads.forEach {
            if (it.id == threadId) return threads.indexOf(it)
        }
        return 0
    }

    fun addMessageToThread(threadId: Int, messageId: Int) {
        threads[getThreadIndexbyId(threadId)].threadMessages.add(messageId)
    }

    fun getUserById(userId: Int): User5 {
        users.forEach {
            if (it.id == userId) return it
        }
        return users[0]
    }

    fun getMessageById(messageId: Int): Message5 {
        messages.forEach {
            if (it.id == messageId) return it
        }
        return messages[0]
    }

    private fun getNewUserId() = this.users.maxOf { it.id } + 1
    private fun getNewThreadId() = this.threads.maxOf { it.id } + 1
    private fun getNewMessageId() = this.messages.maxOf { it.id } + 1

}

class User5(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printUserInfo() {
        println("id: $id\nlogin: $login\npassword: $password\nemail: $email\nbio: $bio")
    }

    fun updateBio() {
        bio = readln()
    }

}

class Thread5(
    val id: Int,
    val threadSubject: String,
    val threadAuthorId: Int,
    val threadMessages: MutableList<Int>,
    val threadDate: Long = System.currentTimeMillis(),
) {

}

class Message5(
    val id: Int,
    val messageAuthorId: Int,
    val threadId: Int,
    val messageSubject: String,
    val messageText: String,
    val messageDate: Long = System.currentTimeMillis(),
    val messageViews: Int = 0,
) {

}