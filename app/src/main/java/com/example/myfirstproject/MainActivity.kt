package com.example.myfirstproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstproject.ResultActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btncCalcular: Button = findViewById<Button>(R.id.btncCalcular)
        val edtPeso : EditText= findViewById(R.id.edttext_peso)
        val edtAltura : EditText= findViewById(R.id.edttext_altura)

        btncCalcular.setOnClickListener {

            val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()

            if(alturaStr.isNotEmpty() && pesoStr.isNotEmpty()){


            val altura: Float = edtAltura.text.toString().toFloat()
            val peso: Float = edtPeso.text.toString().toFloat()

            val alturaFinal: Float = altura * altura
            val imc: Float = peso / alturaFinal

            val intent = Intent(this, ResultActivity::class.java)
                .apply {
                    putExtra("EXTRA_RESULT", imc)
                }
            startActivity(intent)
        }else{
            Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()

            }

            }
    }
}
