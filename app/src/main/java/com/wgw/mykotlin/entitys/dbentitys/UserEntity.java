package com.wgw.mykotlin.entitys.dbentitys;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

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

    public UserEntity() {
    }

    public Long getID() {
        return this.ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
