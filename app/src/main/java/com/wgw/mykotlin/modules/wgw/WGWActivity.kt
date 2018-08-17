package com.wgw.mykotlin.modules.wgw

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.wgw.mykotlin.Base.BaseActivity
import com.wgw.mykotlin.Base.BasePresenter
import com.wgw.mykotlin.R

/**
 * Created by wgw on 2018/6/7.
 */

class WGWActivity: BaseActivity(), WGWContact.view {



    var btn_ww:Button ?=null
    var tv_show: TextView? = null
    var mContext:Context = this
    var presenter: WGWContact.presenter?=null;
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_wgw)
//        initView()
//        initListener()
//    }
    override fun getCurrentViewID(): Int {
        return R.layout.activity_wgw
    }
    override fun initView(){
        WGWpresenter(this, this)
        btn_ww = findViewById(R.id.btn_test) as Button?
        tv_show = findViewById(R.id.tv_show) as TextView?
    }
    override fun initListener(){
        btn_ww?.setOnClickListener(View.OnClickListener {
            tv_show?.text="I Love you!"
            Toast.makeText(mContext,"1111111111111111",Toast.LENGTH_LONG).show()
        })
    }
    override fun setPresenter(presenter: BasePresenter) {

        this.presenter != presenter;
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