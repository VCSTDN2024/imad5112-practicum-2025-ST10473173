package vcmsa.ci.musicplaylist

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    private lateinit var songTxt: EditText
    private lateinit var listTxt: TextView
    private lateinit var addBtn: Button
    private lateinit var displayBtn: Button
    private lateinit var returnBtn: Button
    private lateinit var averageBtn: Button
    private lateinit var fullDetailsBtn: Button

    // Parallel arrays to store song information
    private val songTitles = mutableListOf<String>()
    private val artists = mutableListOf<String>()
    private val ratings = mutableListOf<Int>()
    private val comments = mutableListOf<String>()

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // all the XML components
        songTxt = findViewById(R.id.songTxt)
        listTxt = findViewById(R.id.listTxt)
        addBtn = findViewById(R.id.addBtn)
        displayBtn = findViewById(R.id.displayBtn)
        returnBtn = findViewById(R.id.returnBtn)
        averageBtn = findViewById(R.id.averageBtn)
        fullDetailsBtn = findViewById(R.id.fullDetailsBtn)

        // all the 4 songs

        if (songTitles.isEmpty()) {
            songTitles.addAll(listOf("Shape of You", "Blinding Lights", "Levitating", "Senorita"))
            artists.addAll(listOf("Ed Sheeran", "The Weeknd", "Dua Lipa", "Shawn Mendes"))
            ratings.addAll(listOf(5, 4, 5, 3))
            comments.addAll(listOf("Great beat!", "Catchy!", "Love it!", "Nice duo"))
        }

        // Add new song manually (prompted by user)
        addBtn.setOnClickListener {
            val song = songTxt.text.toString().trim()
            if (song.isNotEmpty()) {
                songTitles.add(song)
                artists.add("Unknown")
                ratings.add(3)
                comments.add("No comment")
                songTxt.text.clear()
                Toast.makeText(this, "Song added!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter a song title.", Toast.LENGTH_SHORT).show()
            }
        }

        // Display all song titles
        displayBtn.setOnClickListener {
            if (songTitles.isNotEmpty()) {
                val allSongs = songTitles.joinToString("\n")
                listTxt.text = allSongs
            } else {
                listTxt.text = "No songs in playlist."
            }
        }

        // Display full details of each song using a loop
        fullDetailsBtn.setOnClickListener {
            val builder = StringBuilder()
            for (i in songTitles.indices) {
                builder.append("Title: ${songTitles[i]}\n")
                builder.append("Artist: ${artists[i]}\n")
                builder.append("Rating: ${ratings[i]}\n")
                builder.append("Comment: ${comments[i]}\n\n")
            }
            listTxt.text = builder.toString()
        }

        // Calculate and display average rating
        averageBtn.setOnClickListener {
            if (ratings.isNotEmpty()) {
                var total = 0
                for (rate in ratings) {
                    total += rate
                }
                val avg = total.toDouble() / ratings.size
                listTxt.text = "Average Rating: %.2f".format(avg)
            } else {
                listTxt.text = "No ratings to average."
            }
        }

        // Return to main screen
        returnBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        }
    }


