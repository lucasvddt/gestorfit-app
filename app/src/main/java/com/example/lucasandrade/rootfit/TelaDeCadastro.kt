package com.example.lucasandrade.rootfit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class TelaDeCadastro : AppCompatActivity(), View.OnClickListener {

    private lateinit var button2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_cadastro)

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        when (view.id) {

            R.id.button2 -> {

                val it = Intent(this, EditarPerfil::class.java)
                startActivity(it)
            }
        }
    }
}