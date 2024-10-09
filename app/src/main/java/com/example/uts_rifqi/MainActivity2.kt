package com.example.uts_rifqi

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_rifqi.databinding.ActivityMain2Binding
import com.example.uts_rifqi.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        with(binding){
            

            btnKeluar.setOnClickListener {
                val intentToMainActivity3 =
                    Intent(this@MainActivity2, MainActivity3::class.java)
                Toast.makeText( this@MainActivity2,"you have successfully logged out", Toast.LENGTH_SHORT).show()
                startActivity(intentToMainActivity3)
            }
        }




    }
}