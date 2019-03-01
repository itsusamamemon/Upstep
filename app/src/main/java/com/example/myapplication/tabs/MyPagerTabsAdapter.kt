package com.example.myapplication.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MyPagerTabsAdapter(fm:FragmentManager,val myTabs:ArrayList<BaseTabFragment>) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment = myTabs[position]
    override fun getCount(): Int = myTabs.size
    override fun getPageTitle(position: Int): CharSequence? =  myTabs[position].getTitle()
}