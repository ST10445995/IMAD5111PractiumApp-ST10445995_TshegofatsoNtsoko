package com.example.practiumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var btnDetailViews: Button
    private lateinit var btnClear: Button
    private lateinit var btnMainScreen: Button
    private lateinit var txtResults: TextView


    private val weatherData = arrayOf(
        DayWeather("Monday", 15, 25, "Sunny"),
        DayWeather("Tuesday", 17, 22, "Cloudy"),
        DayWeather("Wednesday", 13, 19, "Rainy"),
        DayWeather("Thursday", 14, 20, "Partly Cloudy"),
        DayWeather("Friday", 16, 24 "Sunny"),
        DayWeather("Saturday", 18, 26, "Sunny"),
        DayWeather("Sunday", 15, 21, "Windy"))

    data class DayWeather(
        val day: String,
        val minTemp: Double,
        val maxTemp: Double,
        val condition: Double
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val avgTemp = calculateAverageTemp()
        txtResults.text = "Average Temperature in degrees C: $avgTemp"

        btnDetailViews.setOnClickListener {
            val intent2 = Intent(this, MainActivity3::class.java)
            startActivity(intent2)
        }
    }

    private fun calculateAverageTemp(): Double {
        var totalTemp = 0
        weatherData.forEach {
            totalTemp += (it.minTemp + it.maxTemp) / 2
        }
        return totalTemp / weatherData.size.toDouble()
    }
}



