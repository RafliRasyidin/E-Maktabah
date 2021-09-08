package com.babakbelur.e_maktabah.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.babakbelur.e_maktabah.databinding.ActivitySplashBinding
import com.babakbelur.e_maktabah.ui.base.BaseActivity
import com.babakbelur.e_maktabah.ui.home.MainActivity
import com.babakbelur.e_maktabah.utils.Constants.SPLASH_TIME

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun inflateViewBinding(): ActivitySplashBinding =
        ActivitySplashBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        splashDelay()
    }

    private fun splashDelay() {
        Intent(this, MainActivity::class.java).run {
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(this)
            }, SPLASH_TIME)
        }
    }
}