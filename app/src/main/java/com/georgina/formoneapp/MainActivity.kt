package com.georgina.formoneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity :AppCompatActivity(), UserAdapater.ClickListener {
    private lateinit var rvUsers:RecyclerView
    private lateinit var userAdapater: UserAdapater

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
    }

    private fun initData(){
        rvUsers = findViewById(R.id.rvUsers)
        initRV()
    }

    private fun initRV(){
        rvUsers.layoutManager = LinearLayoutManager(this)
        rvUsers.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        userAdapater = UserAdapater(this)
        rvUsers.adapter = userAdapater
        showData()



    }

    private fun populateUsers():List<userdata>{
        val userList = ArrayList<userdata>()
        userList.add(userdata("Georgina"))
        userList.add(userdata("Lee Min Ho"))
        userList.add(userdata("Angie"))
        userList.add(userdata("Tyler"))

        return userList



    }

    private fun showData(){
        userAdapater.setData(populateUsers())
    }

    override fun clickedItem(userdata: userdata) {

        startActivity(Intent(this,SelecteduserActivity::class.java).putExtra("username",userdata.username))
    }



}