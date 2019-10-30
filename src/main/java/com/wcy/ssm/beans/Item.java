package com.wcy.ssm.beans;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable {
    private static final long serialVersionUID = -3253121758438759169L;
    /*商品id*/
    private Long id;
    /*商品名称*/
    private String name;
    /*价格*/
    private Float price;
    /*商品创建时间*/
    private Date createTime;
    /*商品描述*/
    private String detail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Item() {
    }

    public Item(Long id, String name, Float price, Date createTime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createTime = createTime;
        this.detail = detail;
    }
}
