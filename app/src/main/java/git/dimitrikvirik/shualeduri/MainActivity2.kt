package git.dimitrikvirik.shualeduri

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var profileBackButton: ImageView
    lateinit var textUsername: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        profileBackButton = findViewById(R.id.profileBackButton)
        textUsername = findViewById(R.id.textUsername)

        val username = this.getSharedPreferences("appSharedPref",MODE_PRIVATE).getString("username", "")

        textUsername.text = "Hello, $username"



        profileBackButton.setOnClickListener {
            finish()
        }

    }
}