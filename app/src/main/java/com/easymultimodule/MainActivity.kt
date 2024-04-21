package com.easymultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.easymultimodule.databinding.ActivityMainBinding
import com.sharedpref.BasicActivity
import com.sharedpref.showToast

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        clickEvent()




    }

    private fun clickEvent() {
        activityMainBinding.btnLogin.setOnClickListener {
            if(activityMainBinding.etUsername.text.toString().isBlank()){
                showToast("Please enter username")
            }else if(activityMainBinding.etEmail.text.toString().isBlank()){
                showToast("Please enter email")
            }else{
             showToast("Login success" )
            }
        }
    }
}