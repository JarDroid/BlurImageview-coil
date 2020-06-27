package com.blurimageview

import android.os.Bundle
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    val images = mutableListOf("https://c4.wallpaperflare.com/wallpaper/706/157/116/avengers-infinity-war-4k-thanos-wallpaper-preview.jpg",
            "https://c4.wallpaperflare.com/wallpaper/611/141/228/iron-man-marvel-comics-tony-stark-gaurav-wallpaper-preview.jpg",
            "https://c4.wallpaperflare.com/wallpaper/1023/1021/304/marvel-cinematic-universe-marvel-comics-thanos-avengers-infinity-war-wallpaper-preview.jpg",
            "https://c4.wallpaperflare.com/wallpaper/309/466/449/avengers-infinity-war-artwork-thanos-infinity-gauntlet-wallpaper-preview.jpg",
            "https://c4.wallpaperflare.com/wallpaper/780/684/986/infinity-stones-infinity-gauntlet-thanos-avengers-infinity-war-wallpaper-preview.jpg")
    var circles : LinearLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)
        val viewpager:ViewPager = findViewById(R.id.viewpager)
        imageSliderImplementation(viewpager)
    }
    private fun imageSliderImplementation(viewpager:ViewPager) {

        val adapter = ImageSliderAdapter(this)
        circles =findViewById(R.id.circles)
        viewpager.adapter = adapter
        viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
                setIndicator(position)
            }

        })
        buildCircles()




    }

    private fun buildCircles() {

        val scale = resources.displayMetrics.density
        val padding = (5 * scale + 0.5f).toInt()
        for (i in 0 until images.size) {
            val circle = ImageView(this)
            circle.setImageResource(R.drawable.circle_intro)
            circle.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            circle.adjustViewBounds = true
            circle.setPadding(padding, 0, padding, 0)
            circles?.addView(circle)
        }
        setIndicator(0)

    }

    private fun setIndicator(index: Int) {
        if (index < images.size) {
            for (i in 0 until images.size) {
                val circle = circles?.getChildAt(i) as ImageView
                if (i == index) {
                    circle.setColorFilter(getColor(R.color.white))
                } else {
                    circle.setColorFilter(getColor(R.color.amber))
                }
            }
        }
    }


}