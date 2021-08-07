package com.example.calculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultados

        btCalcular.setOnClickListener {

            val nota1: Float = nota1.text.toString().toFloat()
            val nota2: Float = nota2.text.toString().toFloat()
            val faltas = Integer.parseInt(faltas.text.toString())
            val media: Float = round((nota1 + nota2)*100)/200

            if(media >= 5 && faltas <= 10) {
                resultado.setText("Você foi aprovado\nMédia: $media \nFaltas: $faltas")
                resultado.setTextColor(Color.BLUE)
            }
            else {
                resultado.setText("Você foi reprovado\nMédia: $media \nFaltas: $faltas")
                resultado.setTextColor(Color.MAGENTA)
            }

        }
    }
}