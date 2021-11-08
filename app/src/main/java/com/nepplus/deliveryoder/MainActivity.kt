package com.nepplus.deliveryoder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.deliveryoder.Data.PizzaData
import com.nepplus.deliveryoder.Fragments.PizzaStoreListFragment
import com.nepplus.deliveryoder.adapters.ListViewAdapter
import com.nepplus.deliveryoder.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mPizzaList= ArrayList<PizzaData>()
    lateinit var mPizzaAdapter :ListViewAdapter

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


        mainTabLayout.setupWithViewPager(mainViewPager)

        mPizzaList.add(PizzaData("피자헛","15885588","이미지"))

        mPizzaAdapter = ListViewAdapter(this,R.layout.pizza_list_view_design,mPizzaList)
        mainListView.adapter = mPizzaAdapter

    }

    fun setEvent(){


    }
}