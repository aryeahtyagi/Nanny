package com.atria.nanny.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atria.nanny.R

class HomeVideoAdapter : RecyclerView.Adapter<HomeVideoAdapter.HomeVideoViewHolder>() {

    class HomeVideoViewHolder(view:View) : RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeVideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.nanny_videos,parent,false)
        return HomeVideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeVideoViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 2;
    }

}