package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Question {
    private long id;
    private String papertitle;
    private String testingtypes;
    private Long deptid;
    private String itemlevel;
    private String peopledraw;
    private Time drawdate;
    private String examcontent;
    private String note;
    private String tryattachment;
    private String disabeld;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PAPERTITLE", nullable = true, length = 20)
    public String getPapertitle() {
        return papertitle;
    }

    public void setPapertitle(String papertitle) {
        this.papertitle = papertitle;
    }

    @Basic
    @Column(name = "TESTINGTYPES", nullable = true, length = 20)
    public String getTestingtypes() {
        return testingtypes;
    }

    public void setTestingtypes(String testingtypes) {
        this.testingtypes = testingtypes;
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
    @Column(name = "ITEMLEVEL", nullable = true, length = 20)
    public String getItemlevel() {
        return itemlevel;
    }

    public void setItemlevel(String itemlevel) {
        this.itemlevel = itemlevel;
    }

    @Basic
    @Column(name = "PEOPLEDRAW", nullable = true, length = 20)
    public String getPeopledraw() {
        return peopledraw;
    }

    public void setPeopledraw(String peopledraw) {
        this.peopledraw = peopledraw;
    }

    @Basic
    @Column(name = "DRAWDATE", nullable = true)
    public Time getDrawdate() {
        return drawdate;
    }

    public void setDrawdate(Time drawdate) {
        this.drawdate = drawdate;
    }

    @Basic
    @Column(name = "EXAMCONTENT", nullable = true, length = 20)
    public String getExamcontent() {
        return examcontent;
    }

    public void setExamcontent(String examcontent) {
        this.examcontent = examcontent;
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
    @Column(name = "TRYATTACHMENT", nullable = true, length = 20)
    public String getTryattachment() {
        return tryattachment;
    }

    public void setTryattachment(String tryattachment) {
        this.tryattachment = tryattachment;
    }

    @Basic
    @Column(name = "DISABELD", nullable = true, length = 20)
    public String getDisabeld() {
        return disabeld;
    }

    public void setDisabeld(String disabeld) {
        this.disabeld = disabeld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return id == question.id &&
                Objects.equals(papertitle, question.papertitle) &&
                Objects.equals(testingtypes, question.testingtypes) &&
                Objects.equals(deptid, question.deptid) &&
                Objects.equals(itemlevel, question.itemlevel) &&
                Objects.equals(peopledraw, question.peopledraw) &&
                Objects.equals(drawdate, question.drawdate) &&
                Objects.equals(examcontent, question.examcontent) &&
                Objects.equals(note, question.note) &&
                Objects.equals(tryattachment, question.tryattachment) &&
                Objects.equals(disabeld, question.disabeld);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, papertitle, testingtypes, deptid, itemlevel, peopledraw, drawdate, examcontent, note, tryattachment, disabeld);
    }
}
