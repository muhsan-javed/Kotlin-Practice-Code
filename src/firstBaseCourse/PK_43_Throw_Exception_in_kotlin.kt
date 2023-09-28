fun main() {
    checkgrades(99)
}

fun checkgrades(marks: Int) {

    if (marks < 33) {
        throw ArithmeticException("You are fail")
    } else {
        println("You are Pass")
    }


}