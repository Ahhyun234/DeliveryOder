package com.nepplus.deliveryoder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.deliveryoder.Fragments.PizzaStoreListFragment
import com.nepplus.deliveryoder.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mViewPagerAdapter : ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setEvent()
        setValues()
    }

    fun setValues(){

        mViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter




    }

    fun setEvent(){


    }
}