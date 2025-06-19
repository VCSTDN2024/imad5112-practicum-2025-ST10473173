package vcmsa.ci.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val btnStart: Button = findViewById(R.id.startBtn) // Start button takes you to SecondActivity
        btnStart.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
    }
