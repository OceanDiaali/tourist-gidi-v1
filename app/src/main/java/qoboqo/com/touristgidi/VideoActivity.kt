package qoboqo.com.touristgidi

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class VideoActivity : AppCompatActivity() {

    var video_sites = arrayOf("National Arts Theatre", "Third mainland bridge", "National stadium",
        "Tinubu square", "Lekki conservation centre", "Tafawa Balewa square",
        "Freedom park", "Taiwo Olowo monument", "National museum", "kalakuta museum",
        "Cathedral church of christ", "Shitta Bey mosque", "Lufasi nature park",
        "Lagos lagoon")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val videoBar = supportActionBar
        videoBar!!.title = "Videos"

        val adapter = ArrayAdapter(this,
            R.layout.listview_item, video_sites)
        val listView: ListView = findViewById(R.id.listview_2)
        listView.setAdapter(adapter)

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            var itemId = parent.getItemIdAtPosition(position).toInt()
            //Toast.makeText(this, "Showing Wiki number $itemId", Toast.LENGTH_SHORT).show()

            when(itemId) {
                0 -> openWebPage("https://www.youtube.com/results?search_query=national+arts+theatre+lagos")
                1 -> openWebPage("https://www.youtube.com/results?search_query=third+mainland+bridge+lagos+nigeria+")
                2 -> openWebPage("https://www.youtube.com/results?search_query=national+stadium+lagos+nigeria+")
                3 -> openWebPage("https://www.youtube.com/results?search_query=tinubu+square+lagos+nigeria+")
                4 -> openWebPage("https://www.youtube.com/results?search_query=lekki+conservation+center+lagos+nigeria+")
                5 -> openWebPage("https://www.youtube.com/results?search_query=tafawa+balewa+square+lagos+nigeria+")
                6 -> openWebPage("https://en.wikipedia.org/wiki/National_Arts_Theatre")
                7 -> openWebPage("https://en.wikipedia.org/wiki/National_Arts_Theatre")
                8 -> openWebPage("https://en.wikipedia.org/wiki/National_Arts_Theatre")
                9 -> openWebPage("https://en.wikipedia.org/wiki/National_Arts_Theatre")
                10 -> openWebPage("https://en.wikipedia.org/wiki/National_Arts_Theatre")
                11-> openWebPage("https://en.wikipedia.org/wiki/National_Arts_Theatre")
                12 -> openWebPage("https://en.wikipedia.org/wiki/National_Arts_Theatre")
                13 -> openWebPage("https://en.wikipedia.org/wiki/National_Arts_Theatre")

                else -> Toast.makeText(this, "Cannot display selection", Toast.LENGTH_LONG).show()
            }


        }

    } // main on create

    fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
} // class
