package com.deuscraft.Tur

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.deuscraft.Tur.databinding.FragmentInfoBinding
import com.google.android.material.snackbar.Snackbar

class InfoFragment : Fragment() {
    private var gtgtgt: FragmentInfoBinding? = null
    private val jujujjujju get() = gtgtgt ?: throw RuntimeException("FragmentInfoBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gtgtgt = FragmentInfoBinding.inflate(inflater, container, false)
        return jujujjujju.root
    }

    override fun onDestroy() {
        gtgtgt = null
        super.onDestroy()
    }

    private fun kpkpkpkp() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Current data will not be saved, EXIT?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().onBackPressed()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }



    private fun detdefdfe() {
        Snackbar.make(
            jujujjujju.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            jujujjujju.btnImgExitInfo.setOnClickListener {
                kpkpkpkp()
            }
            jujujjujju.btnOj.setOnClickListener {
                requireActivity().onBackPressed()
            }

        } catch (e: Exception) {
            detdefdfe()
        }


        super.onViewCreated(view, savedInstanceState)
    }



}