package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Title {
    private long deptid;
    private String titlecoding;
    private String department;
    private String titlename;
    private String titledescription;
    private String note;
    private String disabled;

    @Id
    @Column(name = "DEPTID", nullable = false, precision = 0)
    public long getDeptid() {
        return deptid;
    }

    public void setDeptid(long deptid) {
        this.deptid = deptid;
    }

    @Basic
    @Column(name = "TITLECODING", nullable = true, length = 20)
    public String getTitlecoding() {
        return titlecoding;
    }

    public void setTitlecoding(String titlecoding) {
        this.titlecoding = titlecoding;
    }

    @Basic
    @Column(name = "DEPARTMENT", nullable = true, length = 20)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "TITLENAME", nullable = true, length = 20)
    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    @Basic
    @Column(name = "TITLEDESCRIPTION", nullable = true, length = 20)
    public String getTitledescription() {
        return titledescription;
    }

    public void setTitledescription(String titledescription) {
        this.titledescription = titledescription;
    }

    @Basic
    @Column(name = "NOTE", nullable = true, length = 20)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "DISABLED", nullable = true, length = 20)
    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return deptid == title.deptid &&
                Objects.equals(titlecoding, title.titlecoding) &&
                Objects.equals(department, title.department) &&
                Objects.equals(titlename, title.titlename) &&
                Objects.equals(titledescription, title.titledescription) &&
                Objects.equals(note, title.note) &&
                Objects.equals(disabled, title.disabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptid, titlecoding, department, titlename, titledescription, note, disabled);
    }
}
