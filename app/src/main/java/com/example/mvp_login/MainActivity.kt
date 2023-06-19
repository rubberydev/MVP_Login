package com.example.mvp_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mvp_login.Presenter.ILoginPresenter
import com.example.mvp_login.Presenter.LoginPresenter
import com.example.mvp_login.View.ILoginUser
import com.example.mvp_login.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity(),ILoginUser {
    override fun onLoginResult(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

    override fun showProgress(isVisible: Boolean) {
      binding.progress.visibility = if(isVisible) View.VISIBLE else View.GONE
    }


    internal lateinit var loginPresenter: ILoginPresenter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Init
        loginPresenter = LoginPresenter(this)

        binding.buttonLogin.setOnClickListener {
            loginPresenter.onLogin(binding.edtEmail.text.toString(), binding.edtPassword.text.toString())

        }
    }


}