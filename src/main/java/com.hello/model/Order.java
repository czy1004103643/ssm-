package com.hello.model;

import com.hello.utils.DefaultValue;
import com.hello.utils.Logger;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */
public class Order implements Serializable {

    private long orderId;                    //订单id
    private long orderTradeNo;              //订单编号
    private long goodId;                    //商品编号
    private Date orderDate;                 //订单时间
    private double orderPrice;              //订单价格
    private String orderPayAccount;         //支付账号
    private double orderPayPrice;           //实际支付价格
    private String orderRemark;            //订单备注

    public Order() {
        this.orderId = orderId;
        this.orderTradeNo = orderTradeNo;
        this.goodId = goodId;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderPayAccount = orderPayAccount;
        this.orderPayPrice = orderPayPrice;
        this.orderRemark = orderRemark;
    }

    public Order(long orderId, long orderTradeNo, long goodId, Date orderDate, double orderPrice, String orderPayAccount, double orderPayPrice, String orderRemark) {
        this.orderId = orderId;
        this.orderTradeNo = orderTradeNo;
        this.goodId = goodId;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderPayAccount = orderPayAccount;
        this.orderPayPrice = orderPayPrice;
        this.orderRemark = orderRemark;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderTradeNo() {
        return orderTradeNo;
    }

    public void setOrderTradeNo(long orderTradeNo) {
        this.orderTradeNo = orderTradeNo;
    }

    public long getGoodId() {
        return goodId;
    }

    public void setGoodId(long goodId) {
        this.goodId = goodId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderPayAccount() {
        return orderPayAccount;
    }

    public void setOrderPayAccount(String orderPayAccount) {
        this.orderPayAccount = orderPayAccount;
    }

    public double getOrderPayPrice() {
        return orderPayPrice;
    }

    public void setOrderPayPrice(double orderPayPrice) {
        this.orderPayPrice = orderPayPrice;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId &&
                orderTradeNo == order.orderTradeNo &&
                goodId == order.goodId &&
                Double.compare(order.orderPrice, orderPrice) == 0 &&
                Double.compare(order.orderPayPrice, orderPayPrice) == 0 &&
                Objects.equals(orderDate, order.orderDate) &&
                Objects.equals(orderPayAccount, order.orderPayAccount) &&
                Objects.equals(orderRemark, order.orderRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderTradeNo, goodId, orderDate, orderPrice, orderPayAccount, orderPayPrice, orderRemark);
    }

    @Override
    public String toString() {
        String stringMsg =
                "Order{" +
                "orderId=" + orderId +
                ", orderTradeNo=" + orderTradeNo +
                ", goodId=" + goodId +
                ", orderDate=" + orderDate +
                ", orderPrice=" + orderPrice +
                ", orderPayAccount='" + orderPayAccount + '\'' +
                ", orderPayPrice=" + orderPayPrice +
                ", orderRemark='" + orderRemark + '\'' +
                '}';
        Logger.info(stringMsg);
        return stringMsg;
    }
}
