package com.example.ganjilgenap

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var etAngka: EditText
    private lateinit var btnCek: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etAngka = findViewById(R.id.etAngka)
        btnCek = findViewById(R.id.btnCek)
        tvHasil = findViewById(R.id.tvHasil)

        btnCek.setOnClickListener {
            val angka = etAngka.text.toString().toIntOrNull()
            if (angka != null) {
                if (angka % 2 == 0) {
                    tvHasil.text = "$angka adalah bilangan genap"
                } else {
                    tvHasil.text = "$angka adalah bilangan ganjil"
                }
            } else {
                tvHasil.text = "Masukkan angka yang valid"
            }
        }
    }
}