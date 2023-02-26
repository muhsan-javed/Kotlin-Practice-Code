/*   Main Function  */
// An entry point of a kotlin application is the main function

fun main() {
    //println("Hello Kotlin")


    //fun main(args: Array<String>){
    //
    //}

    // Single line comment
    /*
    <<<<<<<
    Multi line
    comment
    >>>>>>>
        */

/*  ****    DATA TYPE   ***** */
    //  Int - 10, 20, 300
    //  Long - 23454343, 3453534L
    //  Float - 345.44f , 2.4f
    //  Double - 3454342434.44, 1.3
    //  char - 'M', 'a'
    //  String - "Hello", "123546789", "Hello Kotlin"
    //  Boolean - true , false

    /*       Variables     */
    // # var - Variables that can be reassigned


   /* // ## Dynamic Type
    var roll = 10
    var mobileNumber = 339999555L
    var price = 30.45f
    var totalCast = 235435.533
    var gender = 'F'
    var name = "Muhsan javed"
    var isActive = true

    println(roll)
    println(mobileNumber)
    println(price)
    println(totalCast)
    println(gender)
    println(name)
    println(isActive)

    println("*******************")
    roll = 10011
    mobileNumber = 4335454545
    price = 100.00f
    totalCast = 1000000.00
    gender = 'M'
    name = "Ali hyder"
    isActive = false

    println(roll)
    println(mobileNumber)
    println(price)
    println(totalCast)
    println(gender)
    println(name)
    println(isActive)
    */


    //   ## Specific Type

    /*var roll : Int= 10
    var mobileNumber : Long = 339999555L
    var price : Float = 30.45f
    var totalCast : Double = 235435.533
    var gender : Char = 'F'
    var name : String = "Muhsan javed"
    var isActive : Boolean = true

    println(roll)
    println(mobileNumber)
    println(price)
    println(totalCast)
    println(gender)
    println(name)
    println(isActive)

    println("*******************")
    roll = 10011
    mobileNumber = 4335454545
    price = 100.00f
    totalCast = 1000000.00
    gender = 'M'
    name = "Ali hyder"
    isActive = false

    println(roll)
    println(mobileNumber)
    println(price)
    println(totalCast)
    println(gender)
    println(name)
    println(isActive)*/
            //  # val - Read-only local variables are defind using the keywood val. They can be assigned only once.

    // val
//    val roll : Int= 10
//    val mobileNumber : Long = 339999555L
//    val price : Float = 30.45f
//    val totalCast : Double = 235435.533
//    val gender : Char = 'F'
//    val name : String = "Muhsan javed"
//    val isActive : Boolean = true

//    println(roll)
//    println(mobileNumber)
//    println(price)
//    println(totalCast)
//    println(gender)
//    println(name)
//    println(isActive)

//    roll = 10011
//    mobileNumber = 4335454545
//    price = 100.00f                                 ERROR
//    totalCast = 1000000.00
//    gender = 'M'
//    name = "Ali hyder"
//    isActive = false


    /*      PRINT FUNCTION   */
    // print() // print()
    /*println(" Muhsan ")
    println(2323)
    println(10-3)
    val a = 20
    println(a)
    println(" Value is a "+ a)
    println(" Value is $a ") // used this type
    val b = 30
    println(" Value is b "+ b)
    println(" Value is $a and $b") // used this type
    println(a+b)
    println(" Addition ${a+b}") // used this line
    println(" Addition ${a+b+50}") // used this line*/

    /*   Arithmetical Operators  */
//    val a = 5
//    val b = 2
//    println(a + b)
//    println(a - b)
//    println(a * b)
//    println(a / b)
//    println(a % b)
//    println(b..a)
//    for (i in b..a){
//        println(i)
//    }
    /*      Comparison Operators    */
//    val a = 5
//    val b = 2
//    println(a > b)
//    println(a < b)
//    println(a >= b)
//    println(a <= b)

    /*    Equality & Inequality Operators   */

//    val a = 5
//    val b = 2
//    println(a == b)
//    println(a != b)

    /*      Logical Operators   */

//    val  a = 30
//    val  b = 20
//    val  c = 10
        // AND &&
//    println((a > b) && (b > c))
//    println((a > b) && (b < c))
//    println((a < b) && (b > c))
//    println((a < b) && (b < c))

        // OR ||
//    println((a > b) || (b > c))
//    println((a > b) || (b < c))
//    println((a < b) || (b > c))
//    println((a < b) || (b < c))

        // NOT
//    println(a >= b) // New Sietens
//    println(!(a<b))   // True
//    println(!(a>b))   // False

    /*      Increment and Decrement Operators   */
    //Increment
//    var a = 5
//    println(++a)
//    println(a)
//    println(a++)
//    println(a)

    //Decrement
//    println(--a)
//    println(a)
//    println(a--)
//    println(a)


    /*      Augment Assignments     */
//    var a = 10
//    a = a + 5

//    a += 5
//    a -= 5
//    a *= 5
//    a /= 5
//    a %= 5
//    println(a)


    /*      User Input      */
//    val name = readLine()
    val name : String? = readLine()
    println(name)
    println(name!!::class.simpleName) // Check Variable Data Type

    println("Enter your Name: ")
    val Name = readLine()
    println("Name: $Name")
    println(Name!!::class.simpleName)

    println("Enter your Name: ")
    val roll = readLine()!!.toInt()
    println("Roll: $roll")
    println(roll!!::class.simpleName)

    println("Enter your Fee: ")
    val fee = readLine()!!.toInt()
    println("Fee: $fee")
    println(fee::class.simpleName)

}
