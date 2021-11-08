package com.nepplus.deliveryoder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        setOnEvent()
        setValues()
    }

    fun setOnEvent(){

        btnOK.setOnClickListener {
            val inputNickname = edtNewNickName.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nick",inputNickname)
            setResult(RESULT_OK,resultIntent)
            finish()
        }


    }

    fun setValues(){


    }
}