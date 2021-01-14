package com.example.morelayoutfromudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

   var bartIsShowing = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bartImageView = findViewById<ImageView>(R.id.bartImageView)
        //bartImageView.animate().translationXBy(-1000F)
        bartImageView.setX(-1000F)
        bartImageView.animate().translationXBy(1000F).rotation(3600f).setDuration(2000)


    }

    fun fade(view: View) {
        Log.i("Info", "ImageView tapped");

        var bartImageView = findViewById<ImageView>(R.id.bartImageView)
        var homerImageview = findViewById<ImageView>(R.id.homerImageView)

        if(bartIsShowing)
        {
            bartIsShowing = false
            bartImageView.animate().alpha(0.0F).setDuration(1000);
            homerImageview.animate().alpha(1.0F).setDuration(1000);

        } else {
            bartIsShowing = true
            bartImageView.animate().alpha(1.0F).setDuration(1000);
            homerImageview.animate().alpha(0.0F).setDuration(1000);

        }
    }

    fun rotation(view: View)
    {
        var bartImageView = findViewById<ImageView>(R.id.bartImageView)
        bartImageView.animate().rotation(1800F).alpha(0F).setDuration(1000);
    }

    fun scale(view: View)
    {
        var bartImageView = findViewById<ImageView>(R.id.bartImageView)
        bartImageView.animate().scaleX(0.5F).scaleY(0.5F).setDuration(1000)
    }


}