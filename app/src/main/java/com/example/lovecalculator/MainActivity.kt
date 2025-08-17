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
        fun hideKeyboard() {
            val view = this.currentFocus
            if (view != null) {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }
        }

        submitButton.setOnClickListener {
            val nae = nameEditText.text.toString()
            val pn = partnerEditText.text.toString()

            val name = nae.split(" ")[0]
            val partnerName = pn.split(" ")[0]

            // Generate random percentage between 50 and 100 (for fun)
            val score = Random.nextInt(50, 101)
//hello
            hideKeyboard()
            val toast = Toast.makeText(
                this,
                "$name ❤️ $partnerName\nScore: $score%",
                Toast.LENGTH_LONG
            )
            toast.setGravity(android.view.Gravity.CENTER, 0, 0) // Center of screen
            toast.show()

        }
    }
}

