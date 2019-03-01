package com.example.myapplication.tabs

import androidx.fragment.app.Fragment

abstract class BaseTabFragment : Fragment(){
    abstract fun getTitle():String?
    abstract fun getIcon():Int
    abstract fun getSelectedIcon():Int
}