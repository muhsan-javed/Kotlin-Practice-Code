package kotlin_2025

fun main() {
    //  OPERATORS KOTLIN
   /* Operators are the special symbol in programming languages which is used to program special task or special operation.
   A+B + - / * % a++

     */
    // Arithmetic Operations
    val x = 100
    val y = 50

    println(x+y)
    println(x-y)
    println(x/y)
    println(x*y)
    println(x%y)
    var temp = 33
    temp++
    val inc = temp.inc()
    println("Increment: "+temp)
    println("Increment INC: "+inc)
    println(x.plus(y))
    println(x.minus(y))

    // Assignment Operations
    var name = "Jannat JAN"

    // Comparison Operations
    var dabba1 = 35
    var dabba2 = 35
    println(dabba2 == dabba1)

    // Logical Operators
    val paper1 = 10
    val paper2 = 11

    if (paper1 > 60 || paper2 > 60){
         println("I will give Bikes for")
    }else {
        println("Chata")
    }

    var isPassed = true
    if (!isPassed){
        println("you are passing")
    }else{
        println("you are not passing")
    }

}