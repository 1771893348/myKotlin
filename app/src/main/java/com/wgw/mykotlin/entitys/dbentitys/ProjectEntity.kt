package com.wgw.mykotlin.entitys.dbentitys

import org.greenrobot.greendao.annotation.Entity
import org.greenrobot.greendao.annotation.Id
import org.greenrobot.greendao.annotation.Property

/**
 * @author wgw
 * @time 2018/8/17 17:47
 * @class describe
 */
@Entity
class ProjectEntity{
    @Id
    val ID:Long=0
    @Property
    val ProjecrtName:String="wgw"
    @Property
    val ProjectState:Int=0
    @Property
    val ProjectDays:Int=10
}