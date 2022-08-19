package ru.synergy.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // val | var имя переменной : тип_переменной


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // val age = Int = 23
//        // println(age)
//
//        val age : Int // val - final(неизменяемая переменная) var - изменяемая переменная
//        age = 23
//        println(age)
//
//        var age : Int = 23
//        age = 17
//
//        var example1 : Byte
//        var example2 : Short
//        var example3 : Int
//        var example4 : Long
//        var example5 : UByte // 0-255 Bytes
//        var example6: UShort
//
//        val address: Int = 0x0A1 // 161
//        val example7 : Double = 23e3 // 23000
//        val example8 : String = "hello \n world"
//        val example9 : String = """hello
//            |my
//            |world
//        """.trimMargin()

        // шаблоны строк

//        val firstName : String = "Tom"
//        val secondName : String = "Smith"
//        val wellcome: String = "Hello, $firstName $secondName"
//        println(wellcome)
////
//
//        var wellcomeDublicate = wellcome
//        var wellcom2 : Any = "String"
//
//        readLine()
//
//        val a = true
//        val b = false
//        var c = a and b // java &&
//        c = a or b // java ||
//        c = a xor b //
//        c = a.not()     // java !
//
//        val d = 5
//        val e = d in 1..6 // массив 1 - 6

       // if( a == b) d else e

        // swith cases

        /*
       * when(объект) {
       * значение1 -> действие1
       * значение2 -> действие2
       * значение3 -> действие3
       *
       * }
         */

//        val param = 10
//        when (param){
//            in 1..10 -> println("isEnabled on")
//            11, 12 -> println("isEnabled off")
//            else -> println("undefined variable")
//        }
//
//        val firstArg = 15
//        val secondArg = 6
//        val newArg: Unit = when{
//            (firstArg >10 ) -> println("firstArg >10")
//            (secondArg > 10) -> println("secondArg >10")
//            else -> println("first и second <10")
//        }
//
//        for ( n in 1..9){
//            println("${n*n} \t")
//        }

        // последовательности

//        var range: Any = 1..5 // [1,2,3,4,5]
//        range = "A".."F"
//
//
//        range = 5 downTo 1 // [5,4,3,2,1]
//        range = 5 downTo 1 step 2 // [5,3,1]
//        range = 1 until 5 // [1,2,3,4]
//        range = 1 until 5 step 2 // [1,3]
//        range = 2 in 1 until 5 // true
//        range = 2 in 1 until 5 step 2 // false

//        for(c in 1..9) println(c)
//
//        val numbers : Array<Int> = arrayOf(1,2,3,4,5,6)
//        val n = numbers[1]
//        numbers[3] = 7
//        println("numbers[2] = ${numbers[2]}")
//
//
//        var i = 2
//      // val numbers2 = Array(3, {5})  // [5,5,5]
//
//       val numbers2 = Array(3, {i++ * 2}) // [2,4,6]
//
//        for(number in numbers) print("$number \t")
//
//        val people = arrayOf("Tom", "Sam", "Bob")
//        for(person in people)
//            print("$person \t")
//
//        while (i in people.indices){
//            print("${people[i]} \t")
//            i++
//        }
//
//        for (i in people.indices){
//            print("${people[i]} \t")
//        }
//
//        val integers : IntArray = intArrayOf(1,2,3,4,5,6)
//        val doubles : DoubleArray = doubleArrayOf(1.3, 1.8, 1.29)
//
//        integers = IntArray(3,{5})
//        doubles = DoubleArray(3, {1.7})


        // Lesson 56

        displayUser("Tom", 23)
        displayUser("Alex", 5)
        displayUser("Kate", 0)
        displayUser("John")

        displayUser(age = 20, name = "Andrew")

        printStrings("Tom", "Bob", "Sam")
        printStrings("Kotlin", "JavaStcript", "Java", "C#", "C++")

     //  sum(7,4,3,2,6,78,9)

        val nums = intArrayOf(1,2,3,4,5) //   * - spread operator
        changeNumbers(2, *nums)

        val a = sum(1,3, 10)

//        var message: () -> Unit
//        message =  ::hello
//        message()  // Hello Kotlin
//
//        message = ::bye
//        message() // Bye bye Kotlin

        displayMessage { ::hello }() // Hello kotlin x2
        displayMessage { ::bye }

        val operation: (Int, Int) -> Int = ::sum
        val result = operation(3,5)
        println(result) // 8


        // анонимные функции
       val c = fun(x: Int, y: Int): Int{    // val c = fun(x: Int, y: Int): Int = x+y
            return x+y
        }


        var sum = {x: Int, y: Int->
            val result = x + y
            print("$x + $y = $result")
        }

        sum = {x: Int, y: Int -> x+y}

        doOperation(9,5, fun(x: Int, y: Int): Int = x+y)
        doOperation(9,5) { x: Int, y: Int -> x - y }

        val hello = {print("Hello")}
        hello() // Hello

        val printer = {message: String -> println(message)}
        printer("Hello")




    }

    fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int){
        val result = op(x,y)
        println(result)
    }

    fun displayUser(name: String, age: Int = 18){
        println("Name: $name, Age: $age")
    }

//    fun double(n : IntArray){
//        n[0] = n[0] * 2
//    }

    fun double (n : Int){
        var a = n
    }

    fun printStrings(vararg args : String){
        for(str in args){
            println(str)
        }
    }

//    fun sum(operand: String, vararg numbers : Int){
//        var result = 0
//        for(n in numbers)
//            result = +n
//    }

//    fun sum(vararg numbers : Int){
//        var result = 0
//        for(n in numbers)
//            result = +n
//        println(result)
//    }
//
    fun sum(x : Int, y : Int): Int{  // (Int, Int) -> Int
        return x+y
    }

    fun sum(x: Int, y: Int, z: Int){ // (Int, Int, Int) -> Unit
        println(x+y+z)
    }

    fun changeNumbers(koef : Int, vararg numbers: Int){
        for(number in numbers)
            println(number*koef)
    }

    fun square(x: Int): Int = x * x

    fun compareAge(age1: Int, age2: Int){
        fun ageIsValid(age: Int): Boolean{

            return (age > 0) and (age < 111)
        }
        if(!ageIsValid(age1) or !ageIsValid(age2)){

        }
    }

    // (типы параметров) -> возвращаемый_тип

    fun hello(){  // {} Unit
        print("Hello Kotlin")
    }

    fun bye(){  // {} Unit
        print("Bye bye Kotlin")
    }

    fun displayMessage(message: () -> Unit): () -> Unit { // high order function
        message()

        val c = {_:Any, _:Any -> 0}
        return message
        }
    }

