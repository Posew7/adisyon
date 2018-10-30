package com.posew7.prj7.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "masabir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Masabir.findAll", query = "SELECT m FROM Masabir m")
    , @NamedQuery(name = "Masabir.findByNo", query = "SELECT m FROM Masabir m WHERE m.no = :no")
    , @NamedQuery(name = "Masabir.findByIsim", query = "SELECT m FROM Masabir m WHERE m.isim = :isim")
    , @NamedQuery(name = "Masabir.findByFiyat", query = "SELECT m FROM Masabir m WHERE m.fiyat = :fiyat")})
public class Masabir implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "no")
    private Integer no;
    @Size(max = 30)
    @Column(name = "isim")
    private String isim;
    @Column(name = "fiyat")
    private Integer fiyat;

    public Masabir() {
    }

    public Masabir(Integer no) {
        this.no = no;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Integer getFiyat() {
        return fiyat;
    }

    public void setFiyat(Integer fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Masabir)) {
            return false;
        }
        Masabir other = (Masabir) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.posew7.prj7.entity.Masabir[ no=" + no + " ]";
    }

}
