package com.example.jasaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ChngPassVerif : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chngpassverif)

        supportActionBar?.hide()
    }

    fun tmblVerifEmail(view: View) {
        val verifemail_click_me = findViewById<TextView>(R.id.btnVerifEmail)
        verifemail_click_me.setOnClickListener {
            startActivity(Intent(this@ChngPassVerif, Login::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}