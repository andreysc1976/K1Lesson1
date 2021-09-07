package ru.a_party.k1lesson1

data class Person(val name:String, var age:Int,val gender: Gender){
    override fun toString(): String {
        return "$gender - $name, возраст $age"
    }
}

