package com.nepplus.deliveryoder.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.nepplus.deliveryoder.R
import com.nepplus.deliveryoder.datas.StoreData
import java.util.zip.Inflater

class PizzaStoreAdapter(val mContext = Context, val Resid:Int, val mList: ArrayList<StoreData>)
    :ArrayAdapter<StoreData>(mContext, Resid, mList) {

        val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow==null){
            tempRow = mInflater.inflate(R.layout.store_list_item,null)
            }
        val row = tempRow!!


        val data=mList[position]

        val imgLogo = row.findViewById<ImageView>(R.id.imgLogo)
        val textStoreName = row.findViewById<TextView>(R.id.txtStoreName)

        return row

    }
}