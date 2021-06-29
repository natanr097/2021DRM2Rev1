package com.example.a2021drm2rev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list.*
import java.util.ArrayList

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        val lista = intent.getStringArrayListExtra("lista")!!.toArray()

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lista)

        lstPresenca.adapter = adapter

    }


    override fun onResume() {
        super.onResume()
        CarregaLista()
    }


    private fun CarregaLista(){

        val nome : List<Nome>  = NomeDataBase.getInstance(this).NomeDao().listar()


        val adp = ArrayAdapter<Nome>(this, android.R.layout.simple_list_item_1,nome)

        lstPresenca.adapter = adp


    }



}