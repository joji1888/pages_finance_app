package com.georgina.pagesreal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class SettigsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settigs)
        //SETTING THE BACK BUTTON

        val actionBar:ActionBar? = supportActionBar
        //? means it can be null
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}