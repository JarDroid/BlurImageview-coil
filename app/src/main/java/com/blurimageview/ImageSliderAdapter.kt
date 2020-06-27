package com.blurimageview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.blurbackgroundimageview.BlurImageArtist

class ImageSliderAdapter(private val context: Context) : PagerAdapter() {


    private var inflater: LayoutInflater? = null
    //private val images = arrayOf(R.string.img1, R.string.img2, R.string.img3, R.string.img4,R.string.img5)
    val images = mutableListOf("https://c4.wallpaperflare.com/wallpaper/706/157/116/avengers-infinity-war-4k-thanos-wallpaper-preview.jpg",
            "https://c4.wallpaperflare.com/wallpaper/611/141/228/iron-man-marvel-comics-tony-stark-gaurav-wallpaper-preview.jpg",
            "https://c4.wallpaperflare.com/wallpaper/1023/1021/304/marvel-cinematic-universe-marvel-comics-thanos-avengers-infinity-war-wallpaper-preview.jpg",
            "https://c4.wallpaperflare.com/wallpaper/309/466/449/avengers-infinity-war-artwork-thanos-infinity-gauntlet-wallpaper-preview.jpg",
            "https://c4.wallpaperflare.com/wallpaper/780/684/986/infinity-stones-infinity-gauntlet-thanos-avengers-infinity-war-wallpaper-preview.jpg")
    val backBlurRadius = 12f
    val backBlurSampling = 6f

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view === `object`
    }

    override fun getCount(): Int {

        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater!!.inflate(R.layout.blurimageview_listitem, null)
        val blurImageArtist: BlurImageArtist? = view.findViewById(R.id.blurImage)
        Log.e("Urlxx",images[position])
        blurImageArtist!!.setUrlImage(images[position],R.drawable.error,R.drawable.loading,backBlurRadius,backBlurSampling)

        val vp = container as ViewPager
        vp.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        val vp = container as ViewPager
        val view = `object` as View
        vp.removeView(view)
    }

}