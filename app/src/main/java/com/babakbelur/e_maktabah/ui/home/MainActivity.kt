package com.babakbelur.e_maktabah.ui.home

import android.os.Bundle
import com.babakbelur.e_maktabah.databinding.ActivityMainBinding
import com.babakbelur.e_maktabah.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateViewBinding(): ActivityMainBinding =
        ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}