fun main() {

}

fun create100kThreads(){

    repeat(100_000){
        thread {
            Thread.sleep(1000)
            print(".")
        }
    }
}