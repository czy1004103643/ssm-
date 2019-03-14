package com.hello.model;

import com.hello.utils.DefaultValue;
import com.hello.utils.Logger;

import java.sql.Date;
import java.util.Objects;

/**
 * project #project
 * authod  admin
 * datetime 2018.5.6
 * desc  银行卡号信息
 */

public class BankCard {
    private long id;                         //银行卡id
    private String cardId;                   //银行卡号
    private String password;                 //银行卡密码
    private String username;                 //银行卡拥有者
    private String bank;                     //银行
    private int cardStatus;                  //银行卡状态
    private Date cardRegDate;                //银行卡添加时间

    public BankCard() {
        this.id = DefaultValue.LONG_DEAULT;
        this.cardId = DefaultValue.STRING_DEAULT;
        this.password = DefaultValue.STRING_DEAULT;
        this.bank = DefaultValue.STRING_DEAULT;
        this.cardStatus = DefaultValue.INT_DEAULT;
        this.cardRegDate = DefaultValue.SQL_DATE_DEAULT;
    }

    public BankCard(long id, String cardId, String password, String username, String bank, int cardStatus, Date cardRegDate) {
        this.id = id;
        this.cardId = cardId;
        this.password = password;
        this.username = username;
        this.bank = bank;
        this.cardStatus = cardStatus;
        this.cardRegDate = cardRegDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(int cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Date getCardRegDate() {
        return cardRegDate;
    }

    public void setCardRegDate(Date cardRegDate) {
        this.cardRegDate = cardRegDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankCard bankCard = (BankCard) o;
        return id == bankCard.id &&
                cardStatus == bankCard.cardStatus &&
                Objects.equals(cardId, bankCard.cardId) &&
                Objects.equals(password, bankCard.password) &&
                Objects.equals(username, bankCard.username) &&
                Objects.equals(bank, bankCard.bank) &&
                Objects.equals(cardRegDate, bankCard.cardRegDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardId, password, username, bank, cardStatus, cardRegDate);
    }

    @Override
    public String toString() {
        String stringMsg =
                "BankCard{" +
                "id=" + id +
                ", cardId='" + cardId + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", bank='" + bank + '\'' +
                ", cardStatus=" + cardStatus +
                ", cardRegDate=" + cardRegDate +
                '}';
        Logger.info(stringMsg);
        return stringMsg;
    }
}
