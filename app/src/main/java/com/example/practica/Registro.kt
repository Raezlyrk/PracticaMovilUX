package com.example.practica

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class Registro : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


    val spinner = findViewById<Spinner>(R.id.spnPreguntaSecreta)
       val lista = resources.getStringArray(R.array.opciones)
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador

    var btnAceptar : Button = findViewById(R.id.btnAceptar)

    btnAceptar.setOnClickListener {

            // Toast.makeText(this, R.string.msg_fin, Toast.LENGTH_SHORT).show()

            val laotra = Intent(this, MainActivity :: class.java)
            startActivity(laotra)
        }

    }





}
