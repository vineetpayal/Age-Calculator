package com.vineet.ageinminutes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var datePicker : DatePicker;
    lateinit var btnCalculate: Button;
    lateinit var textViewSeconds: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        datePicker = findViewById(R.id.date_picker);
        btnCalculate = findViewById(R.id.btn_calculate);
        textViewSeconds = findViewById(R.id.tv_seconds);


        btnCalculate.setOnClickListener {
            textViewSeconds.text = calculateSeconds(datePicker)
        }
    }

    private fun calculateSeconds(date: DatePicker) : String{
        var day = date.dayOfMonth
        var month = date.month
        var year = date.year

        var c : Calendar = Calendar.getInstance()

        c.set(year,month,day)

        return (c.timeInMillis/1000).toString() + " seconds old"

    }

}