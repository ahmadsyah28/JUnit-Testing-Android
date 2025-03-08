package com.example.junittestingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var etFirstNumber: EditText
    private lateinit var etSecondNumber: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    private val calculator = Calculator()
    private val inputValidator = InputValidator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener {
            calculateResult()
        }
    }

    private fun calculateResult() {
        val firstNumberStr = etFirstNumber.text.toString()
        val secondNumberStr = etSecondNumber.text.toString()

        if (!inputValidator.isValidNumber(firstNumberStr) || !inputValidator.isValidNumber(secondNumberStr)) {
            Toast.makeText(this, "Harap masukkan angka yang valid", Toast.LENGTH_SHORT).show()
            return
        }

        val firstNumber = firstNumberStr.toInt()
        val secondNumber = secondNumberStr.toInt()

        val result = calculator.add(firstNumber, secondNumber)
        tvResult.text = "Hasil: $result"
    }
}