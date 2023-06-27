package com.plusapps.customviewtest

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout


class PieChart(context: Context, attrs: AttributeSet? = null) : ConstraintLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.item_brand, this, true)


        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.PieChart,
            0, 0).apply {

            try {
                //var showText = getBoolean(R.styleable.PieChart_showText, false)
                var showText = getString(R.styleable.PieChart_item1Text)
                Log.d("banana", showText.toString())

            } finally {
                recycle()
            }
        }
    }

    // custom view code goes here
}