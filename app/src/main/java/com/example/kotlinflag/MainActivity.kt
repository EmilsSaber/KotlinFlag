package com.example.kotlinflag

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.kotlinflag.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container, MainFragment()).commit()


    }
}