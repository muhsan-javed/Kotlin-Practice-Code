package kotlin_2025

class Car {
    // Properties
    var brand: String = ""
    var model: String = ""
    var year: Int = 0

    // Constructor
    constructor(brand: String, model: String, year: Int) {
        this.brand = brand
        this.model = model
        this.year = year
    }

    // Method
    fun startEngine() {
        println("Engine started")
    }

    fun stopEngine() {
        println("Engine stopped")
    }
}

fun main() {

    // OOP-> Object Orientation Programming Language
    // Class


    // Object
    val myCar = Car("Toyota", "Corolla", 2020)
    myCar.startEngine()
    myCar.stopEngine()

    // Called the class
    val student = Student()
    student.name="Muhsan Javed"
    student.age=20
    student.classNumber="10A"
    println(student.name)
    println(student.age)
    println(student.classNumber)
    student.getName()
}

//Class
class Student {
    // body
    var name: String = ""
    var age: Int = 0
    var classNumber:String = ""

    fun getName(){
        println("Student Name: $name")
    }
}