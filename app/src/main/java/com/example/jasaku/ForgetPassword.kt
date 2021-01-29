package com.example.jasaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ForgetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgetpass)

        supportActionBar?.hide()
    }

    fun tmblresetpassword(view: View) {
        val resetpass_click_me = findViewById<TextView>(R.id.btnResetPass)
        resetpass_click_me.setOnClickListener {
            startActivity(Intent(this@ForgetPassword, ChngPassVerif::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}