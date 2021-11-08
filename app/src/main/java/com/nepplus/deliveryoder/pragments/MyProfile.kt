package com.nepplus.deliveryoder.pragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.deliveryoder.EditNickNameActivity
import com.nepplus.deliveryoder.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfile: Fragment() {

    val REQ_CODE_NICKNAME = 1000

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_my_profile,container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnChangeNickName.setOnClickListener {

            val myIntent = Intent(requireContext(),EditNickNameActivity::class.java)
            startActivityForResult(myIntent,REQ_CODE_NICKNAME)

//        onActivityResult()

            if(requestCode==REQ_CODE_NICKNAME){
                if(resultCode==Activity.RESULT_OK){
                    val newNickName = data!!.getStringExtra("nick")
                    txtNickName.text = newNickName
                }
            }


        }

    }
}