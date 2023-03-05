package kotlin_learn_wscub

import kotlin.concurrent.timerTask

fun main() {

    val taskName: String = "Download Task"
    val taskManager = TaskManagerDelegations(BgTask(taskName), BgExeute(taskName))

    taskManager.Create()
    taskManager.Exceute()


}

interface ExecuteTask {

    fun Exceute()

}

interface Task {

    fun Create()

}

class BgTask(val taskName: String): Task {
    override fun Create() {
        println("Task : $taskName Created!")
    }

}

class BgExeute(val taskName: String): ExecuteTask{
    override fun Exceute() {
        println("Task: $taskName is Executing....")
    }

}

class TaskManagerDelegations(val creator: Task, val execute: ExecuteTask)
    : Task by creator, ExecuteTask by execute {

}