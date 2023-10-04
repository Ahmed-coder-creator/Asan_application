package com.example.asan

data class ChatsData(val name:String,val lastseen:String,val photo:Int,val messages: ArrayList<messagesdata> = arrayListOf<messagesdata>())
