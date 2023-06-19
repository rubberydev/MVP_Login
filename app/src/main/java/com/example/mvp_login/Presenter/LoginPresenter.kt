package com.example.mvp_login.Presenter

import com.example.mvp_login.Model.User
import com.example.mvp_login.View.ILoginUser

class LoginPresenter(internal var ILoginView:ILoginUser):ILoginPresenter {
    override fun onLogin(email: String, password: String) {
       val user = User(email,password)
        val isLoginSuccess = user.isDataValid
        val loginResult = if (isLoginSuccess) "Login success" else "Login Failure"
        ILoginView.onLoginResult(loginResult)
    }
}