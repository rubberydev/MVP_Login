package com.example.mvp_login.Presenter

import com.example.mvp_login.Model.User
import com.example.mvp_login.View.ILoginUser
import com.example.mvp_login.postDelayed

class LoginPresenter(internal var ILoginView:ILoginUser):ILoginPresenter {
    override fun onLogin(email: String, password: String) {
         ILoginView.showProgress(true)
        postDelayed(3000){
            val user = User(email,password)
            val isLoginSuccess = user.isDataValid
            val loginResult = if (isLoginSuccess) "Login success" else "Login Failure"
            ILoginView.onLoginResult(loginResult)
            ILoginView.showProgress(false)
        }

    }

    override fun showProgress(isVisible: Boolean) {
        return ILoginView.showProgress(isVisible)
    }
}