fun main() {
    try {
        var a = 40
        var b = 0
        println(a/b)
    }catch (e: ArithmeticException){
        println("Value cannot  be divided by 0 \n $e")
    }
}