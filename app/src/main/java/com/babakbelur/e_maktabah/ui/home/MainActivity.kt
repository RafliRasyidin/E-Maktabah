package com.babakbelur.e_maktabah.ui.home

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.babakbelur.e_maktabah.R
import com.babakbelur.e_maktabah.databinding.ActivityMainBinding
import com.babakbelur.e_maktabah.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var navHostController: NavController

    override fun inflateViewBinding(): ActivityMainBinding =
        ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navHostController = navHostFragment.navController
    }
}