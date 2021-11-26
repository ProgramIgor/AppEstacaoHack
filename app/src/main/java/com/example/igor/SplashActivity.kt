package com.example.igor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//          Executando instruções após determinado tempo (3s)
        Handler(Looper.getMainLooper()).postDelayed({
//          Instruções a serem executadas após delay

//          Método Intent permite nós navegarmos de uma activity a outra
            val mIntent = Intent(this, LoginActivity::class.java)

//          Método responsável por executar a intent
            startActivity(mIntent)

//          Remove a Activiry
            finish()

        }, 3000)
    }
}