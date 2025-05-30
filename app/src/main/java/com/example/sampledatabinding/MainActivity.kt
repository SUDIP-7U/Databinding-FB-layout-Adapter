package com.example.sampledatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampledatabinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //create a databinding object here
        val user = User("Heart says yes Brain says no")

        //pass this object here
        binding.user = user

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // List of image resource IDs
        val imageResIds = listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image4,
            R.drawable.image7,
            R.drawable.image7,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,
            R.drawable.image11,

        )

        recyclerView.adapter = ImageAdapter(imageResIds)

    }
}