package com.atria.nanny.model

data class ChatModel(
    var latestMessage : String = "",
    var senderProfileUrl : String = "",
    var timeDateSend : String = "",
    var senderName : String = ""
)