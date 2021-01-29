package com.example.jasaku.fragments

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.replace
import com.example.jasaku.ForgetPassword
import com.example.jasaku.Login
import com.example.jasaku.R
import kotlinx.android.synthetic.main.fragment_akun.*
import kotlinx.android.synthetic.main.fragment_akun.view.*
import kotlinx.android.synthetic.main.fragment_profil.*
import kotlinx.android.synthetic.main.fragment_profil.view.*

class ProfilFragment : Fragment(R.layout.fragment_profil) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val view: View = inflater.inflate(R.layout.fragment_profil, container, false)

        view.profilbckbtn.setOnClickListener {
            val backfragmentAkun = AkunFragment()
            requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_wrapper, backfragmentAkun, "fragmentId")
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}

