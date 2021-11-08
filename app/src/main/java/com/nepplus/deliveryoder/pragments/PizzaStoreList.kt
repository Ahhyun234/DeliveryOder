package com.nepplus.deliveryoder.pragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.deliveryoder.R
import com.nepplus.deliveryoder.ViewStoreDetailActivity
import com.nepplus.deliveryoder.adapters.PizzaStoreAdapter
import com.nepplus.deliveryoder.datas.StoreData
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreList: Fragment() {

    val mPizzaStoreList = ArrayList<StoreData>()
        lateinit var mPizzaStoreAdapter : PizzaStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_pizza_store_list,container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        mPizzaStoreList.add(StoreData("피자헛","15885588","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))
        mPizzaStoreList.add(StoreData("파파존스","15778080","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"))
        mPizzaStoreList.add(StoreData("미스터 피자","15770077","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"))
        mPizzaStoreList.add(StoreData("도미노피자","15773082","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"))

        mPizzaStoreAdapter = PizzaStoreAdapter(requireContext(),R.layout.store_list_item,mPizzaStoreList)
        mainListView.adapter=mPizzaStoreAdapter

        mainListView.setOnItemClickListener { adapterView, view, position, l ->
            val clickedStore = mPizzaStoreList[position]
            val myIntent = Intent(requireContext(),ViewStoreDetailActivity::class.java)
         myIntent.putExtra(myIntent)
        }

    }
}