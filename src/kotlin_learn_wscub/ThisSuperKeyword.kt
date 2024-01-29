package kotlin_learn_wscub

fun main() {

    // ********************  this vs super keyword *********************************
    /*
    => The (this)keyword points to a reference of the current class,
        while the (super) keyword points to a reference of the parent class.

    => (this) can be used to access variables and methods of the current class,
        and (super) can be used to access variables and methods of the parent class from the subclass.
     */

    val audi = Audi(7777777)
    //audi.interior(1575)
}


open class ThisSuperKeyword(chasisNo: Int) {
    // Basic Entities of car

    var manufacture = 1044545
    fun pressBrakes(): String {
        println("car has been Stopped")
        return "Brakes Pressed"
    }

    fun pressAccln(speed: Int): String {
        println("car acclerated with " + speed + " kn/hr speed")
        return "Car Accelerated!"
    }

    fun changeGear(gearNo: Int): String {
        println("Gear shifted to " + gearNo)
        return "Gear Shifited"
    }

}

class Audi(chasisNo: Int) : ThisSuperKeyword(chasisNo) {
    var shasisNo = 100000

    init {
        println("ChasisNo is : " + chasisNo)
        println("Audi Created " + super.manufacture)
        println("Step1 : " + super.changeGear(1))
        println("Step2 : " + super.pressAccln(10))
        println("Step3 : " + super.changeGear(2))
        println("Step4 : " + super.pressBrakes())
    }

//    fun interior(shasisNo : Int){
//        println("ChasisNo :is " + this.shasisNo)
//    }
}