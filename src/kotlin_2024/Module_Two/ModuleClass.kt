package kotlin_2024.Module_Two

fun main() {
    // Object of the class
    var obj1 = Person("Muhsan",19)
    obj1.canVote(19)

    // Girl
    val maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria : Actual age = ${maria.actualAge}")
    println("Maria : Pretended age = ${maria.age}")

    val angela = Girl()
    angela.actualAge = 35
    angela.age = 35
    println("Angela : Actual age = ${angela.actualAge}")
    println("Angela : Pretended age = ${angela.age}")
}

class Girl {
    var age :Int = 0
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value-3
        }

    var actualAge : Int = 0
}
class Person(var names:String, var age:Int) {
    fun canVote(age: Int){
        if (age <= 18){
            println("Can not vote")
        }else{
            println("Can vote")
        }
    }
}

class ModuleClass {

}