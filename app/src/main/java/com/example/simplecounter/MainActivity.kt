package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // We use "var" because this type of variable can be changed or updated.
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Testing

        //Get a reference of the button
        val button = findViewById<Button>(R.id.button)
        //Get reference to our text view
        val textView = findViewById<TextView>(R.id.textView)
        //Get reference to the upgrade button
        val upgradeBtn = findViewById<Button>(R.id.upgradeBtn)

        button.setOnClickListener {
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()

            //Adds one to our counter variable
            counter++
            //Updates our text to show to value of our counter
            textView.text = counter.toString()

            //Creating the upgrade
            if(counter>=100){
                upgradeBtn.visibility = View.VISIBLE
                upgradeBtn.setOnClickListener {
                    button.text = "Add 2"

                    button.setOnClickListener {
                        counter = counter+2;
                        textView.text = counter.toString()
                    }

                    upgradeBtn.visibility = View.INVISIBLE
                }
            }
        }
    }
}