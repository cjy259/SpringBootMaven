package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Employmentform {
    private long id;
    private String name;
    private String position;
    private Long handson;
    private String resumestatus;
    private Time dateregistration;
    private String education;
    private String major;
    private String jobapplication;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "POSITION", nullable = true, length = 50)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "HANDSON", nullable = true, precision = 0)
    public Long getHandson() {
        return handson;
    }

    public void setHandson(Long handson) {
        this.handson = handson;
    }

    @Basic
    @Column(name = "RESUMESTATUS", nullable = true, length = 50)
    public String getResumestatus() {
        return resumestatus;
    }

    public void setResumestatus(String resumestatus) {
        this.resumestatus = resumestatus;
    }

    @Basic
    @Column(name = "DATEREGISTRATION", nullable = true)
    public Time getDateregistration() {
        return dateregistration;
    }

    public void setDateregistration(Time dateregistration) {
        this.dateregistration = dateregistration;
    }

    @Basic
    @Column(name = "EDUCATION", nullable = true, length = 50)
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "MAJOR", nullable = true, length = 20)
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "JOBAPPLICATION", nullable = true, length = 20)
    public String getJobapplication() {
        return jobapplication;
    }

    public void setJobapplication(String jobapplication) {
        this.jobapplication = jobapplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employmentform that = (Employmentform) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(position, that.position) &&
                Objects.equals(handson, that.handson) &&
                Objects.equals(resumestatus, that.resumestatus) &&
                Objects.equals(dateregistration, that.dateregistration) &&
                Objects.equals(education, that.education) &&
                Objects.equals(major, that.major) &&
                Objects.equals(jobapplication, that.jobapplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, position, handson, resumestatus, dateregistration, education, major, jobapplication);
    }
}
