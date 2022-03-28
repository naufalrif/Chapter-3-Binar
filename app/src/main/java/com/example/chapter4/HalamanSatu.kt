package com.example.chapter4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_halaman_satu.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HalamanSatu.newInstance] factory method to
 * create an instance of this fragment.
 */
class HalamanSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_halaman_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_toast_satu.setOnClickListener {
            Toast.makeText(requireContext(), "Ini Toast", Toast.LENGTH_LONG).show()

        }

        btn_snackbar_baru.setOnClickListener {
            Snackbar.make(it, "Ini snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Move"){
                    Navigation.findNavController(view).navigate(R.id.action_halamanSatu_to_halamanKedua)
                }
                .show()
        }
    }
}