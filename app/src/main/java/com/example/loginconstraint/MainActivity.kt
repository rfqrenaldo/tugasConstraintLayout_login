package com.example.loginconstraint

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mengambil referensi input dan tombol
        val emailInput = findViewById<TextInputEditText>(R.id.email)
        val fullnameInput = findViewById<TextInputEditText>(R.id.fullname)
        val usernameInput = findViewById<TextInputEditText>(R.id.username)
        val passwordInput = findViewById<TextInputEditText>(R.id.password)
        val signUpButton = findViewById<Button>(R.id.buttonSignUp)

        // Menampilkan Toast ketika tombol "Sign Up" ditekan
        signUpButton.setOnClickListener {
            val email = emailInput.text.toString()
            val fullname = fullnameInput.text.toString()
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            // Menampilkan Toast dengan input pengguna
            Toast.makeText(
                this,
                "Email: $email\nFullname: $fullname\nUsername: $username\nPassword: $password",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
