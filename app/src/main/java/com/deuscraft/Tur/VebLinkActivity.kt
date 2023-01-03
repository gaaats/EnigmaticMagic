package com.deuscraft.Tur

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.deuscraft.Tur.ApApApClass.Companion.C1gtgt
import com.deuscraft.Tur.ApApApClass.Companion.D1gttg
import com.deuscraft.Tur.ApApApClass.Companion.MAIN_IDgttg
import com.deuscraft.Tur.databinding.ActivityVebLinkBinding
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class VebLinkActivity : AppCompatActivity() {
    private val vfvffvf = 1

    var nhnhnh: ValueCallback<Array<Uri>>? = null
    var bgbgbgbg: String? = null
    lateinit var bgbgbg: WebView
    lateinit var mjmjmj: ActivityVebLinkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mjmjmj = ActivityVebLinkBinding.inflate(layoutInflater)
        setContentView(mjmjmj.root)
        bgbgbg = mjmjmj.viewWeb
        Snackbar.make(
            mjmjmj.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()

        val bgbgbg = CookieManager.getInstance()
        bgbgbg.setAcceptCookie(true)
        bgbgbg.setAcceptThirdPartyCookies(this.bgbgbg, true)
        webSettings()
        val vbbbvv: Activity = this

        this.bgbgbg.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (appInstalledOrNot(url)) {

                        val bvvbbvvb = Intent(Intent.ACTION_VIEW)
                        bvvbbvvb.data = Uri.parse(url)
                        startActivity(bvvbbvvb)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                bgbgbgbg(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(vbbbvv, description, Toast.LENGTH_SHORT).show()
            }


        }
        this.bgbgbg.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                nhnhnh?.onReceiveValue(null)
                nhnhnh = filePathCallback
                var bvbvbvvbvb: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (bvbvbvvbvb!!.resolveActivity(packageManager) != null) {

                    var nhnhnhnh: File? = null
                    try {
                        nhnhnhnh = createImageFile()
                        bvbvbvvbvb.putExtra("PhotoPath", bgbgbgbg)
                    } catch (ex: IOException) {
                    }

                    if (nhnhnhnh != null) {
                        bgbgbgbg = "file:" + nhnhnhnh.absolutePath
                        bvbvbvvbvb.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(nhnhnhnh)
                        )
                    } else {
                        bvbvbvvbvb = null
                    }
                }
                val vbbvvbvb = Intent(Intent.ACTION_GET_CONTENT)
                vbbvvbvb.addCategory(Intent.CATEGORY_OPENABLE)
                vbbvvbvb.type = "image/*"
                val mmjmjjm: Array<Intent?> =
                    bvbvbvvbvb?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val mmkmkmk = Intent(Intent.ACTION_CHOOSER)
                mmkmkmk.putExtra(Intent.EXTRA_INTENT, vbbvvbvb)
                mmkmkmk.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                mmkmkmk.putExtra(Intent.EXTRA_INITIAL_INTENTS, mmjmjjm)
                startActivityForResult(
                    mmkmkmk, vfvffvf
                )
                return true
            }

            @Throws(IOException::class)
            private fun createImageFile(): File {
                var mmjmjmjmj = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!mmjmjmjmj.exists()) {
                    mmjmjmjmj.mkdirs()
                }

                mmjmjmjmj =
                    File(mmjmjmjmj.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return mmjmjmjmj
            }

        }

        this.bgbgbg.loadUrl(getUrl())
    }



    private fun webSettings() {
        val webSettings = bgbgbg.settings
        webSettings.javaScriptEnabled = true

        webSettings.useWideViewPort = true

        webSettings.loadWithOverviewMode = true
        webSettings.allowFileAccess = true
        webSettings.domStorageEnabled = true
        webSettings.userAgentString = webSettings.userAgentString.replace("; wv", "")

        webSettings.javaScriptCanOpenWindowsAutomatically = true
        webSettings.setSupportMultipleWindows(false)

        webSettings.displayZoomControls = false
        webSettings.builtInZoomControls = true
        webSettings.setSupportZoom(true)

        webSettings.pluginState = WebSettings.PluginState.ON
        webSettings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        webSettings.setAppCacheEnabled(true)

        webSettings.allowContentAccess = true
    }

    private fun getUrl(): String {
        val bvbvb = "deviceID="
        val bvvb = "ad_id="
        val juju = "sub_id_4="
        val juujju = "sub_id_5="
        val nbbngngh = "sub_id_6="
        val hyhhyhy = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val bgbgbg:String? = Hawk.get(C1gtgt)
        val bvvbvb: String? = Hawk.get(D1gttg)
        val gttggt: String? = Hawk.get(MAIN_IDgttg)


        val kiklolooolol = ApApApClass.packkk

        val nmjjiki = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val nbnbnjjjjjj = "sub_id_1="



        val gggggg = "http://"
        val sssss = "enigmaticmagic.xyz/go.php?to=2&"

        val nnhnnhnh = "naming"
        val kiikikik = "deeporg"

        val nbbnnbnb = Build.VERSION.RELEASE

        val mjmjmj = gggggg + sssss

        var after = ""
        if (bgbgbg != "null") {
            after =
                "$mjmjmj$nbnbnjjjjjj$bgbgbg&$bvbvb$nmjjiki&$bvvb$gttggt&$juju$kiklolooolol&$juujju$nbbnnbnb&$nbbngngh$nnhnnhnh"
        } else {
            after =
                "$mjmjmj$nbnbnjjjjjj$bvvbvb&$bvbvb$nmjjiki&$bvvb$gttggt&$juju$kiklolooolol&$juujju$nbbnnbnb&$nbbngngh$kiikikik"
        }
        nhhnhnh(nmjjiki.toString())
        Log.d("lolo", "link is $after")
        return hyhhyhy.getString("SAVED_URL", after).toString()
    }


    private fun appInstalledOrNot(uri: String): Boolean {

        val nbnbnnb = packageManager
        try {

            nbnbnnb.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, daddaadad: Intent?) {
        if (requestCode != vfvffvf || nhnhnh == null) {
            super.onActivityResult(requestCode, resultCode, daddaadad)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (daddaadad == null || daddaadad.data == null) {
                results = arrayOf(Uri.parse(bgbgbgbg))
            } else {
                val nhnhnhnh = daddaadad.dataString
                if (nhnhnhnh != null) {
                    results = arrayOf(Uri.parse(nhnhnhnh))
                }
            }
        }
        nhnhnh?.onReceiveValue(results)
        nhnhnh = null
    }


    private var vbvbvbvbvb = false
    override fun onBackPressed() {


        if (bgbgbg.canGoBack()) {
            if (vbvbvbvbvb) {
                bgbgbg.stopLoading()
                bgbgbg.loadUrl(nhnhnhnh)
            }
            this.vbvbvbvbvb = true
            bgbgbg.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                vbvbvbvbvb = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    var nhnhnhnh = ""
    fun bgbgbgbg(url: String?) {
        if (!url!!.contains("t.me")) {

            if (nhnhnhnh == "") {
                nhnhnhnh = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    url
                ).toString()

                val mjmjmj = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val nbnnbnbnb = mjmjmj.edit()
                nbnnbnbnb.putString("SAVED_URL", url)
                nbnnbnbnb.apply()
            }
        }
    }


    private fun nhhnhnh(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {


                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }

                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val nhnnhnh = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $nhnnhnh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val nhnhnh =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $nhnhnh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val nhnhnhnh = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $nhnhnhnh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }
            })
    }
}