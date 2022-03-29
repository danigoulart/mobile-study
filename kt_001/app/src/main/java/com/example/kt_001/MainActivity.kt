package com.example.kt_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // config da tela vindo pela classe pai AppCompatActivity()
        setContentView(R.layout.activity_main) // carrega o layot da tela do XML
    }

}