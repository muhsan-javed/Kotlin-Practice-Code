package kotlin_2025

fun main() {
    // WAP to take a number from user and count the digit.
    // WAP to take number from user and reverse.
    // WAP to take number form user and find the sum of cube of each digit of number.
    // WAP to take number from user and  check prime number.

    println("Enter Number ")
    val number:Int = readln().toInt()
    //countDigit(number)
    //reverseNumber(number)
    if (checkPrime(number)){
        println("Number is Prime")
    }else {
        println("Number is not Prime number")
    }

}
// WAP 1
fun countDigit(number:Int){
    // logic for count digit
    var count =0
    var num = number
    while (num > 0){
        val r = num %10
        count++
        num = num /10
    }
    println("Number of digits is $count")
}

//WAP 2
fun reverseNumber(number: Int):Int{
    var n = number
    var rev:Int = 0
    while (n!=0)
    {
        val r = n%10
        rev = rev * 10 + r
        n = n /10
    }
    println("reverse is $rev")
    return rev
}

// WAP 4
fun checkPrime(number: Int): Boolean{
    //var n = number
//    var factorCount = 0
    var isPrime = true
    for (i in 2..<number){
        if (number%i==0){
            isPrime = false
            break
        }
    }
return isPrime
   /* for (i in 1..n){
        if (n % i == 0){
            factorCount++
        }
    }
    println("Factors: $factorCount")
    if (factorCount == 2)
        return true
    else
        return false*/
}