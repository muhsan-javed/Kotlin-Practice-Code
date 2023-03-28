package KotlinBasicCourse

fun main() {
    print("Hello world")
    println(" hello world")
    println("Hello World")


    var title = "Neat Roots" // mutable
    println("Subscribe $title")

    title= "Muhsan Javed"
    println(title)

    val channel = "Muhsan Tech" // immutable - Working same like final in JAVA
    // channel = "What"
    println(channel)

    val myName = "Muhsan Javed"
    println("Hello $myName, ")

//    var typeOfVariable : String
//    typeOfVariable = "Hello Movies"
    var typeOfVariable : String = "Hello Movies"
    var marks : Int
    marks = 99
    println("My name is $myName and I got #marks marks in Maths.")


    // Kotlin Data Types
    var fvtDrink : String
    fvtDrink = "Tea"
    println(" $fvtDrink ")

    /*  // Integer Types
    Int 32 bits
    Byte 8 bits
    Short 16 bits
    Long 64 bits
    */
    val MIN_VALUEINT: Int = -2147483648
    val MAX_VALUEINT: Int = 2147483647
    println("Min Int value: $MIN_VALUEINT  AND Max Int value: $MAX_VALUEINT")

//    val MIN_VALUE: Byte = -128
//    val MAX_VALUE: Byte = 127
//    println("Min Int value: $MIN_VALUE  AND Max Int value: $MAX_VALUE")

    val MIN_VALUEShort: Short = -32768
    val MAX_VALUEShort: Short = 32767
    println("Min Short value: $MIN_VALUEShort  AND Max Short value: $MAX_VALUEShort")

    val MIN_VALUELong: Long = -9223372036854775807L - 1L
    val MAX_VALUELong: Long = 9223372036854775807L
    println("Min Long value: $MIN_VALUELong  AND Max Long value: $MAX_VALUELong")

    val MIN_VALUEDouble: Double = 4.9E-324
    val MAX_VALUEDouble: Double = 1.7976931348623157E308
    println("Min Double value: $MIN_VALUEDouble  AND Max Long value: $MAX_VALUEDouble")

    val MIN_VALUEFloat: Float = 1.4E-45F
    val MAX_VALUEFloat: Float = 3.4028235E38F
    println("Min Float value: $MIN_VALUEFloat  AND Max Long value: $MAX_VALUEFloat")

    val MIN_VALUEChar: Char = 'A'
    val MAX_VALUEChar: Char = 'D'
    println("Min Char value: $MIN_VALUEChar  AND Max Char value: $MAX_VALUEChar")

    val MIN_VALUEBoolean: Boolean = false
    val MAX_VALUEBoolean: Boolean = true
    println("I got grade: $MIN_VALUEChar  in Acdroid. Can I have Coffee? $MAX_VALUEBoolean")

    // Operators
    //  Kotlin has a set of opreators to prefrom arithmetic assignment, comparison, and more.
    // 1. Arithmetic Operators + - * / %
    // 2. Concatenation of Strings
    // 3. Assignment Operators = += -= *= /= %=
    // 4. Increment and Equality Operators ++,--
    // 5. Logical Operators || && !

    val a = 12
    val b = 8
    println("Addition ${a+b} ")
    println("Subtraction ${a-b} ")
    println("Multiplication ${a*b} ")
    println("Division ${a/b} ")
    println("Mod ${a%b} ")

}

