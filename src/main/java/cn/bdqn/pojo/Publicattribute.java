package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Publicattribute {
    private long id;
    private String code;
    private String name;
    private String describe;
    private Time activetime;
    private Time failuretime;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODE", nullable = true, length = 20)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DESCRIBE", nullable = true, length = 20)
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Basic
    @Column(name = "ACTIVETIME", nullable = true)
    public Time getActivetime() {
        return activetime;
    }

    public void setActivetime(Time activetime) {
        this.activetime = activetime;
    }

    @Basic
    @Column(name = "FAILURETIME", nullable = true)
    public Time getFailuretime() {
        return failuretime;
    }

    public void setFailuretime(Time failuretime) {
        this.failuretime = failuretime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicattribute that = (Publicattribute) o;
        return id == that.id &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(describe, that.describe) &&
                Objects.equals(activetime, that.activetime) &&
                Objects.equals(failuretime, that.failuretime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, describe, activetime, failuretime);
    }
}
