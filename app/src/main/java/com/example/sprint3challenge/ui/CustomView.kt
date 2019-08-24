package com.example.sprint3challenge.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.example.sprint3challenge.R

class CustomView(context: Context, attrs: AttributeSet?): LinearLayout(context, attrs) {

    constructor(context: Context): this(context, null)

    init{
        val typedArray = context.obtainStyledAttributes(attrs,
            R.styleable.CustomView
        )
        val textSize = typedArray.getDimension(R.styleable.CustomView_textSize, 20f)

        val imageLayoutParams = LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f)

        val rating = ImageView(context)
        rating.layoutParams = imageLayoutParams
        rating.setImageDrawable(ContextCompat.getDrawable(context,
            R.drawable.avd_star
        ))

        orientation = HORIZONTAL
        addView(rating)
        addView(rating)
        addView(rating)
        addView(rating)
        addView(rating)





    }

}