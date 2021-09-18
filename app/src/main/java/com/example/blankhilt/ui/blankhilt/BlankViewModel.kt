package com.example.blankhilt.ui.blankhilt

import co.zsmb.rainbowcake.base.RainbowCakeViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BlankViewModel @Inject constructor(
    private val blankPresenter: BlankPresenter
) : RainbowCakeViewModel<BlankViewState>(Loading) {

    fun load() = execute {
        viewState = BlankReady(blankPresenter.getData())
    }

}
