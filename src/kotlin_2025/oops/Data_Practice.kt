package kotlin_2025.oops

data class Person(var name:String, var age:Int, var phone:String)
{

}

fun main() {
    val person = Person("muhsan",44,"03001671613")
    println(person.name)
    println(person.age)
    println(person.phone)
    println()
    val person2 = person.copy()
    println(person2.name)
    println(person2.age)
    person2.name = "Ali"
    println(person2.name)
}