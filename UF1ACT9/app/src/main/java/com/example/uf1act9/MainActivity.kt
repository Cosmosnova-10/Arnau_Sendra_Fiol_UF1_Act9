package com.example.uf1act9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/*
Crea una activitat amb tres botons situats horitzontalment fent servir un linearLayout,
fes que l'últim botó ocupi el doble que els altres dos. Crea una segona activitat que sigui tingui
una interfície igual que l’anterior, però posicionant els botons en vertical i de manera que ara el
primer sigui el que ocupa el doble que els altres dos. Estableix butons de navegació entre les activitats.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button3)
        btn.setOnClickListener {
            val intent: Intent= Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }
    }
}