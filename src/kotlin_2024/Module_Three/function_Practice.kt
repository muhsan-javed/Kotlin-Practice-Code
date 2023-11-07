package kotlin_2024.Module_Three

class function_Practice {

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

fun main() {
    val functionPractice = function_Practice()
    println(functionPractice.sum(1, 6))

    println("I Want to Perform Addtion Operation")
    var a = 5
    var b = 10

    println("${a + b}")
    println(sum(a, b))
    println(sum(10.4, 16.8))
}

fun sum(var1: Int, var2: Int): Int {
    return var1 + var2
}

fun sum(var1: Double, var2: Double): Double {
    return var1 + var2
}