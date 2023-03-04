package kotlin_learn_wscub

class Confitional_Statements_in_Kotlin {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            println("Conifional Statements")

            var numbre  = 100;

//            if (numbre > 100){
//                println("No. is Greater@")
//            }else{
//                println("No. is Samller")
//            }

            var msg = ""
            msg = if (numbre > 100) "No. is Greater!" else "No. Is Smaller !"
            println(msg)

            if (numbre>100){
                println(" > 100 ")
            }else if (numbre >= 100){
                println(">= 100")
            }

            when(numbre){
                1->{
                    println(" > 100 ")
                }
                100->{

                    println(" > 100 ")
                }
                3->{
                    println(" > 100 ")

                }

            }

            when{
                numbre > 100->{ println(" > 100 ")}
                numbre >= 100->{ println(" > 100 ")}
                numbre < 50->{ println(" > 100 ")}
                else->{ println(" > 100 ")}
            }

        }
    }
}