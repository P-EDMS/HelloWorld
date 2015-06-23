package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "DUCK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Duck.findAll", query = "SELECT d FROM Duck d"),
    @NamedQuery(name = "Duck.findByDid", query = "SELECT d FROM Duck d WHERE d.did = :did"),
    @NamedQuery(name = "Duck.findByDname", query = "SELECT d FROM Duck d WHERE d.dname = :dname"),
    @NamedQuery(name = "Duck.findByDdob", query = "SELECT d FROM Duck d WHERE d.ddob = :ddob"),
    @NamedQuery(name = "Duck.findByDcolour", query = "SELECT d FROM Duck d WHERE d.dcolour = :dcolour"),
    @NamedQuery(name = "Duck.findByDweight", query = "SELECT d FROM Duck d WHERE d.dweight = :dweight"),
    @NamedQuery(name = "Duck.findByDmale", query = "SELECT d FROM Duck d WHERE d.dmale = :dmale")})
public class Duck implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DID")
    private Integer did;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DNAME")
    private String dname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DDOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ddob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DCOLOUR")
    private String dcolour;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DWEIGHT", precision = 5, scale = 2)
    private BigDecimal dweight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DMALE")
    private boolean dmale;

    public Duck() {
    }

    public Duck(Integer did) {
        this.did = did;
    }

    public Duck(Integer did, String dname, Date ddob, String dcolour, BigDecimal dweight, boolean dmale) {
        this.did = did;
        this.dname = dname;
        this.ddob = ddob;
        this.dcolour = dcolour;
        this.dweight = dweight;
        this.dmale = dmale;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getDdob() {
        return ddob;
    }

    public void setDdob(Date ddob) {
        this.ddob = ddob;
    }

    public String getDcolour() {
        return dcolour;
    }

    public void setDcolour(String dcolour) {
        this.dcolour = dcolour;
    }

    public BigDecimal getDweight() {
        return dweight;
    }

    public void setDweight(BigDecimal dweight) {
        this.dweight = dweight;
    }

    public boolean isDmale() {
        return dmale;
    }

    public void setDmale(boolean dmale) {
        this.dmale = dmale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (did != null ? did.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Duck)) {
            return false;
        }
        Duck other = (Duck) object;
        if ((this.did == null && other.did != null) || (this.did != null && !this.did.equals(other.did))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Duck[ did=" + did + " ]";
    }    
}