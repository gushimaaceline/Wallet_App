package com.example.creditcard

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.creditcard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnBalance.setOnClickListener {
            var intent = Intent(baseContext, TransactionActivity::class.java)
            intent.putExtra("type" , binding.etName.text.toString())
            intent.putExtra("amount" , binding.etAmount.text.toString())
            startActivity(intent)
       }

    }
}
