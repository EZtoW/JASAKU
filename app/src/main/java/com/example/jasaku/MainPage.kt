package com.example.jasaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.jasaku.fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.mainpage.*

class MainPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)

        val homeFragment = BerandaFragment()
        val historyFragment = RiwayatFragment()
        val accountFragment = AkunFragment()
        val transactionFragment = PesananFragment()
        val chatFragment = ChatFragment()

        makeCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_history -> makeCurrentFragment(historyFragment)
                R.id.ic_account -> makeCurrentFragment(accountFragment)
                R.id.ic_transaction -> makeCurrentFragment(transactionFragment)
                R.id.ic_chat -> makeCurrentFragment(chatFragment)
            }
            true
        }

        supportActionBar?.hide()
    }

    private fun makeCurrentFragment(fragment: Fragment) =
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_wrapper, fragment)
                commit()
            }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@MainPage, Login::class.java))
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)

    }
}