package com.deuscraft.Tur

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.deuscraft.Tur.databinding.FragmentEnndBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.delay
import kotlin.random.Random


class EnndFragment : Fragment() {
    private var bggb: FragmentEnndBinding? = null
    private val hyhyjiki get() = bggb ?: throw RuntimeException("FragmentEnndBinding = null")

    val text = "Розвиток сучасної науки і техніки та ринкової економіки вдосконалив матеріальне і духовне життя людей, але водночас поглинув їхній критичний дух і рефлексивну свідомість. Освіта є ефективним засобом реалізації вільного і всебічного розвитку людини. Міркування Герберта Маркузе про одновимірну людину викликали нові роздуми про сучасну двовимірну ідеологічну та політичну освіти і теорії всебічного розвитку."


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bggb = FragmentEnndBinding.inflate(inflater, container, false)
        return hyhyjiki.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            var currentPoint = Random.nextInt(from = 100, until = 5000)
            currentPoint = fakeFun(currentPoint)

            if (currentPoint == 33333){
                lucky()
            }

            Snackbar.make(
                hyhyjiki.root,
                "You have $currentPoint points",
                Snackbar.LENGTH_LONG
            ).show()


            iniSomeFun()


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        bggb = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            hyhyjiki.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun lucky() {
        Snackbar.make(
            hyhyjiki.root,
            text,
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun fakeFun(currentPoint: Int): Int {
        var currentPoint1 = currentPoint
        currentPoint1 += 500
        currentPoint1 += 55
        currentPoint1 += 62
        return currentPoint1
    }

    private fun iniSomeFun() {
        lifecycleScope.launchWhenCreated {
            delay(1700)
            findNavController().navigate(R.id.action_enndFragment_to_startFragment)
        }
    }

}