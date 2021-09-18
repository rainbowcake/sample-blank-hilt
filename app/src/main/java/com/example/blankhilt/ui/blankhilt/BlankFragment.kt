package com.example.blankhilt.ui.blankhilt

import android.os.Bundle
import android.view.View
import co.zsmb.rainbowcake.base.RainbowCakeFragment
import co.zsmb.rainbowcake.hilt.getViewModelFromFactory
import com.example.blankhilt.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BlankFragment : RainbowCakeFragment<BlankViewState, BlankViewModel>() {

    override fun provideViewModel() = getViewModelFromFactory()
    override fun getViewResource() = R.layout.fragment_blank

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO Setup views
    }

    override fun onStart() {
        super.onStart()

        viewModel.load()
    }

    override fun render(viewState: BlankViewState) {
        // TODO Render state
    }

}
