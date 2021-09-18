package com.example.blankhilt.ui.blankhilt

sealed class BlankViewState

object Loading : BlankViewState()

data class BlankReady(val data: String = "") : BlankViewState()
