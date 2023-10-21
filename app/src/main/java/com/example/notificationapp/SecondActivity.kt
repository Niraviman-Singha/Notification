package com.example.notificationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notificationapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding:ActivitySecondBinding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.textTV.text = intent.getStringExtra("DATA_REC")
    }
}