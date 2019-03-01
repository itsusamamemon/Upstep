package com.example.myapplication.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import kotlinx.android.synthetic.main.tab1_layout.*

class PagerTab1 : BaseTabFragment() {
    override fun getSelectedIcon(): Int = R.mipmap.ic_launcher
    override fun getIcon(): Int = R.drawable.mg1
    override fun getTitle(): String? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.tab1_layout,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mytab1tv.text = "Test Text from tab"
    }
}