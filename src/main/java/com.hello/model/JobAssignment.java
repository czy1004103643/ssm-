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
public class JobAssignment implements Serializable {

    private long id;                        //分配id
    private String jobNumber;               //工作编号
    private String jobEmployee;             //工作员工
    private Date jobCommission;             //工作提成
    private Date jobBeginDt;                //工作开始时间
    private String jobEndDt;                //工作结束时间
    private String jobLocalation;           //工作地点
    private String jobRemark;               //工作信息

    public JobAssignment() {
    }

    public JobAssignment(long id, String jobNumber, String jobEmployee, Date jobCommission, Date jobBeginDt, String jobEndDt, String jobLocalation, String jobRemark) {
        this.id = id;
        this.jobNumber = jobNumber;
        this.jobEmployee = jobEmployee;
        this.jobCommission = jobCommission;
        this.jobBeginDt = jobBeginDt;
        this.jobEndDt = jobEndDt;
        this.jobLocalation = jobLocalation;
        this.jobRemark = jobRemark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getJobEmployee() {
        return jobEmployee;
    }

    public void setJobEmployee(String jobEmployee) {
        this.jobEmployee = jobEmployee;
    }

    public Date getJobCommission() {
        return jobCommission;
    }

    public void setJobCommission(Date jobCommission) {
        this.jobCommission = jobCommission;
    }

    public Date getJobBeginDt() {
        return jobBeginDt;
    }

    public void setJobBeginDt(Date jobBeginDt) {
        this.jobBeginDt = jobBeginDt;
    }

    public String getJobEndDt() {
        return jobEndDt;
    }

    public void setJobEndDt(String jobEndDt) {
        this.jobEndDt = jobEndDt;
    }

    public String getJobLocalation() {
        return jobLocalation;
    }

    public void setJobLocalation(String jobLocalation) {
        this.jobLocalation = jobLocalation;
    }

    public String getJobRemark() {
        return jobRemark;
    }

    public void setJobRemark(String jobRemark) {
        this.jobRemark = jobRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobAssignment that = (JobAssignment) o;
        return id == that.id &&
                jobNumber.equals(that.jobNumber) &&
                jobEmployee.equals(that.jobEmployee) &&
                jobCommission.equals(that.jobCommission) &&
                jobBeginDt.equals(that.jobBeginDt) &&
                jobEndDt.equals(that.jobEndDt) &&
                jobLocalation.equals(that.jobLocalation) &&
                jobRemark.equals(that.jobRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobNumber, jobEmployee, jobCommission, jobBeginDt, jobEndDt, jobLocalation, jobRemark);
    }

    @Override
    public String toString() {
        String stringMsg =
                "JobAssignment{" +
                    "id=" + id +
                    ", jobNumber='" + jobNumber + '\'' +
                    ", jobEmployee='" + jobEmployee + '\'' +
                    ", jobCommission=" + jobCommission +
                    ", jobBeginDt=" + jobBeginDt +
                    ", jobEndDt='" + jobEndDt + '\'' +
                    ", jobLocalation='" + jobLocalation + '\'' +
                    ", jobRemark='" + jobRemark + '\'' +
                '}';
        Logger.info(stringMsg);
        return stringMsg;
    }
}
