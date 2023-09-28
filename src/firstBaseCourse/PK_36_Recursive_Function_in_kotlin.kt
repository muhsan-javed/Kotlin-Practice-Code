var count = 0
fun main() {
    rec()
}

fun rec() {
    count++
    if (count <= 10) {
        println("Number is $count")
        rec()
    }
}