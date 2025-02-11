package kotlin_2025.oops.others

sealed class Ball

class RedBall(val color:String = "Red"): Ball(){

}

class GreenBall(val color:String = "Green"): Ball(){

}

class BlueBall(val color:String = "Blue"): Ball(){

}

fun main() {

    val value:Ball =RedBall("Orange")

    when(value)
    {
        is RedBall -> println("This is ${value.color} Ball")
        is GreenBall -> println("This is ${value.color} Ball")
        is BlueBall -> println("This is ${value.color} Ball")
        else -> println("Unknown Ball")  // Default case in sealed class
    }
}