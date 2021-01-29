package com.example.jasaku.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jasaku.R
import kotlinx.android.synthetic.main.fragment_beranda.view.*
import kotlinx.android.synthetic.main.fragment_penyedia_jasa.view.*

class PenyediaJasaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val view: View = inflater.inflate(R.layout.fragment_penyedia_jasa, container, false)

        view.softwareEngineer.setOnClickListener {
            val detailSE = DetailInformationFragment()
            requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_wrapper, detailSE, "fragmentId")
                .addToBackStack(null)
                .commit()
        }

        view.backBeranda.setOnClickListener {
            val kembaliBeranda = BerandaFragment()
            requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_wrapper, kembaliBeranda, "fragmentId")
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}