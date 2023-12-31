package com.example.homework3cars

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private var titles: List<String>, private var details: List<String>, private var images: List<Int>):
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val itemPicture : ImageView = itemView.findViewById(R.id.iv_image)
        val itemTitle : TextView = itemView.findViewById(R.id.tv_title)
        val itemDetail : TextView = itemView.findViewById(R.id.tv_desc)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.car_layout, parent, false)
        return  ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemPicture.setImageResource(images[position])
    }
}
