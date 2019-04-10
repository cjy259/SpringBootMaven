package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Personalfile {
    private long id;
    private Long filecoding;
    private Long deptid;
    private String positionid;
    private String name;
    private String email;
    private String address;
    private String idcard;
    private String graduateschool;
    private String salarystandard;
    private Long sociasecurity;
    private String filestatus;
    private String jobcode;
    private String sex;
    private Long phone;
    private String household;
    private String politicsstatus;
    private String major;
    private String education;
    private String openingbank;
    private String bankcard;
    private String registrar;
    private Time filingdate;
    private String resume;
    private String familytiles;
    private String note;
    private String resumes;
    private String auditstatus;
    private String isdelete;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FILECODING", nullable = true, precision = 0)
    public Long getFilecoding() {
        return filecoding;
    }

    public void setFilecoding(Long filecoding) {
        this.filecoding = filecoding;
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
    @Column(name = "POSITIONID", nullable = true, length = 20)
    public String getPositionid() {
        return positionid;
    }

    public void setPositionid(String positionid) {
        this.positionid = positionid;
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
    @Column(name = "EMAIL", nullable = true, length = 20)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 30)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "IDCARD", nullable = true, length = 18)
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Basic
    @Column(name = "GRADUATESCHOOL", nullable = true, length = 20)
    public String getGraduateschool() {
        return graduateschool;
    }

    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool;
    }

    @Basic
    @Column(name = "SALARYSTANDARD", nullable = true, length = 20)
    public String getSalarystandard() {
        return salarystandard;
    }

    public void setSalarystandard(String salarystandard) {
        this.salarystandard = salarystandard;
    }

    @Basic
    @Column(name = "SOCIASECURITY", nullable = true, precision = 0)
    public Long getSociasecurity() {
        return sociasecurity;
    }

    public void setSociasecurity(Long sociasecurity) {
        this.sociasecurity = sociasecurity;
    }

    @Basic
    @Column(name = "FILESTATUS", nullable = true, length = 20)
    public String getFilestatus() {
        return filestatus;
    }

    public void setFilestatus(String filestatus) {
        this.filestatus = filestatus;
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
    @Column(name = "SEX", nullable = true, length = 5)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, precision = 0)
    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "HOUSEHOLD", nullable = true, length = 20)
    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    @Basic
    @Column(name = "POLITICSSTATUS", nullable = true, length = 20)
    public String getPoliticsstatus() {
        return politicsstatus;
    }

    public void setPoliticsstatus(String politicsstatus) {
        this.politicsstatus = politicsstatus;
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
    @Column(name = "EDUCATION", nullable = true, length = 20)
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "OPENINGBANK", nullable = true, length = 20)
    public String getOpeningbank() {
        return openingbank;
    }

    public void setOpeningbank(String openingbank) {
        this.openingbank = openingbank;
    }

    @Basic
    @Column(name = "BANKCARD", nullable = true, length = 20)
    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    @Basic
    @Column(name = "REGISTRAR", nullable = true, length = 20)
    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    @Basic
    @Column(name = "FILINGDATE", nullable = true)
    public Time getFilingdate() {
        return filingdate;
    }

    public void setFilingdate(Time filingdate) {
        this.filingdate = filingdate;
    }

    @Basic
    @Column(name = "RESUME", nullable = true, length = 50)
    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Basic
    @Column(name = "FAMILYTILES", nullable = true, length = 30)
    public String getFamilytiles() {
        return familytiles;
    }

    public void setFamilytiles(String familytiles) {
        this.familytiles = familytiles;
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
    @Column(name = "RESUMES", nullable = true, length = 20)
    public String getResumes() {
        return resumes;
    }

    public void setResumes(String resumes) {
        this.resumes = resumes;
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
    @Column(name = "ISDELETE", nullable = true, length = 20)
    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personalfile that = (Personalfile) o;
        return id == that.id &&
                Objects.equals(filecoding, that.filecoding) &&
                Objects.equals(deptid, that.deptid) &&
                Objects.equals(positionid, that.positionid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(address, that.address) &&
                Objects.equals(idcard, that.idcard) &&
                Objects.equals(graduateschool, that.graduateschool) &&
                Objects.equals(salarystandard, that.salarystandard) &&
                Objects.equals(sociasecurity, that.sociasecurity) &&
                Objects.equals(filestatus, that.filestatus) &&
                Objects.equals(jobcode, that.jobcode) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(household, that.household) &&
                Objects.equals(politicsstatus, that.politicsstatus) &&
                Objects.equals(major, that.major) &&
                Objects.equals(education, that.education) &&
                Objects.equals(openingbank, that.openingbank) &&
                Objects.equals(bankcard, that.bankcard) &&
                Objects.equals(registrar, that.registrar) &&
                Objects.equals(filingdate, that.filingdate) &&
                Objects.equals(resume, that.resume) &&
                Objects.equals(familytiles, that.familytiles) &&
                Objects.equals(note, that.note) &&
                Objects.equals(resumes, that.resumes) &&
                Objects.equals(auditstatus, that.auditstatus) &&
                Objects.equals(isdelete, that.isdelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, filecoding, deptid, positionid, name, email, address, idcard, graduateschool, salarystandard, sociasecurity, filestatus, jobcode, sex, phone, household, politicsstatus, major, education, openingbank, bankcard, registrar, filingdate, resume, familytiles, note, resumes, auditstatus, isdelete);
    }
}
