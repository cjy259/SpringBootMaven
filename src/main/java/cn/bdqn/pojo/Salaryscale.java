package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Salaryscale {
    private long id;
    private String paynumber;
    private String auditstatus;
    private Time registrationtime;
    private String salaryname;
    private Long paytime;
    private Long totalnumber;
    private String totalbasic;
    private String actualamount;
    private Time paymenttime;
    private String iinsttiutions;
    private String iiinstatitutions;
    private String person;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PAYNUMBER", nullable = true, length = 20)
    public String getPaynumber() {
        return paynumber;
    }

    public void setPaynumber(String paynumber) {
        this.paynumber = paynumber;
    }

    @Basic
    @Column(name = "AUDITSTATUS", nullable = true, length = 20)
    public String getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
    }

    @Basic
    @Column(name = "REGISTRATIONTIME", nullable = true)
    public Time getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(Time registrationtime) {
        this.registrationtime = registrationtime;
    }

    @Basic
    @Column(name = "SALARYNAME", nullable = true, length = 20)
    public String getSalaryname() {
        return salaryname;
    }

    public void setSalaryname(String salaryname) {
        this.salaryname = salaryname;
    }

    @Basic
    @Column(name = "PAYTIME", nullable = true, precision = 0)
    public Long getPaytime() {
        return paytime;
    }

    public void setPaytime(Long paytime) {
        this.paytime = paytime;
    }

    @Basic
    @Column(name = "TOTALNUMBER", nullable = true, precision = 0)
    public Long getTotalnumber() {
        return totalnumber;
    }

    public void setTotalnumber(Long totalnumber) {
        this.totalnumber = totalnumber;
    }

    @Basic
    @Column(name = "TOTALBASIC", nullable = true, length = 20)
    public String getTotalbasic() {
        return totalbasic;
    }

    public void setTotalbasic(String totalbasic) {
        this.totalbasic = totalbasic;
    }

    @Basic
    @Column(name = "ACTUALAMOUNT", nullable = true, length = 20)
    public String getActualamount() {
        return actualamount;
    }

    public void setActualamount(String actualamount) {
        this.actualamount = actualamount;
    }

    @Basic
    @Column(name = "PAYMENTTIME", nullable = true)
    public Time getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Time paymenttime) {
        this.paymenttime = paymenttime;
    }

    @Basic
    @Column(name = "IINSTTIUTIONS", nullable = true, length = 20)
    public String getIinsttiutions() {
        return iinsttiutions;
    }

    public void setIinsttiutions(String iinsttiutions) {
        this.iinsttiutions = iinsttiutions;
    }

    @Basic
    @Column(name = "IIINSTATITUTIONS", nullable = true, length = 20)
    public String getIiinstatitutions() {
        return iiinstatitutions;
    }

    public void setIiinstatitutions(String iiinstatitutions) {
        this.iiinstatitutions = iiinstatitutions;
    }

    @Basic
    @Column(name = "PERSON", nullable = true, length = 20)
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salaryscale that = (Salaryscale) o;
        return id == that.id &&
                Objects.equals(paynumber, that.paynumber) &&
                Objects.equals(auditstatus, that.auditstatus) &&
                Objects.equals(registrationtime, that.registrationtime) &&
                Objects.equals(salaryname, that.salaryname) &&
                Objects.equals(paytime, that.paytime) &&
                Objects.equals(totalnumber, that.totalnumber) &&
                Objects.equals(totalbasic, that.totalbasic) &&
                Objects.equals(actualamount, that.actualamount) &&
                Objects.equals(paymenttime, that.paymenttime) &&
                Objects.equals(iinsttiutions, that.iinsttiutions) &&
                Objects.equals(iiinstatitutions, that.iiinstatitutions) &&
                Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paynumber, auditstatus, registrationtime, salaryname, paytime, totalnumber, totalbasic, actualamount, paymenttime, iinsttiutions, iiinstatitutions, person);
    }
}
