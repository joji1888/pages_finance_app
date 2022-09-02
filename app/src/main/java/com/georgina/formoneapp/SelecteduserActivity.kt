package com.georgina.formoneapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.nio.file.SecureDirectoryStream

class SelecteduserActivity : AppCompatActivity() {

    private lateinit var tvstream : TextView
    private lateinit var tvdormname : TextView
    private lateinit var tvcubenumber : TextView
    private lateinit var tvname : TextView







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selecteduser)
        initData()
    }

    private fun initData (){

        tvstream = findViewById(R.id.stream)
        tvcubenumber= findViewById(R.id.cubenumber)
        tvdormname= findViewById(R.id.dormname)
        tvname= findViewById(R.id.name)
        getData()
        randomStream()
        randomdorm()
        randomcubenumber()


    }

    private fun getData(){
        var intent = intent.extras

        var username= intent!!.getString("username")

        tvname.text = username


    }



    fun randomdorm() {


        val colors = arrayOf("UJAMAA DORM", "ISINYA DORM", "PEPONI DORM")
        val randomColor = colors.random()

        tvdormname.text = randomColor
    }

    fun randomStream() {


        val colors = arrayOf("1 GREEN", "1 RED", "1 MAROON", "1 PURPLE")
        val randomColor = colors.random()

        tvstream.text = randomColor
    }

    fun randomcubenumber() {


        val colors = arrayOf("22", "66", "78", "99", "101", "89")
        val randomColor = colors.random()

        tvcubenumber.text = randomColor
    }


}



















