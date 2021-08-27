package com.example.creditcard

data class Transaction(
    var description:String,
    var reference:  String,
    var date:String,
    var amount:Double,
    var transaction_type:String
)
