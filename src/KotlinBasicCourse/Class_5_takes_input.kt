package KotlinBasicCourse

import javax.print.attribute.IntegerSyntax

fun main() {

    println("Enter your name?")
    var name = readLine()
    println("What is your Age?")
    var age = readLine()

    println("Your Name is ${Integer.parseInt(age)}")

    println("Your Name is $name and Iam $age years old.")

}