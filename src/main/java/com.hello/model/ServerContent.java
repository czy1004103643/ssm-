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
public class ServerContent implements Serializable {
    private long serverId;                    //服务内容id
    private String serverGrage;               //等级
    private String serverPrice;               //服务价格
    private Date serverBeginDt;               //服务推广开始时间
    private Date serverEndDt;                 //服务推广结束时间
    private String serverDiscount;            //服务折扣
    private String serverInfo;                //服务信息

    public ServerContent() {
        this.serverId = DefaultValue.LONG_DEAULT;
        this.serverGrage = DefaultValue.STRING_DEAULT;
        this.serverPrice = DefaultValue.STRING_DEAULT;
        this.serverBeginDt = DefaultValue.SQL_DATE_DEAULT;
        this.serverEndDt = DefaultValue.SQL_DATE_DEAULT;
        this.serverDiscount = DefaultValue.STRING_DEAULT;
        this.serverInfo = DefaultValue.STRING_DEAULT;
    }

    public ServerContent(long serverId, String serverGrage, String serverPrice, Date serverBeginDt, Date serverEndDt, String serverDiscount, String serverInfo) {
        this.serverId = serverId;
        this.serverGrage = serverGrage;
        this.serverPrice = serverPrice;
        this.serverBeginDt = serverBeginDt;
        this.serverEndDt = serverEndDt;
        this.serverDiscount = serverDiscount;
        this.serverInfo = serverInfo;
    }

    public long getServerId() {
        return serverId;
    }

    public void setServerId(long serverId) {
        this.serverId = serverId;
    }

    public String getServerGrage() {
        return serverGrage;
    }

    public void setServerGrage(String serverGrage) {
        this.serverGrage = serverGrage;
    }

    public String getServerPrice() {
        return serverPrice;
    }

    public void setServerPrice(String serverPrice) {
        this.serverPrice = serverPrice;
    }

    public Date getServerBeginDt() {
        return serverBeginDt;
    }

    public void setServerBeginDt(Date serverBeginDt) {
        this.serverBeginDt = serverBeginDt;
    }

    public Date getServerEndDt() {
        return serverEndDt;
    }

    public void setServerEndDt(Date serverEndDt) {
        this.serverEndDt = serverEndDt;
    }

    public String getServerDiscount() {
        return serverDiscount;
    }

    public void setServerDiscount(String serverDiscount) {
        this.serverDiscount = serverDiscount;
    }

    public String getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerContent that = (ServerContent) o;
        return serverId == that.serverId &&
                Objects.equals(serverGrage, that.serverGrage) &&
                Objects.equals(serverPrice, that.serverPrice) &&
                Objects.equals(serverBeginDt, that.serverBeginDt) &&
                Objects.equals(serverEndDt, that.serverEndDt) &&
                Objects.equals(serverDiscount, that.serverDiscount) &&
                Objects.equals(serverInfo, that.serverInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, serverGrage, serverPrice, serverBeginDt, serverEndDt, serverDiscount, serverInfo);
    }

    @Override
    public String toString() {
        String stringMsg =
                "ServerContent{" +
                    "serverId=" + serverId +
                    ", serverGrage='" + serverGrage + '\'' +
                    ", serverPrice='" + serverPrice + '\'' +
                    ", serverBeginDt=" + serverBeginDt +
                    ", serverEndDt=" + serverEndDt +
                    ", serverDiscount='" + serverDiscount + '\'' +
                    ", serverInfo='" + serverInfo + '\'' +
                '}';
        Logger.info(stringMsg);
        return stringMsg;
    }
}
