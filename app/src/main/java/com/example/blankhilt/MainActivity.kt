package com.example.blankhilt

import android.os.Bundle
import co.zsmb.rainbowcake.navigation.SimpleNavActivity
import com.example.blankhilt.ui.blankhilt.BlankFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : SimpleNavActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            navigator.add(BlankFragment())
        }
    }

}
