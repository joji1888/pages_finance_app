package com.georgina.formoneapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapater (clickListener: ClickListener):RecyclerView.Adapter<UserAdapater.ViewHolder>(){
    private var usermodellist: List<userdata> = arrayListOf()
    private lateinit var context : Context
    private var clickListener: ClickListener= clickListener

    public fun setData(userdata:  List<userdata>){
        this.usermodellist=userdata
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context;
         return ViewHolder(LayoutInflater.from(context).inflate(R.layout.rowusers,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var userModell = usermodellist.get(position)
        var username = userModell.username
        var prefix = username.substring(0,1)

        holder.tvUsername.text = username
        holder.tvPrefix.text = prefix
        holder.itemView.setOnClickListener {
            clickListener.clickedItem(userModell)
        }

    }

    override fun getItemCount(): Int {
        return usermodellist.size

    }

    interface ClickListener{
        fun clickedItem(userdata: userdata)

    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val tvUsername = itemView.findViewById<TextView>(R.id.tvusername)
        val tvPrefix = itemView.findViewById<TextView>(R.id.tvPrefix)



    }
}