package com.deuscraft.Tur

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.deuscraft.Tur.databinding.FragmentEnterNameBinding
import com.google.android.material.snackbar.Snackbar


class EnterNameFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bbgbgbg = FragmentEnterNameBinding.inflate(inflater, container, false)
        return nnhnhnh.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {
            nnhnhnh.btnPlayGameeee.setOnClickListener {
                try {
                    findNavController().navigate(R.id.action_enterNameFragment_to_startFragment)
                } catch (e: Exception) {
                    Snackbar.make(
                        nnhnhnh.root,
                        "Some error, restarting...",
                        Snackbar.LENGTH_LONG
                    )
                        .show()
                }
            }

        } catch (e: Exception) {
            Snackbar.make(nnhnhnh.root, "Some error, restarting...", Snackbar.LENGTH_LONG)
                .show()
        }
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        bbgbgbg = null
        super.onDestroyView()
    }

    private var bbgbgbg: FragmentEnterNameBinding? = null
    private val nnhnhnh get() = bbgbgbg ?: throw RuntimeException("FragmentEnterNameBinding = null")


}