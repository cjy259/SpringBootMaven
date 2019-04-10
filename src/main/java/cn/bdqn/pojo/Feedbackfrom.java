package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Feedbackfrom {
    private long id;
    private String feedback;
    private String summary;
    private String examinationresults;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FEEDBACK", nullable = true, length = 255)
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Basic
    @Column(name = "SUMMARY", nullable = true, length = 255)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "EXAMINATIONRESULTS", nullable = true, length = 255)
    public String getExaminationresults() {
        return examinationresults;
    }

    public void setExaminationresults(String examinationresults) {
        this.examinationresults = examinationresults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedbackfrom that = (Feedbackfrom) o;
        return id == that.id &&
                Objects.equals(feedback, that.feedback) &&
                Objects.equals(summary, that.summary) &&
                Objects.equals(examinationresults, that.examinationresults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, feedback, summary, examinationresults);
    }
}
