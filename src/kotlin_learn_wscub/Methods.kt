package kotlin_learn_wscub

class Methods {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            println("The sum is ${add(5,6, 10)}")
        }

        fun add(a : Int , b : Int) : Any {

            return a+b
        }

        fun add(a : Int , b : Int, c: Int) : Any {

            return a+b+c;
        }


    }



}