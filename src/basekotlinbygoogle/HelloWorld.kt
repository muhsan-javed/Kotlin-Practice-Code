package basekotlinbygoogle

class HelloWorld {


}

fun main(args: Array<String>) {
//
//    val age = 5 * 365
//    val name = "Rover"
//
//    println("Happy Birthday, ${name}!")
//
//    // Let's print a cake!
//    println("   ,,,,,   ")
//    println("   |||||   ")
//    println(" =========")
//    println("@@@@@@@@@@@")
//    println("{~@~@~@~@~}")
//    println("@@@@@@@@@@@")
//
//    // This prints an empty line.
//    println("")
//
//    println("You are already ${age} days old, ${name}!")
//    println("${age} days old is the very best age to celebrate!")

//    println("Hello, world!")
//    println("It's a sunny and warm day!")

//    val age = 24
//    val layers = 5
//    printCakeCandles(age)
//    printCakeTop(age)
//    printCakeBottom(age, layers)
    //  createMessage("muhsan", "Pakistan", 19)

    val num = 5
    if (num > 4) {
        println("The variable is greater than 4")
    }

    val myFirstDice = Dice(4)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

fun createMessage(name: String, location: String, age: Int) {
    println("My name is ${name}. I am from ${location}, and I am ${age} years old.")
}