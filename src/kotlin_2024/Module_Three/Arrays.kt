package kotlin_2024.Module_Three

//class Arrays {
//}

fun main() {

    val arr = arrayOf(1,2,3,4,5,6,7,8,9)

    for (element in arr){
        println(element)
    }

    arr.set(0,66)
    arr[1]= 99

    println(arr.get(8))

    println("New  values of the array")
    for (element in arr){
        println(element)
    }

    println("The value at index 4 is: " + arr.get(4))
}