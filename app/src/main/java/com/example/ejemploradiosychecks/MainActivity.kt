package com.example.ejemploradiosychecks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Atributos de clase

    private lateinit var chkCheckBox1 : CheckBox
    private lateinit var rgPregunta1 : RadioGroup
    private lateinit var rbOpcion1 : RadioButton
    private lateinit var rbOpcion2 : RadioButton
    private lateinit var btnAceptar : Button
    private lateinit var tvMensaje1 : TextView
    private lateinit var tvMensaje2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializamos los atributos de clase

        chkCheckBox1 = findViewById(R.id.chkCheckBox1)
        rgPregunta1 = findViewById(R.id.rgPregunta1)
        rbOpcion1 = findViewById(R.id.rbOpcion1)
        rbOpcion2 = findViewById(R.id.rbOpcion2)
        btnAceptar = findViewById(R.id.btnAceptar)
        tvMensaje1 = findViewById(R.id.tvMensaje1)
        tvMensaje2 = findViewById(R.id.tvMensaje2)

        // Logica del boton

        btnAceptar.setOnClickListener {
            //Verificamos el estado del checkpoint
            if (chkCheckBox1.isChecked){
                tvMensaje1.text="El checador esta seleccionado"
            }else{
                tvMensaje1.text="El checador no esta seleccionado"
            }
            //Verificamos cual radio button esta seleccionado
            if (rbOpcion1.isChecked){
                tvMensaje2.text = "Respondiste SI. Felicidades, sigue a si"
            }else if (rbOpcion2.isChecked){
                tvMensaje2.text = "Respondiste NO. Cambia de carrera"
            }else{
                tvMensaje2.text = "No has respondido la pregunta"
            }
        }
    }
}