package qoboqo.com.touristgidi

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class WikiActivity : AppCompatActivity() {

    //var itemId: Long? = null

    var wiki_sites = arrayOf("National Arts Theatre", "Third mainland bridge", "National stadium",
                             "Tinubu square", "Lekki conservation centre", "Tafawa Balewa square",
                              "Freedom park", "Taiwo Olowo monument", "National museum", "kalakuta museum",
                               "Cathedral church of christ", "Shitta Bey mosque", "Lufasi nature park",
                               "Lagos lagoon")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wiki)

        val wikiBar = supportActionBar
        wikiBar!!.title = "Wikis"

        val adapter = ArrayAdapter(this,
                             R.layout.listview_item, wiki_sites)
        val listView:ListView = findViewById(R.id.listview_1)
        listView.setAdapter(adapter)
        
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            var itemId = parent.getItemIdAtPosition(position).toInt()
            //Toast.makeText(this, "Showing Wiki number $itemId", Toast.LENGTH_SHORT).show()

            when(itemId) {
                0 -> openWebPage("https://en.wikipedia.org/wiki/National_Arts_Theatre")
                1 -> openWebPage("https://en.wikipedia.org/wiki/Third_Mainland_Bridge")
                2 -> openWebPage("https://en.wikipedia.org/wiki/National_Stadium,_Lagos")
                3 -> openWebPage("https://en.wikipedia.org/wiki/Tinubu_Square")
                4 -> openWebPage("https://en.wikipedia.org/wiki/Lekki_Conservation_Centre")
                5 -> openWebPage("https://en.wikipedia.org/wiki/Tafawa_Balewa_Square")
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
