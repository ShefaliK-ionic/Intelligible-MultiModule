package com.easymultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sharedpref.BasicActivity
import com.sharedpref.showToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast("Meri mumma sabse pyari")
    }
}