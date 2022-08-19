package ru.synergy.kotlinpractice

enum class Operation {
    ADD, SUBSTRACT, MULTIPLY, DIVIDE

}

fun operate (n1: Int, n2: Int, op: Operation): Int{
    when(op){
        Operation.ADD -> return n1+n2
        Operation.SUBSTRACT -> return n1-n2
        Operation.MULTIPLY -> return n1*n2
        Operation.DIVIDE -> return n1/n2
    }
}
        // делегирование
interface Base{
    fun someFun()
}

class BaseImp(): Base{
    override fun someFun(){

    }
}

class Derived(someBase: Base): Base by someBase


interface Messenger{
    fun send(message: String)
}

class InstantMessenger(val programName: String): Messenger{
    override fun send(message: String){
        println("Messenger '$message' has been sent")
    }
}

class SmartPhone(val name: String, m: Messenger): Messenger by m


fun test(){
    val telegram = InstantMessenger("telegram")
    val whatsapp = InstantMessenger("Whatsapp")

    val pixel = SmartPhone("Pixel 5", telegram)
    pixel.send("Hello from Kotlin")
    pixel.send("Hello from synergy")
}
