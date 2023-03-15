package KotlinBasicCourse

class Class_63_Operators_Kotlin {
}

fun main() {

    // Operators
    var a = 10
    var b = 5

    println("Addition is ${a+b}")
    println("Subtraction is ${a-b}")
    println("Multiplication is ${a*b}")
    println("Division is ${a/b}")
    println("Modulus is ${a%b}")

    // Kotlin Functions
    println(a.plus(b)) // a + b
    println(a.minus(b)) // a - b
    println(a.times(b)) // a * b
    println(a.div(b)) // a / b
    println(a.rem(b)) // a % b

    // sum()
    var data = intArrayOf(12,64,5,6,15,3)
    println("Sum of ArrayList ${data.sum()}")

    // inc()
    var q = 12
    q++
    println(q.inc())
    println(q)

    // dec()
    var w = 10
    w--
    println(w.dec())
    println(w)

    // raw String
    var rawString = """
        Muhsan Javed,
      How Are
       You
      ?
    """
    println(rawString)

    // trimMargin()
    var trimMargin = """
        Muhsan Javed
        How Are You
      ?
    """.trimMargin()
    println(trimMargin)

    // trimIndent
    var trimIndent = """
        Muhsan Javed
        How Are You
      ?
    """.trimMargin().trimIndent()
    println(trimIndent)

    //trimStart
    var trimStart = """
        Muhsan Javed
        How Are You
      ?
    """.trimStart()
    println(trimStart)

    //trimEnd
    var trimEnd = """
        Muhsan Javed
        How Are You
      ?
    """.trimEnd()
    println(trimEnd)

    // Reversed()
    val reversed = "Muhsan Javed"
    println(reversed.reversed())
//    val reversedNew = reversed.reversed()
//    println(reversedNew)


}