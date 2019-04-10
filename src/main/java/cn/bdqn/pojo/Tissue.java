package cn.bdqn.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tissue {
    private long id;
    private String tissueshort;
    private String tissuename;
    private String organisation;
    private String address;
    private String synopsis;
    private String note;
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
    @Column(name = "TISSUESHORT", nullable = true, length = 20)
    public String getTissueshort() {
        return tissueshort;
    }

    public void setTissueshort(String tissueshort) {
        this.tissueshort = tissueshort;
    }

    @Basic
    @Column(name = "TISSUENAME", nullable = true, length = 20)
    public String getTissuename() {
        return tissuename;
    }

    public void setTissuename(String tissuename) {
        this.tissuename = tissuename;
    }

    @Basic
    @Column(name = "ORGANISATION", nullable = true, length = 20)
    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 20)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "SYNOPSIS", nullable = true, length = 50)
    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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
        Tissue tissue = (Tissue) o;
        return id == tissue.id &&
                Objects.equals(tissueshort, tissue.tissueshort) &&
                Objects.equals(tissuename, tissue.tissuename) &&
                Objects.equals(organisation, tissue.organisation) &&
                Objects.equals(address, tissue.address) &&
                Objects.equals(synopsis, tissue.synopsis) &&
                Objects.equals(note, tissue.note) &&
                Objects.equals(disabled, tissue.disabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tissueshort, tissuename, organisation, address, synopsis, note, disabled);
    }
}
