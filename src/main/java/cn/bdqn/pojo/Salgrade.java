package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Salgrade {
    private Long grade;
    private Long losal;
    private Long hisal;

    @Basic
    @Column(name = "GRADE", nullable = true, precision = 0)
    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "LOSAL", nullable = true, precision = 0)
    public Long getLosal() {
        return losal;
    }

    public void setLosal(Long losal) {
        this.losal = losal;
    }

    @Basic
    @Column(name = "HISAL", nullable = true, precision = 0)
    public Long getHisal() {
        return hisal;
    }

    public void setHisal(Long hisal) {
        this.hisal = hisal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salgrade salgrade = (Salgrade) o;
        return Objects.equals(grade, salgrade.grade) &&
                Objects.equals(losal, salgrade.losal) &&
                Objects.equals(hisal, salgrade.hisal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, losal, hisal);
    }
}
