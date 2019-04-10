package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Trainingmanagement {
    private long id;
    private String trainingname;
    private String purpose;
    private Long trainees;
    private String brief;
    private String materials;
    private Time startingtime;
    private Time closetime;
    private String feedback;
    private String auditstatus;
    private String uploadattachments;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TRAININGNAME", nullable = true, length = 50)
    public String getTrainingname() {
        return trainingname;
    }

    public void setTrainingname(String trainingname) {
        this.trainingname = trainingname;
    }

    @Basic
    @Column(name = "PURPOSE", nullable = true, length = 20)
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "TRAINEES", nullable = true, precision = 0)
    public Long getTrainees() {
        return trainees;
    }

    public void setTrainees(Long trainees) {
        this.trainees = trainees;
    }

    @Basic
    @Column(name = "BRIEF", nullable = true, length = 255)
    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Basic
    @Column(name = "MATERIALS", nullable = true, length = 255)
    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    @Basic
    @Column(name = "STARTINGTIME", nullable = true)
    public Time getStartingtime() {
        return startingtime;
    }

    public void setStartingtime(Time startingtime) {
        this.startingtime = startingtime;
    }

    @Basic
    @Column(name = "CLOSETIME", nullable = true)
    public Time getClosetime() {
        return closetime;
    }

    public void setClosetime(Time closetime) {
        this.closetime = closetime;
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
    @Column(name = "AUDITSTATUS", nullable = true, length = 20)
    public String getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
    }

    @Basic
    @Column(name = "UPLOADATTACHMENTS", nullable = true, length = 50)
    public String getUploadattachments() {
        return uploadattachments;
    }

    public void setUploadattachments(String uploadattachments) {
        this.uploadattachments = uploadattachments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainingmanagement that = (Trainingmanagement) o;
        return id == that.id &&
                Objects.equals(trainingname, that.trainingname) &&
                Objects.equals(purpose, that.purpose) &&
                Objects.equals(trainees, that.trainees) &&
                Objects.equals(brief, that.brief) &&
                Objects.equals(materials, that.materials) &&
                Objects.equals(startingtime, that.startingtime) &&
                Objects.equals(closetime, that.closetime) &&
                Objects.equals(feedback, that.feedback) &&
                Objects.equals(auditstatus, that.auditstatus) &&
                Objects.equals(uploadattachments, that.uploadattachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trainingname, purpose, trainees, brief, materials, startingtime, closetime, feedback, auditstatus, uploadattachments);
    }
}
