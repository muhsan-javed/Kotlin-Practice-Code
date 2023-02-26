fun main() {
    try {
        var a =49
        var b = 0
        println(a/b)
        println("Hello OK")
    }catch (e: ArithmeticException){
        println("Value cannot be divided by zero")
    }catch (e: Exception){
        println("Function cannot be done")
    }finally {
        println("My name is hamza")
    }
}