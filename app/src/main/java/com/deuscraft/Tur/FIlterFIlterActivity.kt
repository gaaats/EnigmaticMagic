package com.deuscraft.Tur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deuscraft.Tur.ApApApClass.Companion.jsoupCheckfrrf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class FIlterFIlterActivity : AppCompatActivity() {
    lateinit var bgbgbg: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter_filter)
        bgbgbg = ""
        val bnnbnb = AsyyyynnnnjjjCLas(applicationContext)

        val kikik = GlobalScope.launch(Dispatchers.IO) {
            bgbgbg = bnnbnb.bgbgbg()
        }

        runBlocking {
            kikik.join()
            if (bgbgbg == jsoupCheckfrrf) {
                Intent(applicationContext, GameGameGameActivity::class.java).also { startActivity(it) }
            } else {
                Intent(applicationContext, VebLinkActivity::class.java).also { startActivity(it) }
            }
            finish()
        }
    }
}