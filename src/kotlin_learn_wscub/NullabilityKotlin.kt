package kotlin_learn_wscub


fun main() {

    // ****************** Nullability in Kotlin ************************
    var name : String? = null
    //name = "John"

    name.let {
        println("The name is: ${name!!.length}")
    }

}

class NullabilityKotlin {
}