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

    // \n , \t , \b
    val text1 = "Hello, Muhsan"
    println(text1)
    //Or
    val text2 = "Hello, Muhsan\n"
    println(text2)
    //Or
    val text3 = "Hello, \nJAved\n "
    println(text3)

    var sen = """ Hello
        | Muhsan
        | Javed
    """.trimMargin()

    println(sen)

    // Kotlin Type Conversion

    // Type conversion is a process in which one  data tyoe variable is converted into another data type

    var nums = 10
    var num2 : Long = nums.toLong()

    var nume : Long = 10250
    var num:Int = nume.toInt()

    var ss:Double = 10225.55
    var sss:Long = ss.toLong()

    var string = "10"
    var n :Int = string.toInt()
    println(n+10)

    // Kotlin Operator
    // Arithmetic Operation
   /* var a = 10
    var b = 5
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)
*/
    // Relation Operation
   /* val max = if (a > b){
        println("a is greate than B")
        a
    } else if (a <= b)
        {
        println("B is greater than a")
        b
    } else {
        println("Value Not Matching")
    }
    println("max = $max")*/

    // Assignment Operation
    var numbers = 10
    numbers+= 5
    println(numbers)

    // Unary Operation
    var a = 10
    var b = 5
    var flag = true
    println("+a : ${+a}")
    println("-b : ${-b}")
    println("a++ : ${a++}")
    println(a)
    println("--b : ${b--}")
    println(b)
    println("! Flag : ${!flag}")


    // Bitwise Operation
    var q = 10 //20//40//80//160
    var w = 2
    println(q)
    println(q.shl(w))
    // Logical Operation
}