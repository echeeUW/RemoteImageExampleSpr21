package edu.uw.echee.remoteimageexamplespr21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import edu.uw.echee.remoteimageexamplespr21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {
            btnLoad.setOnClickListener { loadImage() }

            swipeToRefreshLayout.setOnRefreshListener {
                loadImage()
                swipeToRefreshLayout.isRefreshing = false
            }
        }
    }

    // Load image from this URL:
    //       https://raw.githubusercontent.com/echeeUW/codesnippets/master/voldemort.png
    private fun loadImage() {
        with(binding) {

            ivProfilePic.load("https://raw.githubusercontent.com/echeeUW/codesnippets/master/voldemort.png")

        }
    }
}
