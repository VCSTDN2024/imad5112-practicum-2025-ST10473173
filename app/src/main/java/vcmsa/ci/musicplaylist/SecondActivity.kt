package vcmsa.ci.musicplaylist

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
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
        val returnBtn : Button = findViewById(R.id.returnBtn) // when te return button is pressed, it will take you back to main screen
        val addBtn : Button = findViewById(R.id.addBtn)  // when the "add to playlist button is pressed this will add the song to your playlist
        val exitBtn : Button = findViewById(R.id.exitBtn) // when the exit button is pressed the app will completely close























        exitBtn.setOnClickListener {
            finishAffinity() }
    }
    }


