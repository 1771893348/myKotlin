package com.wgw.mykotlin.entitys.dbentitys;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * @author wgw
 * @time 2018/8/17 16:42
 * @class describe
 */
@Entity(generateConstructors = false)
public class UserEntity {
    @Id
    private Long ID;
    @Property(nameInDb="USERNAME")
    String name;
    @Property(nameInDb = "USERAGE")
    int age;
    @Property(nameInDb = "USERSEX")
    String sex;
    @Property
    String password;

}
