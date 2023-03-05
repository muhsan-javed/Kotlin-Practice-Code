package kotlin_learn_wscub


fun main() {

//    val genClass = GenericsKotlin<Int>(11)
    val genClass = GenericsKotlin(true)
}

class GenericsKotlin<T> (value: T) {

    init {
        println("THe value is : $value")
        Check<T>(value)
    }

}

fun <T> Check(text: T){
    println("Received Value is : $text")
}