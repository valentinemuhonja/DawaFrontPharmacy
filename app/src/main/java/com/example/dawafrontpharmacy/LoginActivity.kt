package com.example.dawafrontpharmacy
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.etUsername)
        val password = findViewById<EditText>(R.id.etPassword)
        val login = findViewById<Button>(R.id.btnLogin)

        login.setOnClickListener {

            if (username.text.toString() == "admin" &&
                password.text.toString() == "1234") {

                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this,
                    "Incorrect username or password",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}
