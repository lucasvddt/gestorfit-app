package com.example.lucasandrade.rootfit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class TelaDeLogin : AppCompatActivity(), View.OnClickListener {

    private lateinit var mLoginRegister: TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_login)

        mLoginRegister = findViewById(R.id.login_textview_register)
        mLoginRegister.setOnClickListener(this)
    }

     override fun onClick(view: View) {

        when(view.id){

            R.id.login_textview_register ->{

                val it = Intent(this, TelaDeCadastro::class.java)
                startActivity(it)

            }

        }

    }

}