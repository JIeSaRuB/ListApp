package com.example.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class RecyclerAdapter (private val imageList: Array<Int>, private val headList: Array<String>, private val descriptionList: Array<String>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(langItem: View) :RecyclerView.ViewHolder(langItem){
        var imageLanguages: ImageView = langItem.findViewById(R.id.image)
        val headingLanguages: TextView = langItem.findViewById(R.id.heading)
        val descriptionLanguages: TextView = langItem.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val langItem =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(langItem)
    }

    override fun getItemCount(): Int {
        return minOf(imageList.size, headList.size, descriptionList.size)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageLanguages.setImageResource(imageList[position])
        holder.headingLanguages.text = headList[position]
        holder.descriptionLanguages.text = descriptionList[position]
    }
}