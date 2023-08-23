import java.util.*

fun main() {
    //println("Hello Kotlin")

    // Single line comment
    // System.out.println("Hello Java")
   /* (Single line comment)
    multi line comment*/

    // <<<<<<<<<<< Kotlin Variables >>>>>>>>>>>>
    // Kotlin Variable refers to a memory location. It is used to store data. The data of variable can be changed and reused depending on condition or on information passed to the program.

    /// <<<<<<<<<< var or val >>>>>>>>>>
    //val salary = 30000
    //var name = "Muhsan"
    // salary = 20000
    //salary = 200
    //var number:Int = 10
    //var number2:Int = 10
    //println("Add of two number is ${number+number2}")
    //println("Add of two number is " + number2+ number)
    //println("Your name is "+name)
    //println("Your name is $name") // Best

    //<<<<<<<<<<< Data Type >>>>>>>>>>>>
//    var numbers:Double
//    var check:Boolean = false
//    check = true
//    numbers =1000.00
//    println(numbers)

    // 1 byte = 8 bit
//    var num = Byte
//    num = 127

    /*
    // <<<<<<<<<<<<<< Types of String >>>>>>>>>>>>>>>

    // Escaped String
    // Raw String
    val text1 = "Hello, Ali"
    println(text1)
    // or
    val text2 = "Hello, Muhsan\n"
    println(text2)
    // or
    val text3 = "Hello, \nJaved"
    println(text3)
    // \n, \t, \b

    var sen:String = ("Hell | mahender " +
            " |Sing").trimMargin()
    println(sen)
    print(sen)*/

    // <<<<<<<<<<<<<<<< Kotlin Type Conversion >>>>>>>>>>>>>
    // The type conversion is a process in which one data type is converted into another data type
/*
    var number = 10
    var num2:Long = 1002064

    var nume :Long = 10205
    var num:Int = nume.toInt()

    var ss:Double = 1258272.04
    var sss:Long = ss.toLong()

    var ins:Int = ss.toInt()
    var n:Int = num.toInt()
    println(n+10)

    var num:String = "10"
    println(num+42)*/

    // <<<<<<<<<<<<<< Kotlin Operator>>>>>>>>>>>>>
    // <<<<<<< Arithmetic Operator >>>>>>>
    var a = 10
    var b= 5
    println("Addition ${a+b}")
    println("Subtraction ${a-b}")
    println("Multpi ${a*b}")
    println("Dir ${a/b}")
    println("Dir ${a%b}")

    // <<<<<<<<<<<<< Relation Operator >>>>>>>>>>>>>>>..
  /*  val a = 10
    val b = 10
    val max = if (a == b) {
        println("a is greater than b.")
    }else{
        println("b is greater than a.")
        b
    }
    println("max = $max")*/

    // <<<<<<<<<<< Assignment Operator >>>>>>>>>>>
    /*var number = 10
    number= number+3

    number%= 5
    number+= 5
    number-= 5
    number/= 5
    println(number)*/

    // <<<<<<<<<< Unary operator >>>>>>>>>>

    /*var a = 10
    var b = 5
    var flag =true
    println("+a :"+ +a)
    println("+b :"+ -b)
    println("++a :"+ ++a)
    println("a++ :"+ a++)
    println(a)
    println("--b :"+ --b)
    println("b-- :"+  b--)
    println(b)
    println("!flag : "+ !flag)*/


    // <<<<<<<<<< Logical Operator  >>>>>>>>>>>>>
/*
    // &&  || !
    var a = 10
    var b= 5
    var c = 15
    var flag = false
    var reuslt: Boolean
    reuslt = (a>b) && (a>c)
    println("(a>b) && (a>c) : $reuslt")// false
    reuslt = (a>b) || (a>c)
    println("(a>b) || (a>c) : $reuslt")// true
    reuslt = !flag
    println("!flag  : $reuslt")// true*/

    // <<<<<<<<<< Bitwise operator >>>>>>>>>>>>>>>

//    var aa = 10 // 20//40// 80// 160
//    var bb = 3

//    println(bb.shl(bb))
//    println(bb.shr(bb))
//    println(aa.shl(aa))
//    println(aa.shr(aa))
//
//    println("a.ushr(bb) : " + a.ushr(bb))
//    println("a.and(bb) : " + a.and(bb))
//    println("a.or(bb) : " + a.or(bb))
//    println("a.xor(bb) : " + a.xor(bb))
//    println("a.inv(bb) : " + a.inv())


    // <<<<<<<< Input in Kotlin >>>>>>>>>>
    /*println("Enter your name")
    val name :String? = readLine()
    println("Your name is $name")

    val input = Scanner(System.`in`)
    var age:Int
    println("Enter your age")
    age = input.nextInt()
    println("Your age is $age")

    var asge = Integer.valueOf(readLine())
    println("Your age is $asge")*/

    // <<< <<<<<<<<<<<<< Control Flow >>>>>>>>>>>>>
    // if-else expression
    // if-else if-else ladder expression
    // nested if expression

    // <<<<<<<<<< if-else expression >>>>>>>>>>
    /*val num1 = 10
    val num2 = 20
//    if (num1 > num2){
//        println("$num1 is greater than $num2")
//    }else{
//        println("$num1 is smaller than $num2")
//    }
    val result = if (num1 > num2){
        "$num1 is greater than $num2"
    }else{
        "$num1 is smaller than $num2"
    }
    println(result)
    val results = if (num1>num2)"$num1 is greater than $num2" else "$num1 is smaller than $num2"
    println(results)
    */

  // <<<<<<<<<<<< if-else if-else ladder expression >>>>>>>>>>>..
    /*val num = 5
    val result = if (num > 0){
        "$num is positive"
    }else if (num < 0){
        "$num is negative"
    }else {
        "$num id zero"
    }
    println(result)*/

    // <<<<<<<<<<<< nested if expression >>>>>>>>>>>

    val num1 = 25
    val num2 = 20
    val num3 = 30
    val result = if (num1 > num2){
        val max = if (num1 > num3){
            num1
        }else{
            num3
        }
        "body of if $max"
    }else if (num2 > num3){
        "body of else if $num2"
    }else{
        "body of else $num3"
    }
    println(result)

    // <<<<<<<<<<<<<<< Kotlin when Expression >>>>>>>>>>>.
    // Kotlin, when expression is a conditional which returns the value. kotlin, when expression is replacement of switch statement . kotlin, when expression works as a switch statement of other language (java , C++, C)

    var number  = 7
    var numberProvided = when(number){
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        else -> "invalid number"
    }
    println("You provide $numberProvided")

    when(number){
        1 -> {println("one")
             println("This is one ")
            println("Hello"  )
        }
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        5 -> println("five")
        else -> println("invalid number")
    }
    val sea = when(number){
        3,5,6,->
            "It is summer season"
        7,8,9->
            "It is rainy season"
        10,11->
            "It is autumn season"
        12,1,2->
            "It is winter season"
        else ->
            "invalid input"
    }
    println(sea)

    //var number = 7
    when(number){
        in 1..5-> println("Input is provided in the range 1 to 5")
        in 6..10-> println("Input is provided in the range 6 to 10")
        else -> println("noe of the above")
    }

    // <<<<<<< Loop in Kotlin >>>>>>>>>>>
    // for loop
    // while loop
    // do-while loop

    // <<<<<<<<,for loop >>>>>>>>
    /*val arr = arrayOf(10,20,30,40,50,60,70,80,90,100)
    for (i in arr){
        println(i)
        // println(arr[i])
        //print("Hello")
    }

    for (i in 1..5){
        println(i)
    }
    for (i in 5 downTo 1){
        println(i)
    }
    println("\n")

    for (i in 1..10 step 2) println(i)
    println("\n")

    for (i in 1..10 step 3) println(i)
    println("\n")

    for (i in 10  downTo  1 step 2) println(i)*/

    // <<<<<<<<<<<<<<,< while loop >>>>>>>>>>>>>>>>.
    /*var i = 1
    while (i<=5){
        println(i)
        i++
    }

    // Not stop loop
   // while (true){
     //   println("hello")
    //}*/


 // <<<<<<<<<<<<<<<<<<< do-while loop >>>>>>>>>>>>>>>>>>>>>
 // <<<<<<<<<<<<<<<<<<< do-while loop >>>>>>>>>>>>>>>>>>>>>
 // <<<<<<<<<<<<<<<<<<< do-while loop >>>>>>>>>>>>>>>>>>>>>
    /*var i = 100
    do {
        println(i)
        i++
    }while (i<=5)
    */

    // Break continue or return
    // break
    /*for (i in 1..10){
        println(i)
        if (i == 3){
            break
        }
    }*/

    // continue
    /*for (i in 1..10){
        if (i == 3){
            continue
        }
        println(i)
    }*/

    // return

    // <<<<<<<<<<<<<< Function in Kotlin >>>>>>>>>>>....
    // Function is a group of inter related block of code which performs a specific task, It makes reusability of code and makes program more manageable

    // Standard library function
    println(Math.max(10 ,20))

    // User de-fine function
    println(greaterNumber(10,20))
    println(additionTwo(10,20))
    add()

    var input =  Scanner(System.`in`)
    println("Enter any number ")
    var numberss = input.nextInt()
    evenoddnumber(numberss)

    // <<<<<<< Kotlin Recursion Function >>>>>>>>>>>
    // Recursion function is a function which calls itself continuously. This technique is called recursion
}
fun additionTwo(number1: Int , number2: Int):Int {
    return number1 + number2
}
fun add(){
    val a  = 10
    val b = 30
    println(a+b)
}

fun evenoddnumber(number1: Int){
    if (number1%2==0){
        println("The given number is even number")
    }else{
        println("The given number is odd number")
    }
}

fun greaterNumber(number1:Int , number2:Int ):Int{
    return if (number1 > number2){
        number1
    }else{
        number2
    }
    /*if (number1 > number2){
        return number1
    }else{
        return number2
    }*/
}
