package ru.synergy.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val tom:Person = Person("Tom")
        val alice:Person = Person("Alice")
        val bob:Person = Person("Bob")
        tom.age = 37

        tom.sayHello()
        tom.go("the shop")
        println(tom.personToString())


    }
}

