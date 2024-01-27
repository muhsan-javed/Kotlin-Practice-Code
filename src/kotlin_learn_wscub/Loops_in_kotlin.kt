package kotlin_learn_wscub

class Loops_in_kotlin {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var num = 0

            val array = ArrayList<Int>()
            array.add(1)
            array.add(2)
            array.add(3)
            array.add(4)
            array.add(5)
            array.add(6)
            array.add(7)
            array.add(8)
            array.add(9)

            // For Loop
            for (i in array) {
                println("Numbers is ${num++}")
            }

           /* for (i in 0..12 step 3) {
                println("Number is ${num++}")
            }*/

            // While Loop
            var a = 10;

           /* while (a < 20){
                println("No is: $a")
                a++
            }
*/
            do {
                println("No is: $a")
            }while (num>10)


        }
    }
}