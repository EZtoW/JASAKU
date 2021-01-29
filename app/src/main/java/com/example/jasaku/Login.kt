package com.example.jasaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.loginpage.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage)

        supportActionBar?.hide()

    }

    fun tmblLogin(view: View) {
        val button = findViewById<Button>(R.id.btnLogin)
        button.setOnClickListener{
            startActivity(Intent(this@Login, MainPage::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
    }

    fun forgetPassword(view: View) {
        val forgetpass_click_me = findViewById<TextView>(R.id.forgetpass)
        forgetpass_click_me.setOnClickListener {
            startActivity(Intent(this@Login, ForgetPassword::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
    }

    fun registertextview(view: View) {
        val register_click_me = findViewById<TextView>(R.id.register_textview)
        register_click_me.setOnClickListener {
            startActivity(Intent(this@Login, Register::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
    }

}