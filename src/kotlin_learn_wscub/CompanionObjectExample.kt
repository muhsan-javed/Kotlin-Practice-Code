package kotlin_learn_wscub

fun main() {

    // ********************  Companion Object *********************************
    /*
    => In Kotlin or any other programming language like Java and C#.

    => whenever we want to call the method or whenever we want to access the members of a class then we make the object of the class and with the help of that object, we access the members of the class.

    => In some languages like Java and C#, we use static keyword to declare the members of the class and use them without making any object i.e. just call them with the help of class name.

    => There is nothing called static in Kotlin. So, in Kotlin, we use a companion object.
     */

    val co = CompanionObjectExample()
    println("First No is: " + co.firstNo)
    println("Sum is: " + co.add(6, 5))

    println("Second no is: " + CompanionObjectExample.secondNo)
    println("Product is :" + CompanionObjectExample.product(20, 5))

}

class CompanionObjectExample {

    var firstNo = 10

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    companion object {
        var secondNo = 20

        fun product(a: Int, b: Int): Int {
            return a * b
        }
    }

}