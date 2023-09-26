package kotlin_2024.Module_Two

class Inheritance {
}

fun main() {
    val t1 = MathTeacher(25,"Jack")
    t1.teachMaths()

    println()

    val f1 = Footballer(30,"Christiano")
    f1.playFootball()
}

open class Persons(age:Int,name:String) {
    init {
        println("My name is $name")
        println("My age is $age")
    }
}

class MathTeacher(age:Int,name:String) : Persons(age, name) {
    fun teachMaths(){
        println("I teach in primary school.")
    }
}

class Footballer(age:Int,name:String) : Persons(age, name) {
    fun playFootball(){
        println("I play for La Galaxy.")
    }
}