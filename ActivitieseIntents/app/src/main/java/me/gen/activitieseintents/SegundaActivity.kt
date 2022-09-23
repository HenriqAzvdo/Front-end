package me.gen.activitieseintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener {
            finish() //não ficou muito claro essa parte, por que tem que finalizar e não ir pra ontra instancia
        }
    }
}