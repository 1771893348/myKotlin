package com.wgw.mykotlin.Base

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater

/**
 * @author wgw
 * @time 2018/8/17 14:35
 * @class describe
 */

public abstract class BaseActivity:Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        var view = LayoutInflater.from(this).inflate(getCurrentViewID(),null);
        setContentView(view);
        initView();
        initListener();

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    abstract fun getCurrentViewID():Int;
    abstract fun initView();
    abstract fun initListener();
}