package com.ayhanunal.progressbarsliderratingbar

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

import androidx.appcompat.widget.AppCompatTextView;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonBasla.setOnClickListener {
            progressBar.visibility = View.VISIBLE
        }

        buttonDur.setOnClickListener {
            progressBar.visibility = View.INVISIBLE
        }

        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textViewSonuc.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        buttonGoster.setOnClickListener {
            val ratinDurum = ratingBar.rating.toString()
            Log.e("Rating Durum", ratinDurum)
        }


    }
}