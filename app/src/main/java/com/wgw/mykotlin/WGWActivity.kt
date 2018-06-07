package com.wgw.mykotlin

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * Created by wgw on 2018/6/7.
 */

class WGWActivity:Activity(){
     var btn_ww:Button ?=null
    var tv_show: TextView? = null
    var mContext:Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wgw)
        initView()
        initListener()
    }

    fun initView(){
        btn_ww = findViewById(R.id.btn_test) as Button?
        tv_show = findViewById(R.id.tv_show) as TextView?
    }
    fun initListener(){
        btn_ww?.setOnClickListener(View.OnClickListener {
            tv_show?.text="I Love you!"
            Toast.makeText(mContext,"1111111111111111",Toast.LENGTH_LONG).show()
        })
    }
    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }
}