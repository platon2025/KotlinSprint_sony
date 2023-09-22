package lesson_11

/** Created by Platon2025 */

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