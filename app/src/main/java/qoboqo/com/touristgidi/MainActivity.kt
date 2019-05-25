package qoboqo.com.touristgidi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wiki_btn = findViewById<Button>(R.id.wiki_button_view)
        var video_btn = findViewById<Button>(R.id.video_button_view)
        var map_btn = findViewById<Button>(R.id.map_button_view)
        var about_btn = findViewById<Button>(R.id.about_button_view)

        wiki_btn.setOnClickListener {
            val wiki = Intent(this, WikiActivity::class.java)
            //wiki.putExtra("Wikis", "W")
            startActivity(wiki)
        }

        video_btn.setOnClickListener {
            val video = Intent(this, VideoActivity::class.java)
            startActivity(video)
        }

        map_btn.setOnClickListener {
            val map = Intent(this, MapActivity::class.java)
            startActivity(map)
        }

        about_btn.setOnClickListener {
            Toast.makeText(this, "Tourist Gidi helps you find and learn about important places in Lagos", Toast.LENGTH_LONG).show()
        }
    } // main on create
} // class
