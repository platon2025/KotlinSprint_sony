package lesson_11

/** Created by Platon2025 */

fun main() {
    val user1 = User3(1, "Ruslan", "ruslan.png", "talking")
    val user2 = User3(2, "Ludmila", "luda.png", "micOff")
    val user3 = User3(3, "Oleg", "oleg.png", "muted")
    val user4 = User3(4, "Oxana", "oxana.png", "talking")
    val user5 = User3(5, "Valentin", "valentin.png", "muted")
    val user6 = User3(6, "Valentina", "valentina.png", "micOff")

    val room1 = Room3(1, "Red Room", "red_cover.png", mutableSetOf(user1, user2, user3))
    val room2 = Room3(2, "Green Room", "green_cover.png", mutableSetOf(user2, user3, user4))
    val room3 = Room3(3, "Orange Room", "orange_cover.png", mutableSetOf(user3, user4, user5))
    val room4 = Room3(4, "Black Room", "black_cover.png", mutableSetOf(user4, user5, user6))

    val rooms = setOf(room1, room2, room3, room4)

    rooms.forEach { it.showRoomInfo() }

}

class User3(
    val userId: Int,
    val userName: String,
    val userPic: String,
    var userStatus: String,
) {

    fun showUserInfo() {
        println("$userPic : $userName : $userStatus")
    }
}

class Room3(
    val roomId: Int,
    val roomName: String,
    val roomCover: String,
    var users: MutableSet<User3>,
) {

    fun showRoomInfo() {
        println("$roomName : $roomCover\nusers: ")
        users.forEach { it.showUserInfo() }
        println("\n--------------\n")
    }
}