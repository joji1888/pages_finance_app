package com.georgina.pagesreal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAccount : Button = findViewById(R.id.btnMyAccount)
        val btnTransactions : Button = findViewById(R.id.btnTransaction)
        val btnSendCash : Button = findViewById(R.id.btnSendMoney)
        val btnSettings : Button = findViewById(R.id.btnSettings)

        btnAccount.setOnClickListener {
            val intent = Intent(this , MyAccountActivity::class.java)
            startActivity(intent)
        }

        btnTransactions.setOnClickListener {
            val intent = Intent(this , TransactionActivity::class.java)
            startActivity(intent)

        }

        btnSendCash.setOnClickListener {
            val intent = Intent(this , SendMoneyActivity::class.java)
            startActivity(intent)

        }

        btnSettings.setOnClickListener {
            val intent = Intent(this , SettigsActivity::class.java)
            startActivity(intent)

        }
    }
}