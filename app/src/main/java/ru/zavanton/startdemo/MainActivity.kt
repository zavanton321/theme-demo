package ru.zavanton.startdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInfo.setOnClickListener {
            when (AppCompatDelegate.getDefaultNightMode()) {
                MODE_NIGHT_YES -> AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
                MODE_NIGHT_NO -> AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_YES)
                else -> AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
            }
        }
    }
}
