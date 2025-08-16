package com.example.lovecalculator


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.editTextName)
        val partnerEditText = findViewById<EditText>(R.id.editPartnerName)
        val submitButton = findViewById<Button>(R.id.buttonSubmit)

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val partnerName = partnerEditText.text.toString()

            // Generate random percentage between 50 and 100 (for fun)
            val score = Random.nextInt(50, 101)

            Toast.makeText(
                this,
                "$name ❤️ $partnerName\nScore: $score%",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}

