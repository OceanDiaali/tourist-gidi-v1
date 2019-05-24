package qoboqo.com.touristgidi

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import android.content.ActivityNotFoundException



class MapActivity : AppCompatActivity() {

    var map_sites = arrayOf("National Arts Theatre", "Third mainland bridge", "National stadium",
        "Tinubu square", "Lekki conservation centre", "Tafawa Balewa square",
        "Freedom park", "Taiwo Olowo monument", "National museum", "kalakuta museum",
        "Cathedral church of christ", "Shitta Bey mosque", "Lufasi nature park",
        "Lagos lagoon")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val mapBar = supportActionBar
        mapBar!!.title = "Maps"

        val adapter = ArrayAdapter(this,
            R.layout.listview_item, map_sites)
        val listView: ListView = findViewById(R.id.listview_3)
        listView.setAdapter(adapter)

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            var itemId = parent.getItemIdAtPosition(position).toInt()
            //Toast.makeText(this, "Showing Wiki number $itemId", Toast.LENGTH_SHORT).show()

            when(itemId) {
                0 -> newMap("6.4764","3.3694")
                1 -> newMap("6.5025", "3.4025")
                2 -> newMap("6.4972", "3.3650")
                3 -> newMap("6.4538", "3.3894")
                4 -> newMap("6.4416", "3.5358")
                5 -> newMap("6.4454", "3.4016")
                6 -> newMap("6.4490", "3.3965")
                7 -> newMap(" 6°27'21.6", "3°23'4.56")
                8 -> newMap("6.4443", "3.4037")

                else -> Toast.makeText(this, "Cannot display selection", Toast.LENGTH_LONG).show()
            }


        }

    } // main on create

    // function to launch google map and set site coords
    fun newMap (lat: String, lng: String) {
        val navigationIntentUri = Uri.parse("google.navigation:q=" + lat + "," + lng)
        val intent = Intent(Intent.ACTION_VIEW, navigationIntentUri)
        intent.setPackage("com.google.android.apps.maps")
        startActivity(intent)

    }

} // class
