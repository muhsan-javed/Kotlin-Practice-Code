fun main() {

//    !
    val number = 5
    var fact: Long = 1
    for (x in 1..number) {
//        fact = fact * x.toLong()
        fact *= x.toLong() // recommended

    }
    println("Factorial of $number = $fact")

}