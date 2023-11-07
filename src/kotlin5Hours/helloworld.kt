package kotlin5Hours

import kotlin.time.Duration.Companion.microseconds

//class first {
//
//}
fun main() {
    println("Hello world kotlin")
//    System.out.println("Hello World Java")
    //kotlin Variable

    // Variable refers to a memory location. It is used to stores data. The data of variable can be changed and reused depending on condition or on information passed to the program.

    val language = "kotlin"
//    language = "Kotlin"
    val salary = 30000.00
    var lan: String
    lan = "Muhsan Javed"
    var number1 :Int = 10
    var number2:Int = 20

    println("addition of two number is: ${number1+number2}")
    println("Your name is $lan")

    var number :Double
    number = 100.252
    var check : Boolean
    println(number.microseconds)


}