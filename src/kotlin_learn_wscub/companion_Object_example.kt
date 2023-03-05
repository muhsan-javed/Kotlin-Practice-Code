package kotlin_learn_wscub




fun main() {
    val co = companion_Object_example()
    println("First No is: "+ co.firstNo)
    println("Sum is: "+ co.Add(6,5))

    println("Seond no is: " + companion_Object_example.secondNo)
    println("Product is :" + companion_Object_example.Product(20,5))

}

class companion_Object_example {

    var firstNo = 10

    fun Add(a: Int, b:Int) : Int{
        return a+b
    }

    companion object{
        var secondNo = 20

        fun Product(a:Int, b:Int) :Int{
            return a*b
        }
    }

}