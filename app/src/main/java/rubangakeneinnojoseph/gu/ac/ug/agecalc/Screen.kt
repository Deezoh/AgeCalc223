package rubangakeneinnojoseph.gu.ac.ug.agecalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Screen : AppCompatActivity() {
    private val SPLASH_DURATION = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)
        Handler().postDelayed({
            val splash = Intent(this,Calc::class.java)
            startActivity(splash)
            finish()
        },SPLASH_DURATION)
    }
}