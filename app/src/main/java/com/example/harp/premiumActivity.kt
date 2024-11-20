package com.example.harp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.harp.databinding.ActivityPremiumBinding

class premiumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPremiumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPremiumBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.premiumBackBtn.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}