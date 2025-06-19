package vcmsa.ci.musicplaylist

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val displayBtn: Button =
            findViewById(R.id.displayBtn) // when button is pressed it will display songs artist name, rating comments
        val returnBtn: Button =
            findViewById(R.id.returnBtn) // when te return button is pressed, it will take you back to main screen
        val addBtn: Button =
            findViewById(R.id.addBtn)  // when the "add to playlist button is pressed this will add the song to your playlist
        val clearBtn: Button = findViewById(R.id.clearBtn) //
        val songTxt: EditText = findViewById(R.id.songTxt)
        val listTxt: EditText = findViewById(R.id.listTxt)
















        displayBtn.setOnClickListener {
            if (!answerSelected) {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            returnBtn.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

            clearBtn.setOnClickListener {
                songTxt.text?.clear()
                listTxt.text = ""
            }
        }
    }
}


