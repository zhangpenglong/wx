package com.huixiangfu.moudles.weixin.vo;

import java.util.Date;

/**
 * Created by dongao on 2018/1/19.
 */
public class User {


    private Integer id;
    private String userId;
    private String money;
    private Date accDate;

    public Date getAccDate() {
        return accDate;
    }

    public void setAccDate(Date accDate) {
        this.accDate = accDate;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
