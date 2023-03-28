package flow_api_kotlin

class FlowAPI {
}

fun main() {


    // Kotlin Flow - flow {} builder block
    /* runBlocking {
         getData().catch { e ->
             Log.d("main", "onCreate $e")
         }
         getData().collect { data ->
             Log.d("main", "OnCreate: $data")
         }
     }*/

    // Kotlin flowOf() method-
//    val data = flowOf(1, 3, 5, 45) //.flowOn(Dispatchers.IO)

    // Kotlin Flow - asFlow( ) method
    /* val data = listOf(1, 2, 3, 4, 5, 6).asFlow().flowOn(Dispatchers.IO) //.flowOn(Dispatchers.IO)

     runBlocking {
         data.collect {
             Log.d("main", "OnCreate: $it")
         }
     }*/

    // Kotlin Flow - map { } operator

    /* val data = flowOf(1,2,3,4,5,6).flowOn(Dispatchers.IO)
     runBlocking {
         data.map { value ->
             value * value
         }.collect {
             Log.d("main","OnCreate: $it")
         }
     }*/

    // Kotlin Flow - filter { } operator
    /*  val data = flowOf(1,2,3,4,5,6,7,8,9,10).flowOn(Dispatchers.IO)
      runBlocking {
          data.filter { value->
              value%2 == 0

          }.collect {
              Log.d("main","OnCreate: $it")
          }
      }*/
}

// Kotlin Flow - flow {} builder block
/*
fun getData(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(1000)
        emit(i)
    }
}.flowOn(Dispatchers.IO)*/
