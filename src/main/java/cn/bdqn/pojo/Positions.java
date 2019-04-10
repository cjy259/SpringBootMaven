package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Positions {
    private long id;
    private String jobcode;
    private String position;
    private Long deptid;
    private String jobtitle;
    private String jobdescription;
    private String note;
    private String hiring;
    private String jobrequiement;
    private Time recorddate;
    private Time asofdate;
    private String disabled;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "JOBCODE", nullable = true, length = 20)
    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode;
    }

    @Basic
    @Column(name = "POSITION", nullable = true, length = 20)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "DEPTID", nullable = true, precision = 0)
    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    @Basic
    @Column(name = "JOBTITLE", nullable = true, length = 20)
    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    @Basic
    @Column(name = "JOBDESCRIPTION", nullable = true, length = 20)
    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
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
    @Column(name = "HIRING", nullable = true, length = 20)
    public String getHiring() {
        return hiring;
    }

    public void setHiring(String hiring) {
        this.hiring = hiring;
    }

    @Basic
    @Column(name = "JOBREQUIEMENT", nullable = true, length = 20)
    public String getJobrequiement() {
        return jobrequiement;
    }

    public void setJobrequiement(String jobrequiement) {
        this.jobrequiement = jobrequiement;
    }

    @Basic
    @Column(name = "RECORDDATE", nullable = true)
    public Time getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Time recorddate) {
        this.recorddate = recorddate;
    }

    @Basic
    @Column(name = "ASOFDATE", nullable = true)
    public Time getAsofdate() {
        return asofdate;
    }

    public void setAsofdate(Time asofdate) {
        this.asofdate = asofdate;
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
        Positions positions = (Positions) o;
        return id == positions.id &&
                Objects.equals(jobcode, positions.jobcode) &&
                Objects.equals(position, positions.position) &&
                Objects.equals(deptid, positions.deptid) &&
                Objects.equals(jobtitle, positions.jobtitle) &&
                Objects.equals(jobdescription, positions.jobdescription) &&
                Objects.equals(note, positions.note) &&
                Objects.equals(hiring, positions.hiring) &&
                Objects.equals(jobrequiement, positions.jobrequiement) &&
                Objects.equals(recorddate, positions.recorddate) &&
                Objects.equals(asofdate, positions.asofdate) &&
                Objects.equals(disabled, positions.disabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobcode, position, deptid, jobtitle, jobdescription, note, hiring, jobrequiement, recorddate, asofdate, disabled);
    }
}
