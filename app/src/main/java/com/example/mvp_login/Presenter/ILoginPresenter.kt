package com.example.mvp_login.Presenter

interface ILoginPresenter {
   fun onLogin(email:String,password:String)

   fun showProgress(isVisible:Boolean)
}