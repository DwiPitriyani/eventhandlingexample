package dwi.polbeng.ac.id.eventhandlingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import android.widget.Toast
import dwi.polbeng.ac.id.eventhandlingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener
        binding.btnDisplayMessage.setOnClickListener {
            Toast.makeText(applicationContext, "Hello World", Toast.LENGTH_LONG).show()
        }

        // Set long click listener
        binding.btnDisplayMessage.setOnLongClickListener {
            Toast.makeText(applicationContext, "Button Long Clicked", Toast.LENGTH_SHORT).show()
            true // Indicate that the long click was handled
        }
    }
}
