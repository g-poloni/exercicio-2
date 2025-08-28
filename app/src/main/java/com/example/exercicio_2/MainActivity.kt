package com.example.exercicio_2

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicio_2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val TAG = "INFOTESTE"
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nome = "Nome do Curso"
        binding.txtnome.text= nome

        setContentView(R.layout.activity_main)
        Log.i(TAG, "Oncreate")
    }
}