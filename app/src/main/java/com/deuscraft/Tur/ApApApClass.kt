package com.deuscraft.Tur

import android.app.Application
import android.content.Context
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers

class ApApApClass:Application() {

    companion object {
        const val jsoupCheckfrrf = "1v4b"
        const val AF_DEV_KEYfrfr = "DwEe3awdcCSYKi2VjovNyV"

        const val ONESIGNAL_APP_IDgtgttg = "fade9e7b-276f-4a28-bcae-530a329cb44d"

        val linkFilterPart1frrf = "http://enigmatic"
        val frfrrf = "magic.xyz/go.php?to=1&"
        val gtgttg = "sub_id_1="

        var MAIN_IDgttg: String? = ""
        var C1gtgt: String? = "c11"
        var D1gttg: String? = "d11"
        var CHgtgt: String? = "check"
        val gttggt = "http://enigmatic"
        val gtgtgtgt = "magic.xyz/apps.txt"



    }



    private suspend fun gffrrrf(gttgt: Context) {
        val vfvff = Adv(gttgt)
        val idInfouuuu = vfvff.getAdvertisingId()
        Hawk.put(MAIN_IDgttg, idInfouuuu)
    }

    override fun onCreate() {
        super.onCreate()

        GlobalScope.launch(Dispatchers.IO) {
            gffrrrf(gttgt = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_IDgtgttg)
        Hawk.init(this).build()
    }

}

class Adv (context: Context) {
    private val gtgtgtgt = AdvertisingIdClient(context.applicationContext)

    suspend fun getAdvertisingId(): String =
        withContext(Dispatchers.IO) {
            gtgtgtgt.start()
            val adIdInfogtgttgtg = gtgtgtgt.info
            Log.d("getAdvertisingId = ", adIdInfogtgttgtg.id.toString())
            adIdInfogtgttgtg.id
        }
}