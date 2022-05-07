package git.dimitrikvirik.shualeduri

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.core.content.edit

class MainActivity : AppCompatActivity() {

    lateinit var profileImgButton: ImageView
    lateinit var profileNextButton: ImageView
    lateinit var editTextUsername: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        profileImgButton = findViewById(R.id.profileImgButton)
        profileNextButton = findViewById(R.id.profileNextButton)
        editTextUsername = findViewById(R.id.editTextUsername)

        val intent = Intent(this, MainActivity2::class.java)



        profileImgButton.setOnClickListener {
            startActivity(intent)
        }
        profileNextButton.setOnClickListener {


            val sharedPref = this.getSharedPreferences("appSharedPref",Context.MODE_PRIVATE)

            sharedPref.edit().putString("username", editTextUsername.text.toString()).apply()
            startActivity(intent)
        }


    }


}