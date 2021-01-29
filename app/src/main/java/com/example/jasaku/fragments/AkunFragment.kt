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
import com.example.jasaku.Register
import kotlinx.android.synthetic.main.fragment_akun.*
import kotlinx.android.synthetic.main.fragment_akun.view.*
import kotlinx.android.synthetic.main.fragment_profil.*

class AkunFragment : Fragment(R.layout.fragment_akun) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {


    val view: View = inflater.inflate(R.layout.fragment_akun, container, false)

    view.gotoProfil.setOnClickListener {
      val fragmentProfil = ProfilFragment()
      requireActivity().getSupportFragmentManager().beginTransaction()
        .replace(R.id.fl_wrapper, fragmentProfil, "fragmentId")
        .addToBackStack(null)
        .commit()
    }

    view.gotoProfil.setOnClickListener {
      val fragmentProfil = ProfilFragment()
      requireActivity().getSupportFragmentManager().beginTransaction()
        .replace(R.id.fl_wrapper, fragmentProfil, "fragmentId")
        .addToBackStack(null)
        .commit()
    }

    view.btnJasaSaya.setOnClickListener {
      val fragmentJasaSaya = JasaSaya()
      requireActivity().getSupportFragmentManager().beginTransaction()
        .replace(R.id.fl_wrapper, fragmentJasaSaya, "fragmentId")
        .addToBackStack(null)
        .commit()
    }

    return view
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    btnlogout.setOnClickListener {
      val intent = Intent(context, Login::class.java)
      startActivity(intent)
    }
  }
}

