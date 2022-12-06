package com.deuscraft.Tur

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.deuscraft.Tur.databinding.FragmentStartBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class StartFragment : Fragment() {


    private var vfvfvf: FragmentStartBinding? = null
    private val juujju
        get() = vfvfvf ?: throw RuntimeException("FragmentStartBinding = null")

    val totto =
        "Ensuring the effective use of budget funds is one of the key problems of budget execution in most countries of the world. According to international practice, one of the mechanisms for ensuring the quality implementation of the use budget is program budgeting."

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vfvfvf = FragmentStartBinding.inflate(inflater, container, false)
        return juujju.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            juujju.btnImgHelper.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_infoFragment2)
            }

            juujju.btnElem8.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem9.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem10.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem13.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem12.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }


            if (totto == "555") {
                Snackbar.make(
                    juujju.root,
                    totto,
                    Snackbar.LENGTH_LONG
                ).show()
            }

            juujju.root.background.alpha = 230



            juujju.btnElem1.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem2.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem3.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem4.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem5.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem6.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            juujju.btnElem7.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }


        } catch (e: Exception) {
            afrhgthUygt()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    override fun onDestroy() {
        vfvfvf = null
        super.onDestroy()
    }

    private fun afrhgthUygt() {
        Snackbar.make(
            juujju.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun slonny(imageView: ImageView) {
        lifecycleScope.launch {
            while (true) {
                var ismsms = bgbgbbg
                var gtjitji = plfr
                imageView.alpha = ismsms
                if (ismsms >= 1f) {
                    gtjitji = -0.05f
                }
                if (ismsms <= 0.1f) {
                    gtjitji = 0.05f
                }
                delay(30)
                ismsms += gtjitji
            }
        }
    }

    private fun isisKfjr(imageView: ImageView): Boolean {
        if (imageView.visibility == View.GONE) {
            return true
        }
        return false
    }

    private fun polskks() {
        if (isisKfjr(juujju.btnElem1) && isisKfjr(juujju.btnElem2) && isisKfjr(
                juujju.btnElem3
            ) && isisKfjr(juujju.btnElem4) && isisKfjr(juujju.btnElem5) && isisKfjr(
                juujju.btnElem6
            ) && isisKfjr(juujju.btnElem7) && isisKfjr(juujju.btnElem8) && isisKfjr(
                juujju.btnElem9
            ) && isisKfjr(juujju.btnElem10) && isisKfjr(juujju.btnElem13) && isisKfjr(
                juujju.btnElem12
            )
        ) {
            findNavController().navigate(R.id.action_startFragment_to_enndFragment)
        }
    }

    private fun alalalet() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Exit, realy?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

    var bgbgbbg = 0.8f
    var plfr = 0.05f

}