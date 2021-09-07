package ru.a_party.k1lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener { Toast.makeText(this,"Ай Ай Ай",Toast.LENGTH_LONG).show()  }

        val person1  = Person("Вася",16,Gender.man)
        val person2 = Person("Лена",16,Gender.woman)
        val person3 = person1.copy()
        //прошел год
        person1.age++
        person2.age++



        findViewById<Button>(R.id.button2).setOnClickListener {
            val i = Random.nextInt(3)
            it.rootView.findViewById<TextView>(R.id.textView).text = if (i==0) person3.toString() else if (i==1) person2.toString() else person1.toString()
        }

        findViewById<Button>(R.id.List).setOnClickListener {
            val persons = DataBase.getArrayPerson()
            for (person:Person in persons){
                Toast.makeText(this,person.toString(),Toast.LENGTH_SHORT).show()
            }
        }

    }


}