
package com.example.tarea

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    /*Sección de variables*/

    var add: Button? = null
    var reset: Button? = null
    var counter: Int = 0
    var counterS: String? = null
    var textCounter: TextView ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*Acciones para el contador de texto*/
        textCounter = findViewById(R.id.counterXml)

        /*Acciones del botón de adición*/
        add = findViewById(R.id.buttonPanel)
        add!!.setOnClickListener {

            counter++
            counterS = counter.toString()

            if (counter != 0) {
                textCounter!!.text = counterS
            }

            println(counterS)
        }

        /*Acciones del botón de reseteo*/

        reset = findViewById(R.id.buttonPanelR)
        reset!!.setOnClickListener {

            if (counter != 0) {

                counter = 0
                counterS = counter.toString()
                textCounter!!.text = counterS
            }

            println(counterS)

        }
    }
}