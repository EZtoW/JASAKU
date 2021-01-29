package com.example.jasaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        supportActionBar?.hide()
    }

    fun tmblRegister(view: View) {
        val button = findViewById<Button>(R.id.btnRegister)
        button.setOnClickListener{
            startActivity(Intent(this@Register, MainPage::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
    }

    fun onCheckBoxClicked(view: View) {}

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}