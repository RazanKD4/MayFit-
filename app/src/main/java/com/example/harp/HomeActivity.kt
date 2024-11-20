package com.example.harp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.harp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnFoodselect.setOnClickListener{
//            startActivity(Intent(this, FoodActivity::class.java))
//        }
//        binding.btnDrinkMngr.setOnClickListener{
//            startActivity(Intent(this, WaterActivity::class.java))
//        }

        binding.tellProgram.setOnClickListener{
            startActivity(Intent(this, WaterActivity::class.java))
        }

        binding.toPremiumBtn.setOnClickListener {
        startActivity(Intent(this, premiumActivity::class.java))
        }

        binding.btnDailyGoals.setOnClickListener{
            startActivity(Intent(this, ScaleWeightActivity::class.java))
        }
        binding.btnTargetFood.setOnClickListener{
            startActivity(Intent(this, FoodActivity::class.java))
        }
        binding.btnProgramInHome.setOnClickListener{
            startActivity(Intent(this, ProgramActivity::class.java))
        }
        binding.btnProfInHome.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}