package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Resultregistrationform {
    private long id;
    private String jobcode;
    private String jobtype;
    private String jobname;
    private String sex;
    private String email;
    private String adress;
    private String recruitmenttype;
    private String idcard;
    private String schoolgraduation;
    private String salaryrequest;
    private String telephone;
    private String residence;
    private String politicalstatus;
    private String major;
    private String education;
    private String registrant;
    private Time filingtime;
    private Long workexperience;
    private String incumbency;
    private String freshstudent;
    private Time registrationtime;
    private String aresume;
    private String recommender;
    private Time rectime;
    private String recinterview;
    private String attachedresume;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "JOBCODE", nullable = true, length = 50)
    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode;
    }

    @Basic
    @Column(name = "JOBTYPE", nullable = true, length = 50)
    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    @Basic
    @Column(name = "JOBNAME", nullable = true, length = 50)
    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    @Basic
    @Column(name = "SEX", nullable = true, length = 20)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ADRESS", nullable = true, length = 50)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "RECRUITMENTTYPE", nullable = true, length = 50)
    public String getRecruitmenttype() {
        return recruitmenttype;
    }

    public void setRecruitmenttype(String recruitmenttype) {
        this.recruitmenttype = recruitmenttype;
    }

    @Basic
    @Column(name = "IDCARD", nullable = true, length = 20)
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Basic
    @Column(name = "SCHOOLGRADUATION", nullable = true, length = 50)
    public String getSchoolgraduation() {
        return schoolgraduation;
    }

    public void setSchoolgraduation(String schoolgraduation) {
        this.schoolgraduation = schoolgraduation;
    }

    @Basic
    @Column(name = "SALARYREQUEST", nullable = true, length = 50)
    public String getSalaryrequest() {
        return salaryrequest;
    }

    public void setSalaryrequest(String salaryrequest) {
        this.salaryrequest = salaryrequest;
    }

    @Basic
    @Column(name = "TELEPHONE", nullable = true, length = 20)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "RESIDENCE", nullable = true, length = 50)
    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    @Basic
    @Column(name = "POLITICALSTATUS", nullable = true, length = 50)
    public String getPoliticalstatus() {
        return politicalstatus;
    }

    public void setPoliticalstatus(String politicalstatus) {
        this.politicalstatus = politicalstatus;
    }

    @Basic
    @Column(name = "MAJOR", nullable = true, length = 50)
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
    @Column(name = "REGISTRANT", nullable = true, length = 50)
    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }

    @Basic
    @Column(name = "FILINGTIME", nullable = true)
    public Time getFilingtime() {
        return filingtime;
    }

    public void setFilingtime(Time filingtime) {
        this.filingtime = filingtime;
    }

    @Basic
    @Column(name = "WORKEXPERIENCE", nullable = true, precision = 0)
    public Long getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(Long workexperience) {
        this.workexperience = workexperience;
    }

    @Basic
    @Column(name = "INCUMBENCY", nullable = true, length = 20)
    public String getIncumbency() {
        return incumbency;
    }

    public void setIncumbency(String incumbency) {
        this.incumbency = incumbency;
    }

    @Basic
    @Column(name = "FRESHSTUDENT", nullable = true, length = 20)
    public String getFreshstudent() {
        return freshstudent;
    }

    public void setFreshstudent(String freshstudent) {
        this.freshstudent = freshstudent;
    }

    @Basic
    @Column(name = "REGISTRATIONTIME", nullable = true)
    public Time getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(Time registrationtime) {
        this.registrationtime = registrationtime;
    }

    @Basic
    @Column(name = "ARESUME", nullable = true, length = 50)
    public String getAresume() {
        return aresume;
    }

    public void setAresume(String aresume) {
        this.aresume = aresume;
    }

    @Basic
    @Column(name = "RECOMMENDER", nullable = true, length = 20)
    public String getRecommender() {
        return recommender;
    }

    public void setRecommender(String recommender) {
        this.recommender = recommender;
    }

    @Basic
    @Column(name = "RECTIME", nullable = true)
    public Time getRectime() {
        return rectime;
    }

    public void setRectime(Time rectime) {
        this.rectime = rectime;
    }

    @Basic
    @Column(name = "RECINTERVIEW", nullable = true, length = 50)
    public String getRecinterview() {
        return recinterview;
    }

    public void setRecinterview(String recinterview) {
        this.recinterview = recinterview;
    }

    @Basic
    @Column(name = "ATTACHEDRESUME", nullable = true, length = 50)
    public String getAttachedresume() {
        return attachedresume;
    }

    public void setAttachedresume(String attachedresume) {
        this.attachedresume = attachedresume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resultregistrationform that = (Resultregistrationform) o;
        return id == that.id &&
                Objects.equals(jobcode, that.jobcode) &&
                Objects.equals(jobtype, that.jobtype) &&
                Objects.equals(jobname, that.jobname) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(email, that.email) &&
                Objects.equals(adress, that.adress) &&
                Objects.equals(recruitmenttype, that.recruitmenttype) &&
                Objects.equals(idcard, that.idcard) &&
                Objects.equals(schoolgraduation, that.schoolgraduation) &&
                Objects.equals(salaryrequest, that.salaryrequest) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(residence, that.residence) &&
                Objects.equals(politicalstatus, that.politicalstatus) &&
                Objects.equals(major, that.major) &&
                Objects.equals(education, that.education) &&
                Objects.equals(registrant, that.registrant) &&
                Objects.equals(filingtime, that.filingtime) &&
                Objects.equals(workexperience, that.workexperience) &&
                Objects.equals(incumbency, that.incumbency) &&
                Objects.equals(freshstudent, that.freshstudent) &&
                Objects.equals(registrationtime, that.registrationtime) &&
                Objects.equals(aresume, that.aresume) &&
                Objects.equals(recommender, that.recommender) &&
                Objects.equals(rectime, that.rectime) &&
                Objects.equals(recinterview, that.recinterview) &&
                Objects.equals(attachedresume, that.attachedresume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobcode, jobtype, jobname, sex, email, adress, recruitmenttype, idcard, schoolgraduation, salaryrequest, telephone, residence, politicalstatus, major, education, registrant, filingtime, workexperience, incumbency, freshstudent, registrationtime, aresume, recommender, rectime, recinterview, attachedresume);
    }
}
