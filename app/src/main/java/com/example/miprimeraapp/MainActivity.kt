package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
//import com.example.miprimeraapp.databinding.AmazonBinding

class MainActivity : AppCompatActivity() {
    lateinit var imageViewPueblo : ImageView
    lateinit var textPueblo : TextView
    lateinit var scrollPueblo : HorizontalScrollView
    //lateinit var binding : AmazonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding =AmazonBinding.inflate(layoutInflater)
        setContentView(R.layout.amazon)
        //setContentView(binding.root)
        imageViewPueblo =findViewById<ImageView>(R.id.clika)
        textPueblo=findViewById<TextView>(R.id.clika2)
        scrollPueblo=findViewById<HorizontalScrollView>(R.id.clika3)
        imageViewPueblo.setOnClickListener {
            saludaAmazon()
        }
        //binding.clika.setOnClickListener {
           //binding.clika2.visibility=View.GONE
        //}
        scrollPueblo.visibility=View.GONE
        textPueblo.setOnClickListener {
            if (scrollPueblo.visibility==View.VISIBLE){
                scrollPueblo.visibility= View.GONE
            }else {
                scrollPueblo.visibility= View.VISIBLE
            }

        }
    }
    fun saludaAmazon(){
        Toast.makeText(this,"Esta imagen mide ${imageViewPueblo.height}",Toast.LENGTH_LONG).show()

    }
}