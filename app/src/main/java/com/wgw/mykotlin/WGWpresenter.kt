package com.wgw.mykotlin

import android.content.Context
import com.wgw.mykotlin.Base.BaseView

/**
 * @author wgw
 * @time 2018/8/17 14:32
 * @class describe
 */
class WGWpresenter :WGWContact.presenter{
    private val mContext: Context?=null
    private val iView:WGWContact.view?=null
    constructor(view:BaseView,context:Context){
        this.iView != view
        this.mContext!= context


    }
    override fun start() {
    }

    override fun destroy() {
    }

}