package kotlin_learn_wscub


fun main() {
    /*
              ********************  Generics Kotlin *********************************
    => Generic is defined as a product without a brand name.
    => The definition of generic is something without a brand name.
    => An example of generic is the type of soap with a store's label that says "soap," but without a brand name.

    => Generics are the powerful features that allow us to define classes, methods and properties
    => which are accessible using different data types while keeping a check of the compile-time type safety.

    => A generic type is a class or method that is parameterized over types.
    => We always use angle brackets () to specify the type parameter in the program.


         ********************  Advantages of Generics *********************************

    * Type casting is evitable-No need to typecast the object.

    * Type safety-Generic allows only single type of object at a time.

    * Compile time safety-Generics code is checked at compile time for the parameterized type so that it avoids run time error.

    */

//    val genClass = GenericsKotlin<Int>(11)
    val genClass = GenericsKotlin(true)
}

class GenericsKotlin<T>(value: T) {

    init {
        println("THe value is : $value")
        Check<T>(value)
    }

}

fun <T> Check(text: T) {
    println("Received Value is : $text")
}