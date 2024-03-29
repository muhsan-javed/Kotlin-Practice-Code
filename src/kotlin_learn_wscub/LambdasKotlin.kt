package kotlin_learn_wscub


fun main() {

    /*
              ********************  Lambdas Kotlin *********************************
    => It is just a Function without name.
    => Also known as Anonymous Functions.

            Parameters { Body }
                       { x,y -> x + y }
                       { x -> x * y }
                       { x,y,z -> x * y + z}
                       { str -> println(str)}

    */

    println("The Square of 2 is: " + sqr(2))
    println("The Sum is: " + add(2, 6))

    printName()
    printNames("Muhsan Javed")
    printNameAge("Kotlin")
//    val printName: () -> Unit = { println("Hello Android Developer") }

}

//var num :Int = 11
val sqr: (Int) -> Int = { x -> x * x }

val add: (Int, Int) -> Int = { x, y -> x + y }

val printName: () -> Unit = { println("Hello Android Developer") }
val printNames: (String) -> Unit = { strName -> println("Hello $strName") }
val printNameAge = { strName: String -> println("Hello Android $strName") }

val printAge = { println("19") }


fun Square(a: Int): Int {
    return a * a
}

class LambdasKotlin {
}