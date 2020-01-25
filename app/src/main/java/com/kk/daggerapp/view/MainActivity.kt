package com.kk.daggerapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.kk.daggerapp.R
import com.kk.daggerapp.di.DaggerMainActivityViewModelInjector
import com.kk.daggerapp.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainActivityViewModel:MainActivityViewModel = DaggerMainActivityViewModelInjector.create().getMainActivityViewModel()

        val mLinkTextView = findViewById<TextView>(R.id.linkTextView)
        val mConnectBtn = findViewById<Button>(R.id.connectBtn)

        mConnectBtn.setOnClickListener {
            mLinkTextView.setText(mainActivityViewModel.fetchData())
        }
    }
}
