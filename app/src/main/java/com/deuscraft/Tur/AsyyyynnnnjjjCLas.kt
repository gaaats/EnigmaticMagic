package com.deuscraft.Tur

import android.content.Context
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup
import com.deuscraft.Tur.ApApApClass.Companion.C1gtgt
import com.deuscraft.Tur.ApApApClass.Companion.D1gttg
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers


class AsyyyynnnnjjjCLas(val context: Context) {
    private var ggtgtgt: String = ""

    suspend fun bgbgbg(): String {

        val juujju: String? = Hawk.get(C1gtgt)
        val nhnnhnh: String? = Hawk.get(D1gttg)


        val nhnhnh = "${ApApApClass.linkFilterPart1frrf}${ApApApClass.frfrrf}${ApApApClass.gtgttg}$juujju"
        val bgbgbg = "${ApApApClass.linkFilterPart1frrf}${ApApApClass.frfrrf}${ApApApClass.gtgttg}$nhnnhnh"

        withContext(Dispatchers.IO) {
            if (juujju != "null") {
                vbbvvbvb(nhnhnh)
            } else {
                vbbvvbvb(bgbgbg)
            }
        }
        return ggtgtgt
    }

    private fun vbbvvbvb(link: String) {
        val nhnhnnh = Jsoup.connect(link).get().text()
        ggtgtgt = nhnhnnh
    }
}