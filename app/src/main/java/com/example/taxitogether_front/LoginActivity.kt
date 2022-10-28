package com.example.taxitogether_front

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.taxitogether_front.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity(){
    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            // id pw가 맞으면 탈퇴처리하고 login 화면으로
            val intent = Intent(this,SelectDestinationActivity::class.java)
            startActivity(intent)
        }
    }
}