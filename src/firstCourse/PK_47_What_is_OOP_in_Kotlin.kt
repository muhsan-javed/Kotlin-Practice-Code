package firstCourse// What is Class?

class CAR{
    var brand = ""
    var color = ""
    var vear = 0


}


fun main() {

    val cars = CAR()
    cars.brand = "MJT"
    cars.color = "White"
    cars.vear = 1998

    println(cars.brand +"\n"+ cars.color + "\n"+ cars.vear)

    // oop --> Object-Oriented Programming
//Object-oriented programming is a programming paradigm based on the concept of "objects", which can contain data and code: data in the form of fields, and code, in the form of procedures. A feature of objects is that an object's own procedures can access and often modify the data fields of itself


}