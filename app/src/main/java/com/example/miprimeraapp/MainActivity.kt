package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var imageViewPueblo : ImageView
    lateinit var textPueblo : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.amazon)
        imageViewPueblo =findViewById<ImageView>(R.id.clika)
        textPueblo=findViewById<TextView>(R.id.clika2)
        imageViewPueblo.setOnClickListener {
            saludaAmazon()
        }
        textPueblo.setOnClickListener {
            aparece()
        }
    }
    fun saludaAmazon(){
        Toast.makeText(this,"Esta imagen mide ${imageViewPueblo.height}",Toast.LENGTH_LONG).show()

    }
    fun aparece(){
        imageViewPueblo.isVisible
    }
}