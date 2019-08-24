package com.example.sprint3challenge

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

class CustomView(context: Context, attrs: AttributeSet?): LinearLayout(context, attrs) {

    constructor(context: Context): this(context, null)

    init{
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomView)
        val textSize = typedArray.getDimension(R.styleable.CustomView_textSize, 12f)
        val rating = ImageView(context)
        rating.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.avd_star))

        orientation = HORIZONTAL
        addView(rating)
        addView(rating)
        addView(rating)
        addView(rating)
        addView(rating)





    }

}