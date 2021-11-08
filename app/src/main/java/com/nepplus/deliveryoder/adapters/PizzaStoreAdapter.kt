package com.nepplus.deliveryoder.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.deliveryoder.datas.StoreData

class PizzaStoreAdapter(val mContext=Context, val Resid:Int, val mList: ArrayList<StoreData>)
    :ArrayAdapter<StoreData>(mContext, Resid, mList) {
}