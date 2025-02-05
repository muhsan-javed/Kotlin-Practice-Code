package kotlin_2025
class User(
    val name:String,
    val phone:String,
    val address:String){
    fun muhsan(){
        println(name)
        println(phone)
        println(address)
    }
}
fun main() {
    // DataTypes
    val number1: Int = 34
    val number2: Byte = 12
    val number3: Short = 104
    val number4: Long = 1080
    val number5: Float = 10.86F
    val marksInComputer: Double = 1786.55
    val ch: Char = 'J'
    val isActive : Boolean = true // false/true
    val userName:String = " Ahmed Ali"
    val message:String = "I miss someone ❤️😍"
    println(message)
    var myFriendsName = arrayOf("Ali Hyder", "Majid", "Uzair","shaib","shoaid")
    var facActivities = arrayOf("cricket", "chess", "music","ball","Reading book")
    facActivities[2]="Listen Music"
    println(facActivities[2])

    number2.toLong()
    number3.toFloat()

    val user1:User = User("Muhsan","0300176464","Qamber,PK")
    user1.muhsan() // Printing
    // User Details
    println(user1.name)
    println(user1.phone)
    println(user1.address)
    // Printing
}