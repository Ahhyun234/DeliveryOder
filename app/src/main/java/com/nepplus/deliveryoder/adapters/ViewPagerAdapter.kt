package com.nepplus.deliveryoder.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nepplus.deliveryoder.Fragments.MyProfileFragment
import com.nepplus.deliveryoder.Fragments.PizzaStoreListFragment

class ViewPagerAdapter(fm : FragmentManager): FragmentPagerAdapter(fm) {


    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "피자가게"
            else -> "내정보"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){

            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()

        }

          }

}