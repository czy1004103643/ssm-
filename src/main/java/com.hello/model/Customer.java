package com.hello.model;

import com.hello.utils.Logger;

import java.io.Serializable;
import java.sql.Date;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */
public class Customer implements Serializable {
    private long customerId;              //用户id
    private String customerPwd;               //Password密码
    private String customerGrade;          //等级
    private String customerStatus;         //状态信息
    private String customerSex;            //用户性别
    private String company;                //用户所在公司
    private String customerTel;            //用户电话
    private double customerAccountPrice;   //账户资金
    private String customerEmail;          //电子邮件
    private Date customerRegDate;        //注册时间

    public Customer() {
        this.customerId = -1;
        this.customerPwd = "000000";
        this.customerGrade = "A";
        this.customerStatus = "0";
        this.customerSex = "men";
        this.company = "";
        this.customerTel = "";
        this.customerAccountPrice = 0.0;
        this.customerEmail = "";
        this.customerRegDate = new Date(System.currentTimeMillis());
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPwd() {
        return customerPwd;
    }

    public void setCustomerPwd(String customer) {
        this.customerPwd = customer;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public double getCustomerAccountPrice() {
        return customerAccountPrice;
    }

    public void setCustomerAccountPrice(double customerAccountPrice) {
        this.customerAccountPrice = customerAccountPrice;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Date getCustomerRegDate() {
        return customerRegDate;
    }

    public void setCustomerRegDate(Date customerRegDate) {
        this.customerRegDate = customerRegDate;
    }

    @Override
    public String toString() {
        String stringMsg =
                "Customer{" +
                        "customerId='" + customerId + '\'' +
                        ", customer='" + customerPwd + '\'' +
                        ", customerGrade='" + customerGrade + '\'' +
                        ", customerStatus='" + customerStatus + '\'' +
                        ", customerSex='" + customerSex + '\'' +
                        ", company='" + company + '\'' +
                        ", customerTel='" + customerTel + '\'' +
                        ", customerAccountPrice='" + customerAccountPrice + '\'' +
                        ", customerEmail='" + customerEmail + '\'' +
                        ", customerRegDate='" + customerRegDate + '\'' +
                        '}';
        Logger.info(stringMsg);
        return stringMsg;
    }
}
