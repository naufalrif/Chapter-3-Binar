package com.example.chapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        btn_toast.setOnClickListener {
            val nama = edit_text_nama.text.toString()
            val password = edit_text_password.text.toString()

            if (nama == "Jeja" && password == "1903"){
                startActivity(Intent(this, MainActivity::class.java))
                Toast.makeText(this,"Welcome $nama", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Login gagal", Toast.LENGTH_LONG).show()
            }
        }

        btn_snackbar_dua.setOnClickListener {
            Snackbar.make(it, "Snackbar Dua", Snackbar.LENGTH_INDEFINITE)
                .setAction("Show toast"){
                    startActivity(Intent(this, MainActivity::class.java))
                }
                .show()
        }
    }
}