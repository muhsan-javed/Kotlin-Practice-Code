package kotlin_learn_wscub

import kotlin.concurrent.timerTask

fun main() {
    /*             ********************  Delegations Kotlin *********************************
    => Inheritance implementation in classes and functions can be altered with the help of delegation techniques.
    => Object-oriented programing languages support it innately without any boilerplate code.
    => Delegation is used in Kotlin with the help of "by" keyword.
       */
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

class BgTask(val taskName: String) : Task {
    override fun Create() {
        println("Task : $taskName Created!")
    }

}

class BgExeute(val taskName: String) : ExecuteTask {
    override fun Exceute() {
        println("Task: $taskName is Executing....")
    }

}

class TaskManagerDelegations(val creator: Task, val execute: ExecuteTask) : Task by creator, ExecuteTask by execute
/*
{

    override fun Exceute() {
        execute.Exceute()
    }

    override fun Create() {
       creator.Create()
    }
}*/
