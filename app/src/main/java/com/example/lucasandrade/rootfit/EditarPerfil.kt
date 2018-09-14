package com.example.lucasandrade.rootfit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.widget.Button
import android.widget.ListView

class EditarPerfil : AppCompatActivity() {
    private lateinit var main_button_CriarTreino: Button
    private lateinit var main_button_treinoPronto: Button
    private var main_listView_treinos: ListView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_perfil)

        main_button_CriarTreino = findViewById(R.id.main_Button_CriarTreino) as Button
        main_button_treinoPronto = findViewById(R.id.main_button_treinoPronto) as Button
        main_listView_treinos = findViewById(R.id.main_listView_treinos) as ListView


        main_button_CriarTreino.setOnClickListener(this)
        main_button_treinoPronto.setOnClickListener(this)
    }


    private fun Button.setOnClickListener(editarPerfil: EditarPerfil) {

    }

    fun onClick(view: View) {

        when (view.id) {

            R.id.main_Button_CriarTreino -> {

                val it = Intent(this, Tela_criar_treino::class.java)
                startActivity(it)
            }
        }
    }
}



