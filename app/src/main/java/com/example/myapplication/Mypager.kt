package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.ishaquehassan.recyclerviewgeneraladapter.RecyclerViewGeneralAdapter
import kotlinx.android.synthetic.main.activity_mypager.*

class Mypager : AppCompatActivity() {
    data class bannerArray(val img:Int)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypager)
        banner.adapter = RecyclerViewGeneralAdapter(
            arrayListOf(
                bannerArray(R.drawable.bg1),
                bannerArray(R.drawable.bg2),
                bannerArray(R.drawable.bg3),
                bannerArray(R.drawable.bg4),
                bannerArray(R.drawable.bg5)
            ),R.layout.mybanner,
            {itemData, viewHolder ->
                val itemView = viewHolder.itemView
                itemView.findViewById<ImageView>(R.id.ban).setImageResource(itemData.img)
            }

        )

        banner.orientation = ViewPager2.ORIENTATION_HORIZONTAL

    }
}
