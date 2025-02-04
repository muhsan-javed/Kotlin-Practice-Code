package kotlin_2025

fun main() {

    // Control Statements

    // Take a Input Number from User ?
   /* println("Plz Enter Number: ")
    val number:Int = readln().toInt()

    if (number>0){
        // Ture Block
        println("$number Number is Positive")
    }else if (number<0){
        println("$number Number is Negative")
    } else{
        // false block
        println("$number Number is Zero")
    }*/

//    println("Enter First Number:")
//    val number1:Int = readln().toInt()
//    println("Enter second Number:")
//    val number2:Int = readln().toInt()

   /* if (number1 > number2){
        println("Number $number1 is Max")
    }else {
        println("Number $number2 is Max")
    }*/
   /* val max = if (number1 > number2)
       number1
    else
       number2

    println("Number $max is maximum")*/

    // If else Statements

    // Question Sol
    // MarksToGrade

    println("Enter Marks: ")
    val marks = readln().toInt()

    /*val grade:Char = if (marks in 91..100){
       'A'
    } else if (marks<= 90 && marks >= 81){
        'B'
    } else if (marks in 71..80){
        'C'
    } else{
        'F'
    }
    println("Grade is $grade")*/

    // When Statements
    val grads:Char = when(marks){
        in 91..100 ->'A'
        in 81..90 ->'B'
        in 71..80 ->'C'
        else -> 'F'
    }
    println("Grade is $grads")

}