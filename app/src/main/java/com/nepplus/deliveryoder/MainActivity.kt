package com.nepplus.deliveryoder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.deliveryoder.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

lateinit var mvpa: MainViewPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvent()
        setValues()
    }

    fun setValues() {

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter= mvpa



    }

    fun setUpEvent() {


    }
}