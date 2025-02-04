package kotlin_2025

// Create a function fun keyword
fun greet(name: String) {
    println("Hello, $name")
}

fun add(a: Int, b: Int): Int {
    return a + b
}
fun main() {
    // Create a function fun keyword

    // Call the function
    greet("Jannat")
    //add(78,22)

    // Lambda function
    val sumLambda: (Int, Int) -> Int = { a, b -> a + b }
    //println(sumLambda(10, 20))

    // HigherOrderFunction
    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println(higherOrderFunction(5, 5, multiply))
    // Anonymous function
    val multiplyAnonymous: (Int, Int) -> Int = { a, b -> a * b }
    println(higherOrderFunction(6, 6, multiplyAnonymous))
}

fun higherOrderFunction(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}