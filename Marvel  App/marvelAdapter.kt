package com.pragadees.marvelassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class marvelAdapter(var list : ArrayList<marvel>) : RecyclerView.Adapter<marvelAdapter.ViewHolder>(){
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val marvel_image : ImageView = view.findViewById(R.id.marvel_image)
        val marvel_name : TextView = view.findViewById(R.id.marvel_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.marvel_layout ,parent ,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.marvel_name.text = list[position].marvelName
        holder.marvel_image.setImageResource(list[position].marvelImage)
    }
}