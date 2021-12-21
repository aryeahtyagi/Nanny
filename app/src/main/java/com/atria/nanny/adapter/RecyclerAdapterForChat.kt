package com.atria.nanny.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.atria.nanny.R
import com.atria.nanny.diffutils.ChatDiffUtils
import com.atria.nanny.model.ChatModel


class RecyclerAdapterForChat(
    val chats : ArrayList<ChatModel>

) :RecyclerView.Adapter<RecyclerAdapterForChat.ViewHolder>() {
    private var titles= arrayOf("Ashwin", "Arya Tyagi","neeeraaj","mohit anand","tom baker","johnny depp","naman","aditya padir")
    private var details = arrayOf("Neeche aa madarchod", "Marr gaya kya","sent you a post","exam kab hai","sent photo","bc XD","gand me danda dede uske bhai","8 chapter hai shayad")
    private var images = intArrayOf(R.drawable.atria,R.drawable.atria,R.drawable.atria,R.drawable.atria,R.drawable.atria,R.drawable.atria,R.drawable.atria,R.drawable.atria)
    private var dates= arrayOf("just now","2 min ago","10 Nov 2019","10 Nov 2019","10 Nov 2019","10 Nov 2019","10 Nov 2019","10 Nov 2019")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_for_chat, parent, false)
        return ViewHolder(v)
    }



    fun updateChats(newList:ArrayList<ChatModel>){
        val chatDiffUtils = ChatDiffUtils(chats,newList)
        val difference = DiffUtil.calculateDiff(chatDiffUtils)
        chats.clear()
        chats.addAll(newList)
        difference.dispatchUpdatesTo(this)
    }

    override fun onBindViewHolder(holder: RecyclerAdapterForChat.ViewHolder, position: Int) {
            holder.itemTitle?.text = chats[position].senderName
            holder.itemDetail?.text = chats[position].latestMessage
            // circular profile will be loaded using url
            holder.itemDate?.text = chats[position].timeDateSend

    }

    override fun getItemCount(): Int {
       return chats.size
    }
    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var itemImage : ImageView?
        var itemTitle: TextView?
        var itemDetail: TextView?
        var itemDate : TextView?


        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemDate = itemView.findViewById(R.id.item_date)
        }
    }

    }

