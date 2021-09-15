package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, getString(R.string.hello), Toast.LENGTH_LONG).show()
        Log.v("MainActivity", "Se ha creado correctamente")
//hola
        //adios


    }
}