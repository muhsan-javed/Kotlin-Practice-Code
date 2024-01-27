package kotlin_learn_wscub

class Methods {

    // Kotlin Methods Practice
    companion object{

        // Main Fun
        @JvmStatic
        fun main(args: Array<String>) {

            println("The sum is ${add(5,6, 10)}")
        }

        // Method 1
        fun add(a : Int , b : Int) : Any {

            return a+b
        }

        // Method 2
        fun add(a : Int , b : Int, c: Int) : Any {

            return a+b+c;
        }

    }

}