package com.atria.nanny.diffutils

import androidx.recyclerview.widget.DiffUtil
import com.atria.nanny.model.ChatModel

class ChatDiffUtils(
    val oldList : ArrayList<ChatModel>,
    val newList : ArrayList<ChatModel>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].senderProfileUrl == newList[newItemPosition].senderProfileUrl
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].senderProfileUrl == newList[newItemPosition].senderProfileUrl
    }

}