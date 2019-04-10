package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Bonus {
    private String ename;
    private String job;
    private Long sal;
    private Long comm;

    @Basic
    @Column(name = "ENAME", nullable = true, length = 10)
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "JOB", nullable = true, length = 9)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "SAL", nullable = true, precision = 0)
    public Long getSal() {
        return sal;
    }

    public void setSal(Long sal) {
        this.sal = sal;
    }

    @Basic
    @Column(name = "COMM", nullable = true, precision = 0)
    public Long getComm() {
        return comm;
    }

    public void setComm(Long comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bonus bonus = (Bonus) o;
        return Objects.equals(ename, bonus.ename) &&
                Objects.equals(job, bonus.job) &&
                Objects.equals(sal, bonus.sal) &&
                Objects.equals(comm, bonus.comm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ename, job, sal, comm);
    }
}
