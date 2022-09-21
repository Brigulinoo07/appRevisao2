package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.apprevisao.db.DBHelper

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

       val btnConfirmar: Button =findViewById(R.id.btnConfirmar)


        val edtNome: EditText = findViewById(R.id.edtNome)
        val edtEndereco: EditText = findViewById(R.id.edtEndereco)
        val edtCep: EditText = findViewById(R.id.edtCep)
        val edtBairro: EditText = findViewById(R.id.edtBairro)

        edtNome.setText(intent.getStringExtra("nome"))
       edtEndereco.setText(intent.getStringExtra("endereço"))
        edtCep.setText(intent.getStringExtra("CEP"))
        edtBairro.setText(intent.getStringExtra("bairro"))

        val db = DBHelper(this, null)

        btnConfirmar.setOnClickListener{
db.addPessoa(edtNome.text.toString(), edtEndereco.text.toString(), edtCep.text.toString(),  edtBairro.text.toString())
    finish()
        }
    }
}