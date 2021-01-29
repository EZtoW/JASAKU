package com.example.jasaku.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jasaku.R
import kotlinx.android.synthetic.main.fragment_beranda.view.*
import kotlinx.android.synthetic.main.fragment_booking_confirmation.view.*
import kotlinx.android.synthetic.main.fragment_penyedia_jasa.view.*

class BookingConfirmation : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val view: View = inflater.inflate(R.layout.fragment_booking_confirmation, container, false)

        view.btnBkgConfirmation.setOnClickListener {
            val konfirmasiBooking = BerandaFragment()
            requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_wrapper, konfirmasiBooking, "fragmentId")
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}