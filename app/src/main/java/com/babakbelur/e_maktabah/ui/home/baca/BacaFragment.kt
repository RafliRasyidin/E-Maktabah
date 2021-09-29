package com.babakbelur.e_maktabah.ui.home.baca

import android.os.Bundle
import android.view.View
import com.babakbelur.e_maktabah.databinding.FragmentBacaBinding
import com.babakbelur.e_maktabah.ui.base.BaseFragment


class BacaFragment : BaseFragment<FragmentBacaBinding>(FragmentBacaBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.pdfViewer.fromAsset("example-1.pdf").load()
    }

}