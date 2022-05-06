package com.yogesh.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.etInputText)
        val submitButton = findViewById<Button>(R.id.btnSubmit)
        val offersButton = findViewById<Button>(R.id.btnOffers)

        var enterName = ""
        //
        submitButton.setOnClickListener {
             enterName = inputField.text.toString()

            //setting conditions
            if (enterName == ""){
                //making the offerButton invisible
                    offersButton.visibility = INVISIBLE
                //making the textView empty
                    greetingTextView.text = ""
                Toast.makeText(
                    this@MainActivity,
                    "Please Enter Your Name",
                    Toast.LENGTH_SHORT)
                    .show()
            }else{
                val message = "Welcome $enterName"
                greetingTextView.text = message
                //clearing the inputField after above process
                inputField.text.clear()

                //making the second button which is invisible to visible after clinking on the submit button
                offersButton.visibility = VISIBLE
            }
        }

        //
        offersButton.setOnClickListener{
            //created intent object
            val intent = Intent(this@MainActivity, MainActivity2::class.java)

            //sending the string from one screen to another screen by using putExtar()
            intent.putExtra("USER",enterName)

            startActivity(intent)
        }
    }
}