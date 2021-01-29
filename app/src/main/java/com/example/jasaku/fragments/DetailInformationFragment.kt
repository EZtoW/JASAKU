package com.example.jasaku.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jasaku.R
import kotlinx.android.synthetic.main.fragment_detail_information.view.*
import kotlinx.android.synthetic.main.fragment_penyedia_jasa.view.*

class DetailInformationFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val view: View = inflater.inflate(R.layout.fragment_detail_information, container, false)

        view.kirimPesan.setOnClickListener {
            val kirimChat = ChatFragment()
            requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_wrapper, kirimChat, "fragmentId")
                .addToBackStack(null)
                .commit()
        }

        view.bookingJasa.setOnClickListener {
            val bkgJasa = BookingConfirmation()
            requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_wrapper, bkgJasa, "fragmentId")
                .addToBackStack(null)
                .commit()
        }

        view.bckPenyediaJasa.setOnClickListener {
            val backPenyediaJasa = PenyediaJasaFragment()
            requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_wrapper, backPenyediaJasa, "fragmentId")
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}