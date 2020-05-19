package com.leandro1995.retrofit2coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.leandro1995.retrofit2coroutines.retrofit.config.RetrofitConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.Main) {
            try {
                RetrofitConfig.apiService.userList().let {
                    if (it.isSuccessful) {

                    }
                }
            } catch (ex: Exception) {
                Toast.makeText(
                    this@MainActivity,
                    getString(R.string.without_internet),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}