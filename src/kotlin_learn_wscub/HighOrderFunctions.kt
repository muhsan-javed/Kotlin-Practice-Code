package kotlin_learn_wscub


fun main() {

    /*             ********************  High Order Functions Kotlin *********************************
    => A function which can accepts a function as parameter or can return's a function is called Higher-Order function.
    => Kotlin functions can be stored in variables and data structures, passed as arguments to and returned from other higher-order functions.
    */

    highOrder(printMe)
    highAdd(sum)

    HighOrderFunctions(printMe)
}

val printMe = { println("This Line has been printed!") }

val sum = { a: Int, b: Int -> a + b }

val retSum = { a: Int, b: Int -> " The summ is: " + { a + b } }

fun highOrder(func: () -> Unit) {
    func()
}

fun highAdd(addFunc: (Int, Int) -> Int): (Int, Int) -> String {
    println("The sum is: " + addFunc(5, 7))

    return retSum
}

class HighOrderFunctions(funx: () -> Unit) {


}