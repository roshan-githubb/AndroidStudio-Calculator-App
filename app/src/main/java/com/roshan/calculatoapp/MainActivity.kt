package com.roshan.calculatoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var et1: EditText
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btn0: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1=findViewById(R.id.et1)
        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)
        btn4=findViewById(R.id.btn4)
        btn5=findViewById(R.id.btn5)
        btn6=findViewById(R.id.btn6)
        btn7=findViewById(R.id.btn7)
        btn8=findViewById(R.id.btn8)
        btn9=findViewById(R.id.btn9)
    }


    fun numberEvent(view: View) {
        var buclick=et1.text.toString()
        var buselect=view as Button
        when(buselect.id){
            btn1.id->{buclick +="1"}
            btn2.id->{buclick +="2"}
            btn3.id->{buclick +="3"}
            btn4.id->{buclick +="4"}
            btn5.id->{buclick +="5"}
            btn6.id->{buclick +="6"}
            btn7.id->{buclick +="7"}
            btn8.id->{buclick +="8"}
            btn9.id->{buclick +="9"}
            btn0.id->{buclick +="0"}
        }
        et1.setText(buclick)
    }
}