package com.example.practiumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtIntro = findViewById<TextView>(R.id.txtIntro)
        val editStudentNum = findViewById<EditText>(R.id.editStudentNum)
        val editName = findViewById<EditText>(R.id.editName)
        val btnMainScreen = findViewById<Button>(R.id.btnBack)
        val btnExit = findViewById<Button>(R.id.btnExit)
        val txtMetheorologist = findViewById<TextView>(R.id.txtMetheorologist)

        btnMainScreen.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        btnExit.setOnClickListener {
            val intent = Intent( this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}
    }
}