package KotlinBasicCourse

fun main() {

    var elements = arrayOf("Ali", "Muhsan", "Hyder")
    println(elements[2])

    var number = arrayOf(12,98)
    println(number[1])

    var int = intArrayOf(12,45,63,87,99,2,0)
    println(int[4])
//    println(int.get(0))

    var byte = byteArrayOf(12,99,45,127,-55,-128)
    println(byte[2])

    var short = shortArrayOf(12222,10000,888,999,555,9128)
    println(short[4])

    var long = longArrayOf(2212222,1000000,888888,99999,555555,992288)
    println(long[3])

    var float = floatArrayOf(222.99F,1000000.99F)
    println(float[0])

    var dou = doubleArrayOf(2212222.4 , 1000000.56)
    println(dou[0])

    var char = charArrayOf('a','b','c','d','x','y','z')
    println(char[0])


    var boolean = booleanArrayOf(true , false , true, false , false)
    println(boolean[2])

    println("The  Size of array is ${boolean.size}")

    boolean[0] = false
    println(boolean[0])

    var newNull = arrayOfNulls<Int>(10)
    newNull[0]=9
    newNull[1]=19
    newNull[2]=29
    newNull[3]=39
    println("Array before empty ${newNull[0]}")
    newNull = emptyArray()
    println("Array After empty $newNull")





}