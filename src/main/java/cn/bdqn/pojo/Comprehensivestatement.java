package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Comprehensivestatement {
    private long id;
    private String year;
    private Long totalnumber;
    private Long numberdoctorates;
    private Long masterdegree;
    private Long undergraduatepopulation;
    private Long numberspecialists;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "YEAR", nullable = true, length = 50)
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
    @Column(name = "NUMBERDOCTORATES", nullable = true, precision = 0)
    public Long getNumberdoctorates() {
        return numberdoctorates;
    }

    public void setNumberdoctorates(Long numberdoctorates) {
        this.numberdoctorates = numberdoctorates;
    }

    @Basic
    @Column(name = "MASTERDEGREE", nullable = true, precision = 0)
    public Long getMasterdegree() {
        return masterdegree;
    }

    public void setMasterdegree(Long masterdegree) {
        this.masterdegree = masterdegree;
    }

    @Basic
    @Column(name = "UNDERGRADUATEPOPULATION", nullable = true, precision = 0)
    public Long getUndergraduatepopulation() {
        return undergraduatepopulation;
    }

    public void setUndergraduatepopulation(Long undergraduatepopulation) {
        this.undergraduatepopulation = undergraduatepopulation;
    }

    @Basic
    @Column(name = "NUMBERSPECIALISTS", nullable = true, precision = 0)
    public Long getNumberspecialists() {
        return numberspecialists;
    }

    public void setNumberspecialists(Long numberspecialists) {
        this.numberspecialists = numberspecialists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comprehensivestatement that = (Comprehensivestatement) o;
        return id == that.id &&
                Objects.equals(year, that.year) &&
                Objects.equals(totalnumber, that.totalnumber) &&
                Objects.equals(numberdoctorates, that.numberdoctorates) &&
                Objects.equals(masterdegree, that.masterdegree) &&
                Objects.equals(undergraduatepopulation, that.undergraduatepopulation) &&
                Objects.equals(numberspecialists, that.numberspecialists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, totalnumber, numberdoctorates, masterdegree, undergraduatepopulation, numberspecialists);
    }
}
