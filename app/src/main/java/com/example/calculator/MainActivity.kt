package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var operation: TextView? = null
    private var btn_0: TextView? = null
    private var btn_1: TextView? = null
    private var btn_2: TextView? = null
    private var btn_3: TextView? = null
    private var btn_4: TextView? = null
    private var btn_5: TextView? = null
    private var btn_6: TextView? = null
    private var btn_7: TextView? = null
    private var btn_8: TextView? = null
    private var btn_9: TextView? = null
    private var minus_btn: TextView? = null
    private var plus_btn: TextView? = null
    private var mult_btn: TextView? = null
    private var div_btn: TextView? = null
    private var obrk_btn: TextView? = null
    private var cbrk_btn: TextView? = null
    private var ac_btn: TextView? = null
    private var result_text: TextView? = null
    private var back_btn: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operation = findViewById(R.id.math_operation)
        btn_0 = findViewById(R.id.btn_0)
        btn_1 = findViewById(R.id.btn_1)
        btn_2 = findViewById(R.id.btn_2)
        btn_3 = findViewById(R.id.btn_3)
        btn_4 = findViewById(R.id.btn_4)
        btn_5 = findViewById(R.id.btn_5)
        btn_6 = findViewById(R.id.btn_6)
        btn_7 = findViewById(R.id.btn_7)
        btn_8 = findViewById(R.id.btn_8)
        btn_9 = findViewById(R.id.btn_9)
        minus_btn = findViewById(R.id.minus_btn)
        plus_btn = findViewById(R.id.plus_btn)
        mult_btn = findViewById(R.id.mult_btn)
        div_btn = findViewById(R.id.div_btn)
        obrk_btn = findViewById(R.id.obrk_btn)
        cbrk_btn = findViewById(R.id.cbrk_btn)
        ac_btn = findViewById(R.id.ac_btn)
        result_text = findViewById(R.id.result_text)
        back_btn = findViewById(R.id.back_btn)
        btn_0?.setOnClickListener { setTextField("0") }
        btn_1?.setOnClickListener { setTextField("1") }
        btn_2?.setOnClickListener { setTextField("2") }
        btn_3?.setOnClickListener { setTextField("3") }
        btn_4?.setOnClickListener { setTextField("4") }
        btn_5?.setOnClickListener { setTextField("5") }
        btn_6?.setOnClickListener { setTextField("6") }
        btn_7?.setOnClickListener { setTextField("7") }
        btn_8?.setOnClickListener { setTextField("8") }
        btn_9?.setOnClickListener { setTextField("9") }
        minus_btn?.setOnClickListener { setTextField("-") }
        plus_btn?.setOnClickListener { setTextField("+") }
        mult_btn?.setOnClickListener { setTextField("*") }
        div_btn?.setOnClickListener { setTextField("/") }
        obrk_btn?.setOnClickListener { setTextField("(") }
        cbrk_btn?.setOnClickListener { setTextField(")") }
        ac_btn?.setOnClickListener {
            operation?.text = ""
            result_text?.text = ""
        }

        back_btn?.setOnClickListener {
            val str = operation?.text.toString()
            if (str.isNotEmpty()) {
                operation?.text = str.substring(0, str.length - 1)
            }
        }

    }

    fun setTextField(str: String) {
        operation = findViewById(R.id.math_operation)
        operation?.append(str)
    }
}