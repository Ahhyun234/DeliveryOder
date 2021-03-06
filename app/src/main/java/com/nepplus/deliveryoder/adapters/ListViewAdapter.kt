package com.nepplus.deliveryoder.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.nepplus.deliveryoder.Data.PizzaData
import com.nepplus.deliveryoder.R


class ListViewAdapter(val mContext: Context, val resId: Int, val mList: ArrayList<PizzaData>) :
    ArrayAdapter<PizzaData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.pizza_list_view_design, null)
        }

            val row = tempRow!!

            val data=mList[position]

            val storeName = row.findViewById<TextView>(R.id.txtStoreName)
            val storeLogo = row.findViewById<ImageView>(R.id.imgStorePic)

            storeName.text = data.storeName
            Glide.with(mContext).load(data.storeLogo).into(storeLogo)


            return row

        }



}