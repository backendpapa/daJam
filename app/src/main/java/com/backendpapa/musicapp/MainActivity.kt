package com.backendpapa.musicapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        var mediaPlayer = MediaPlayer.create(this, R.raw.koffee)
        findViewById<ImageButton>(R.id.play).setOnClickListener{

              mediaPlayer=MediaPlayer.create(this, R.raw.koffee)

            mediaPlayer.start()
        }
        findViewById<ImageButton>(R.id.stop).setOnClickListener{
            mediaPlayer.stop()
        }
//
    }
}