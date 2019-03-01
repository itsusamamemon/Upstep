package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.myapplication.tabs.BaseTabFragment
import com.example.myapplication.tabs.MyPagerTabsAdapter
import com.example.myapplication.tabs.PagerTab1
import com.google.android.material.tabs.TabLayout
import com.ishaquehassan.recyclerviewgeneraladapter.RecyclerViewGeneralAdapter
import kotlinx.android.synthetic.main.activity_viewpage.*

class Viewpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpage)

        /*myPager.adapter = RecyclerViewGeneralAdapter(
            arrayListOf(Color.CYAN,Color.DKGRAY,Color.MAGENTA),
            mapOf(
                1 to R.layout.pager_item,
                2 to R.layout.pager_item_2,
                3 to R.layout.pager_item3
            ),
            {position, itemData ->
               when(itemData){
                   Color.CYAN -> 1
                   Color.DKGRAY -> 2
                   Color.MAGENTA -> 3
                   else -> 2
               }
            }
        ){itemData, viewHolder ->
            viewHolder.itemView.setBackgroundColor(itemData)
        }*/
        //tab.setupWithViewPager(myPager)
        //myPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        val pagerTabs = arrayListOf<BaseTabFragment>(
            PagerTab1(),
            PagerTab1(),
            PagerTab1()
        )
        myPager.adapter = MyPagerTabsAdapter(supportFragmentManager,pagerTabs)
        tab.setupWithViewPager(myPager)


        tab.setIcons(pagerTabs)
        myPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                tab.setIcons(pagerTabs,position)
            }

        })
    }

    fun TabLayout.setIcons(arrayList: ArrayList<BaseTabFragment>,selectedIndex:Int = 0){
        for ((tabIndex,tab) in arrayList.withIndex()){
            if (tabIndex == selectedIndex){
                getTabAt(tabIndex)?.setIcon(tab.getSelectedIcon())
            }else{
                getTabAt(tabIndex)?.setIcon(tab.getIcon())
            }
        }
    }


}
