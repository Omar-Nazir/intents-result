package com.example.resultdemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    private lateinit var inputEditText: EditText
    private lateinit var returnButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        inputEditText = findViewById(R.id.inputEditText)
        returnButton = findViewById(R.id.returnButton)

        returnButton.setOnClickListener {
            val inputText = inputEditText.text.toString().trim()

            if (inputText.isEmpty()) {
                Toast.makeText(this, "Input cannot be empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val resultIntent = Intent()
            resultIntent.putExtra("resultData", inputText)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}