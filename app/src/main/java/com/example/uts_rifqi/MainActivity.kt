package com.example.uts_rifqi

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts_rifqi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)



        with(binding){

            btnSubmit.setOnClickListener {
                val intentToMainActivity2 =
                    Intent(this@MainActivity,MainActivity2::class.java)
                intentToMainActivity2.putExtra("user name",etName.text.toString())
                if (etName.text.length==0)
                    Toast.makeText(this@MainActivity, "Enter your name first", Toast.LENGTH_SHORT).show()
                else( startActivity(intentToMainActivity2))

            }
        }
    }
}