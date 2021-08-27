package com.example.creditcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.creditcard.databinding.ActivityTransactionBinding

class TransactionActivity : AppCompatActivity() {
    lateinit var binding: ActivityTransactionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransactionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var typeIntent = intent.getStringExtra("type")
        var amountIntent = intent.getStringExtra("amount")

        binding.tvAccountName.text = typeIntent
        binding.tvAccAmount.text = amountIntent

        var transactions = mutableListOf(
            Transaction("deposited","PAMELA","26-08-2021",954.00,"DEBIT"),
            Transaction("deposited","MOSSAD","26-08-2010",5800.00,"CREDIT"),
            Transaction("withdrawal","KGBAA","26-08-2021",150.00,"CREDIT"),
            Transaction("deposited","MI6UN","26-08-2021",20000.00,"DEBIT"),
            Transaction("deposited","REMAWA","26-08-2021",184142.00,"CREDIT"),
            Transaction("deposited","WASSAC5","26-08-2021",970.00,"DEBIT"),
            Transaction("withdrwal","RURATR","26-08-2021",1800.00,"CREDIT"),
            Transaction("withdrawal","REMAENV","26-08-2021",1200.00,"CREDIT"),
            Transaction("deposited","RADBID","26-08-2021",25000.00,"DEBIT"),
            Transaction("deposited","MOEIKR","26-08-2021",3000.00,"DEBIT"),
        )


        binding.rvTransactions.adapter = TransactionAdapter(transactions)
        binding.rvTransactions.layoutManager = LinearLayoutManager(baseContext)

    }
}