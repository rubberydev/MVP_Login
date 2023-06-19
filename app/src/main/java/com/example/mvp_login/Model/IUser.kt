package com.example.mvp_login.Model

interface IUser {
    val email:String
    val password:String
    val isDataValid:Boolean
}