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


        val exitBtn : Button = findViewById(R.id.exitBtn)  // Exit Button will make you close the app completely

        val btnStart: Button = findViewById(R.id.startBtn) // Start button takes you to SecondActivity
        btnStart.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java) // this function will move you from main screen to second screen.
            startActivity(intent)
        }
        exitBtn.setOnClickListener { // function wil close the app completely
            finishAffinity() }
    }
}

