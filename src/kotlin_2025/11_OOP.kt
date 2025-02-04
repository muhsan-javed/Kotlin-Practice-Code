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
}