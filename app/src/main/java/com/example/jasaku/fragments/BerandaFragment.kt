package com.example.jasaku.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jasaku.R
import kotlinx.android.synthetic.main.fragment_beranda.view.*
import kotlinx.android.synthetic.main.fragment_profil.view.*

class BerandaFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {


    val view: View = inflater.inflate(R.layout.fragment_beranda, container, false)

    view.itsupport_cv.setOnClickListener {
      val gotoPenyediaJasa = PenyediaJasaFragment()
      requireActivity().getSupportFragmentManager().beginTransaction()
        .replace(R.id.fl_wrapper, gotoPenyediaJasa, "fragmentId")
        .addToBackStack(null)
        .commit()
    }

    return view
  }
}