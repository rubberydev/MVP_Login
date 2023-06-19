package com.example.mvp_login.View

interface ILoginUser {
    fun onLoginResult(message: String)

    fun showProgress(isVisible:Boolean)
}