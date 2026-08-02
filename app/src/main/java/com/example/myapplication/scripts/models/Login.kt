package com.example.myapplication.scripts.models


data class LoginCred{
    val email:String,
    val password:String
}

data class LoginResponse{
    val token:String,
    val user:User
}