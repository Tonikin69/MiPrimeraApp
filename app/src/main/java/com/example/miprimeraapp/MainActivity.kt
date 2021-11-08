package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var imageViewPueblo : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.amazon)
        imageViewPueblo =findViewById<ImageView>(R.id.clika)
        imageViewPueblo.setOnClickListener {
            saludaAmazon()
        }
    }
    fun saludaAmazon(){
        Toast.makeText(this,"Esta imagen mide ${imageViewPueblo.height}",Toast.LENGTH_LONG).show()

    }
}