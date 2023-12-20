package ru.tweek.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input: EditText = findViewById(R.id.input)
        val input2: EditText = findViewById(R.id.input2)
        val output: TextView = findViewById(R.id.output)
        val button_plus: Button = findViewById(R.id.plus)
        val button_minus: Button = findViewById(R.id.minus)
        val button_mul: Button = findViewById(R.id.mul)
        val button_div: Button = findViewById(R.id.div)

        button_plus.setOnClickListener {
            if (input.text.isNotEmpty()) {
                output.text = (input.text.toString().toDouble() + input2.text.toString()
                    .toDouble()).toString()
            }
        }
        button_minus.setOnClickListener {
            if (input.text.isNotEmpty()){
                output.text = (input.text.toString().toDouble() - input2.text.toString().toDouble()).toString()
            }
        }
        button_mul.setOnClickListener {
            if (input.text.isNotEmpty()){
                output.text = (input.text.toString().toDouble() * input2.text.toString().toDouble()).toString()
            }
        }
        button_div.setOnClickListener {
            if (input.text.isNotEmpty()){
                output.text = (input.text.toString().toDouble() / input2.text.toString().toDouble()).toString()
            }
        }

    }

}