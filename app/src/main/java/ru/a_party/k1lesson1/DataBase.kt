package ru.a_party.k1lesson1

object DataBase {
    fun getArrayPerson():List<Person>{
        val persons: List<Person> = listOf(
            Person("Вася",12,Gender.man),
            Person("Катя",14,Gender.woman),
            Person("Илья",45,Gender.man)
        )
        return persons
    }
}