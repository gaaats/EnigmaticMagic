package com.deuscraft.Tur

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.deuscraft.Tur.ApApApClass.Companion.AF_DEV_KEYfrfr
import com.deuscraft.Tur.ApApApClass.Companion.C1gtgt
import com.deuscraft.Tur.ApApApClass.Companion.CHgtgt
import com.deuscraft.Tur.ApApApClass.Companion.D1gttg
import com.deuscraft.Tur.ApApApClass.Companion.gttggt
import com.deuscraft.Tur.ApApApClass.Companion.gtgtgtgt
import com.deuscraft.Tur.databinding.ActivityMainBinding
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.*
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var nhnhnh: ActivityMainBinding

    var nhnnh: String = "null"
    lateinit var bvbvbvb: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nhnhnh = ActivityMainBinding.inflate(layoutInflater)
        setContentView(nhnhnh.root)
        bvbvbvb = ""

        deePP(this)

        val bgbgbg = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (bgbgbg.getBoolean("activity_exec", false)) {

            when (Hawk.get<String>(CHgtgt)) {
                "2" -> {
                    skipMe()
                }
                else -> {
                    toTestGrounds()
                }
            }
        } else {
            val kikiki = bgbgbg.edit()
            kikiki.putBoolean("activity_exec", true)
            kikiki.apply()

            val jhhjjhh = GlobalScope.launch(Dispatchers.IO) {
                nhnnh = vfvffvf(gttggt+gtgtgtgt)
            }
            runBlocking {
                try {
                    jhhjjhh.join()
                } catch (_: Exception){
                }
            }

            when (nhnnh) {
                "1" -> {
                    initApps()
                    vvvvv(1500)
                }
                "2" -> {
                    skipMe()

                }
                "0" -> {
                    toTestGrounds()
                }
            }
        }
    }

    private fun initApps() {
        AppsFlyerLib.getInstance()
            .init(AF_DEV_KEYfrfr, conversionDataListener, applicationContext)
        AppsFlyerLib.getInstance().start(this)
    }


    private suspend fun vfvffvf(link: String): String {
        val twoStr = "2"
        val activeStrn = "0"
        val bvbvvb = URL(link)

        val oneStr = "1"

        val bbbbb = withContext(Dispatchers.IO) {
            bvbvvb.openConnection()
        } as HttpURLConnection

        return try {
            when (val text = bbbbb.inputStream.bufferedReader().readText()) {
                "2" -> {
                    Hawk.put(CHgtgt, twoStr)
                    twoStr
                }
                "1" -> {
                    oneStr
                }
                else -> {
                    activeStrn
                }
            }
        } finally {
            bbbbb.disconnect()
        }

    }

    private fun vvvvv(jujuuj: Long): Job {

        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val vbvbvb: String? = Hawk.get(C1gtgt)
                if (vbvbvb != null) {
                    toTestGrounds()
                    break
                } else {
                    val vbvbvb: String? = Hawk.get(C1gtgt)
                    delay(jujuuj)
                }
            }
        }
    }



    val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {

            val dataGotten = data?.get("campaign").toString()
            Hawk.put(C1gtgt, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }

    private fun toTestGrounds() {
        Intent(this, FIlterFIlterActivity::class.java)
            .also { startActivity(it) }
        finish()
    }

    private fun skipMe() {
        Intent(this, GameGameGameActivity::class.java)
            .also { startActivity(it) }
        finish()
    }
    fun deePP(context: Context) {

        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val params = appLinkData.targetUri.host
                Hawk.put(D1gttg,params.toString())
            }
        }
    }
}