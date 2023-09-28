fun main() {
    try {
        var a = 30
        var b = 0
        println(a / b)
    } catch (exception: ArithmeticException) {
        println("Value cannot be divided by zero \n $exception")
    } catch (exception: Exception) {
        println("Function cannot be done \n $exception")
    }
}