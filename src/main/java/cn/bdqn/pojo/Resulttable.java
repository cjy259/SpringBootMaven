package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Resulttable {
    private long mid;
    private String presumestatus;
    private String oneinterviewer;
    private Time onetime;
    private String oneevaluation;
    private String twointerviewer;
    private Time twotime;
    private String twoevaluation;
    private String threeinterviewer;
    private Time threetime;
    private String threeevaluation;

    @Id
    @Column(name = "MID", nullable = false, precision = 0)
    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "PRESUMESTATUS", nullable = true, length = 20)
    public String getPresumestatus() {
        return presumestatus;
    }

    public void setPresumestatus(String presumestatus) {
        this.presumestatus = presumestatus;
    }

    @Basic
    @Column(name = "ONEINTERVIEWER", nullable = true, length = 20)
    public String getOneinterviewer() {
        return oneinterviewer;
    }

    public void setOneinterviewer(String oneinterviewer) {
        this.oneinterviewer = oneinterviewer;
    }

    @Basic
    @Column(name = "ONETIME", nullable = true)
    public Time getOnetime() {
        return onetime;
    }

    public void setOnetime(Time onetime) {
        this.onetime = onetime;
    }

    @Basic
    @Column(name = "ONEEVALUATION", nullable = true, length = 20)
    public String getOneevaluation() {
        return oneevaluation;
    }

    public void setOneevaluation(String oneevaluation) {
        this.oneevaluation = oneevaluation;
    }

    @Basic
    @Column(name = "TWOINTERVIEWER", nullable = true, length = 20)
    public String getTwointerviewer() {
        return twointerviewer;
    }

    public void setTwointerviewer(String twointerviewer) {
        this.twointerviewer = twointerviewer;
    }

    @Basic
    @Column(name = "TWOTIME", nullable = true)
    public Time getTwotime() {
        return twotime;
    }

    public void setTwotime(Time twotime) {
        this.twotime = twotime;
    }

    @Basic
    @Column(name = "TWOEVALUATION", nullable = true, length = 20)
    public String getTwoevaluation() {
        return twoevaluation;
    }

    public void setTwoevaluation(String twoevaluation) {
        this.twoevaluation = twoevaluation;
    }

    @Basic
    @Column(name = "THREEINTERVIEWER", nullable = true, length = 20)
    public String getThreeinterviewer() {
        return threeinterviewer;
    }

    public void setThreeinterviewer(String threeinterviewer) {
        this.threeinterviewer = threeinterviewer;
    }

    @Basic
    @Column(name = "THREETIME", nullable = true)
    public Time getThreetime() {
        return threetime;
    }

    public void setThreetime(Time threetime) {
        this.threetime = threetime;
    }

    @Basic
    @Column(name = "THREEEVALUATION", nullable = true, length = 20)
    public String getThreeevaluation() {
        return threeevaluation;
    }

    public void setThreeevaluation(String threeevaluation) {
        this.threeevaluation = threeevaluation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resulttable that = (Resulttable) o;
        return mid == that.mid &&
                Objects.equals(presumestatus, that.presumestatus) &&
                Objects.equals(oneinterviewer, that.oneinterviewer) &&
                Objects.equals(onetime, that.onetime) &&
                Objects.equals(oneevaluation, that.oneevaluation) &&
                Objects.equals(twointerviewer, that.twointerviewer) &&
                Objects.equals(twotime, that.twotime) &&
                Objects.equals(twoevaluation, that.twoevaluation) &&
                Objects.equals(threeinterviewer, that.threeinterviewer) &&
                Objects.equals(threetime, that.threetime) &&
                Objects.equals(threeevaluation, that.threeevaluation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mid, presumestatus, oneinterviewer, onetime, oneevaluation, twointerviewer, twotime, twoevaluation, threeinterviewer, threetime, threeevaluation);
    }
}
