    package com.example.contador_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

    class MainActivity : AppCompatActivity() {
        var cont:Int = 0
        var bandera = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cont = 0
        bandera = true

        val txtValor = findViewById<TextView>(R.id.txtValor)
        val btnContador = findViewById<Button>(R.id.btnContador)
        val btnReiniciar = findViewById<Button>(R.id.btnReiniciar)

        btnContador.setOnClickListener{

            if(cont ==0)
                bandera = true
            else if (cont ==10)
                bandera == false

            if (bandera == true)
                cont = cont.inc()
            else if (bandera == false)
                cont = cont.dec()

            txtValor.text="$cont"

        }
        btnReiniciar.setOnClickListener{
            cont = 0
            bandera = false
            txtValor.text = "$cont"
        }
    }
}