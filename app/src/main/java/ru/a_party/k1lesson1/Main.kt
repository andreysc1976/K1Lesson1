package ru.a_party.k1lesson1

import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 1..10)
        {
            println(i)
        }

        for (i in 1..10 step 2)
        {
            println(i)
        }
    }
}