package com.nepplus.deliveryoder.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.deliveryoder.Data.PizzaData
import com.nepplus.deliveryoder.R
import kotlinx.android.synthetic.*

class ListViewAdapter(val mContext: Context, val resId: Int, val mList: ArrayList<PizzaData>) :
    ArrayAdapter<PizzaData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.pizza_list_view_design, null)

            val row = tempRow!!

            val data=mList[position]

            val storeName = row.findViewById<TextView>(R.id.txtStoreName)
            val storeLogo = row.findViewById<TextView>(R.id.imgStoreLogo)

            storeName.text = data.storeName
            storeLogo.fic = data.storeLogo


            return row

        }



}}