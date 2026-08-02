package com.example.myapplication.scripts.models

data class User{
    val user_id:Int,
    val sector_id:Int,
    val role_id:Int,
    val user_name:String,
    val email:String,
    val password:String,
    val acc_status:String,
    val reg_type:String,
    val location:String
}