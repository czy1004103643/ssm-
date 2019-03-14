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
public class Employee implements Serializable {

    private long employeeId;                      //员工id
    private String employeeNumber;               //员工编号
    private String employeeName;                 //员工名字
    private Date employeeHiredate;               //员工入职时间
    private double employeeSalary;                 //员工工资
    private String employeeType;                 //员工类型
    private String employeeTel;                  //员工电话
    private String employeeExtraInfo;            //员工额外信息
    private String employeeSex;                  //员工性别
    private String employeePassword;             //员工密码
    private BankCard employeeBankCardInfo;       //员工银行卡信息

    public Employee() {
        this.employeeId = DefaultValue.LONG_DEAULT;
        this.employeeNumber = DefaultValue.STRING_DEAULT;
        this.employeeName = DefaultValue.STRING_DEAULT;
        this.employeeHiredate = DefaultValue.SQL_DATE_DEAULT;
        this.employeeSalary = DefaultValue.DOUBLE_DEAULT;
        this.employeeType = DefaultValue.STRING_DEAULT;
        this.employeeTel = DefaultValue.STRING_DEAULT;
        this.employeeExtraInfo = DefaultValue.STRING_DEAULT;
        this.employeeSex = DefaultValue.STRING_DEAULT;
        this.employeePassword = DefaultValue.STRING_DEAULT;
        this.employeeBankCardInfo = new BankCard();
    }

    public Employee(long employeeId, String employeeNumber, String employeeName, Date employeeHiredate, double employeeSalary, String employeeType, String employeeTel, String employeeExtraInfo, String employeeSex, String employeePassword, BankCard employeeBankCardInfo) {
        this.employeeId = employeeId;
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeHiredate = employeeHiredate;
        this.employeeSalary = employeeSalary;
        this.employeeType = employeeType;
        this.employeeTel = employeeTel;
        this.employeeExtraInfo = employeeExtraInfo;
        this.employeeSex = employeeSex;
        this.employeePassword = employeePassword;
        this.employeeBankCardInfo = employeeBankCardInfo;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeHiredate() {
        return employeeHiredate;
    }

    public void setEmployeeHiredate(Date employeeHiredate) {
        this.employeeHiredate = employeeHiredate;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmployeeTel() {
        return employeeTel;
    }

    public void setEmployeeTel(String employeeTel) {
        this.employeeTel = employeeTel;
    }

    public String getEmployeeExtraInfo() {
        return employeeExtraInfo;
    }

    public void setEmployeeExtraInfo(String employeeExtraInfo) {
        this.employeeExtraInfo = employeeExtraInfo;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public BankCard getEmployeeBankCardInfo() {
        return employeeBankCardInfo;
    }

    public void setEmployeeBankCardInfo(BankCard employeeBankCardInfo) {
        this.employeeBankCardInfo = employeeBankCardInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId &&
                Objects.equals(employeeNumber, employee.employeeNumber) &&
                Objects.equals(employeeName, employee.employeeName) &&
                Objects.equals(employeeHiredate, employee.employeeHiredate) &&
                Objects.equals(employeeSalary, employee.employeeSalary) &&
                Objects.equals(employeeType, employee.employeeType) &&
                Objects.equals(employeeTel, employee.employeeTel) &&
                Objects.equals(employeeExtraInfo, employee.employeeExtraInfo) &&
                Objects.equals(employeeSex, employee.employeeSex) &&
                Objects.equals(employeePassword, employee.employeePassword) &&
                Objects.equals(employeeBankCardInfo, employee.employeeBankCardInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeNumber, employeeName, employeeHiredate, employeeSalary, employeeType, employeeTel, employeeExtraInfo, employeeSex, employeePassword, employeeBankCardInfo);
    }

    @Override
    public String toString() {
        String stringMsg =
                "Employee{" +
                    "employeeId=" + employeeId +
                    ", employeeNumber='" + employeeNumber + '\'' +
                    ", employeeName='" + employeeName + '\'' +
                    ", employeeHiredate=" + employeeHiredate +
                    ", employeeSalary=" + employeeSalary +
                    ", employeeType='" + employeeType + '\'' +
                    ", employeeTel='" + employeeTel + '\'' +
                    ", employeeExtraInfo='" + employeeExtraInfo + '\'' +
                    ", employeeSex='" + employeeSex + '\'' +
                    ", employeePassword='" + employeePassword + '\'' +
                    ", employeeBankCardInfo=" + employeeBankCardInfo +
                '}';
        Logger.info(stringMsg);
        return stringMsg;
    }
}
