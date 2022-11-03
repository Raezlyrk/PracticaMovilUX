package com.example.practica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText

class Agenda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)


        var btnNotas : Button = findViewById(R.id.btnNotas)

        btnNotas.setOnClickListener {



            val agendaPersonal = Intent(this, Agenda :: class.java)
            startActivity(agendaPersonal)
        }

        var btnActividades: Button = findViewById(R.id.btnActividades)
        btnActividades.setOnClickListener {

            val ActividadesPersonal = Intent(this, Actividades :: class.java)
            startActivity(ActividadesPersonal)
        }
    }

    }

