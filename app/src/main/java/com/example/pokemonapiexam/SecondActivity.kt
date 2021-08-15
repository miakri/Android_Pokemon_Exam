package com.example.pokemonapiexam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val username = intent.getStringExtra("user")
        val password = intent.getStringExtra("password")

        tvWelcome.setText("Welcome ${username}, you entered ${password}")

    }
}