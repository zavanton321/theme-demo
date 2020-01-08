package ru.zavanton.startdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInfo.setOnClickListener {

            Snackbar.make(tvInfo, "Hello world", Snackbar.LENGTH_LONG).show()
        }
    }
}
