package com.example.sprint3challenge.util

import android.graphics.drawable.Animatable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.sprint3challenge.R
import kotlinx.android.synthetic.main.rating.*

class Rating: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rating)

        star1.setOnClickListener {
            animateVectorDrawable(R.drawable.avd_star, star1)
        }

        star2.setOnClickListener {
            animateVectorDrawable(R.drawable.avd_star, star2)
            animateVectorDrawable(R.drawable.avd_star, star1)
        }

        star3.setOnClickListener {
            animateVectorDrawable(R.drawable.avd_star, star3)
            animateVectorDrawable(R.drawable.avd_star, star2)
            animateVectorDrawable(R.drawable.avd_star, star1)
        }

        star4.setOnClickListener {
            animateVectorDrawable(R.drawable.avd_star, star4)
            animateVectorDrawable(R.drawable.avd_star, star3)
            animateVectorDrawable(R.drawable.avd_star, star2)
            animateVectorDrawable(R.drawable.avd_star, star1)
        }

        star5.setOnClickListener {
            animateVectorDrawable(R.drawable.avd_star, star5)
            animateVectorDrawable(R.drawable.avd_star, star4)
            animateVectorDrawable(R.drawable.avd_star, star3)
            animateVectorDrawable(R.drawable.avd_star, star2)
            animateVectorDrawable(R.drawable.avd_star, star1)
        }
    }
        private fun animateVectorDrawable(id: Int, view: ImageView) {
            val animatedVectorDrawable = ContextCompat.getDrawable(
                this,
                R.drawable.avd_star
            )
            view.setImageDrawable(animatedVectorDrawable)
            (animatedVectorDrawable as Animatable).start()
        }
    }