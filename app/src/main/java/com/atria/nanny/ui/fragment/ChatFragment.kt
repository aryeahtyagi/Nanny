package com.atria.nanny.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.atria.nanny.R
import com.atria.nanny.adapter.HomeVideoAdapter
import com.atria.nanny.adapter.RecyclerAdapterForChat
import com.atria.nanny.model.ChatModel

class ChatFragment: Fragment() {
    private var layoutManager : RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<RecyclerAdapterForChat.ViewHolder>?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerAdapterForChat = RecyclerAdapterForChat(
            arrayListOf()
        )
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerviewforchat)
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = recyclerAdapterForChat

        recyclerAdapterForChat.updateChats(
            arrayListOf
                (ChatModel(
                "Hello Booiiiii","none","22-02-19","arya tyagi"
            ),ChatModel(
                "Hello Boo","none","22-02-19","ashwin mandlik"
            ),ChatModel(
                "Hello B","none","22-02-19","mohit"
            ),ChatModel(
                "Hello ","none","22-02-19","neeraj"
            ),ChatModel(
                "Hell","none","22-02-19","chitag"
            ),ChatModel(
                "He","none","22-02-19","jerry paul"
            ),ChatModel(
                "H","none","22-02-19","shivkumar ramalingaman"
            ))
        )



    }
}