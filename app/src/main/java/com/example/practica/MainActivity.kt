package com.example.practica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variable local contra interface
        var txtUsuario : EditText = findViewById(R.id.txtUsuario)
        var txtContra : EditText = findViewById(R.id.txtContra)
        var btnAplicar : Button = findViewById(R.id.btnAplicar)
        var btnRegistrar : Button = findViewById(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener{
            val Registro = Intent(this, Registro :: class.java)
            startActivity(Registro)

        }
        btnAplicar.setOnClickListener {
            var aplicar = true
            if (txtUsuario.text.toString().trim().isEmpty()) {
                Toast.makeText(this, R.string.val_usuario, Toast.LENGTH_SHORT).show()
                txtUsuario.requestFocus()
                aplicar = false
            } else if (txtContra.text.toString().trim().isEmpty()) {
                Toast.makeText(this, R.string.val_contra, Toast.LENGTH_SHORT).show()
                txtContra.requestFocus()
                aplicar = false
            }

            if (aplicar) {
                // Toast.makeText(this, R.string.msg_fin, Toast.LENGTH_SHORT).show()

                val laotra = Intent(this, Agenda :: class.java)
                startActivity(laotra)
            }



        }





    }
}