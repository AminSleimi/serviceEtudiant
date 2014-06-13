/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ensi.serviceetudiant;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NIMOA
 */
@Entity
@Table(name = "SOUTENANCEPCD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Soutenancepcd.findAll", query = "SELECT s FROM Soutenancepcd s"),
    @NamedQuery(name = "Soutenancepcd.findByIdsoutpcd", query = "SELECT s FROM Soutenancepcd s WHERE s.idsoutpcd = :idsoutpcd"),
    @NamedQuery(name = "Soutenancepcd.findByIdjury", query = "SELECT s FROM Soutenancepcd s WHERE s.idjury = :idjury"),
    @NamedQuery(name = "Soutenancepcd.findByIdaffecpcd", query = "SELECT s FROM Soutenancepcd s WHERE s.idaffecpcd = :idaffecpcd"),
    @NamedQuery(name = "Soutenancepcd.findByDatesout", query = "SELECT s FROM Soutenancepcd s WHERE s.datesout = :datesout"),
    @NamedQuery(name = "Soutenancepcd.findByIdsalle", query = "SELECT s FROM Soutenancepcd s WHERE s.idsalle = :idsalle")})
public class Soutenancepcd implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOUTPCD")
    private Integer idsoutpcd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDJURY")
    private int idjury;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAFFECPCD")
    private int idaffecpcd;
    @Column(name = "DATESOUT")
    @Temporal(TemporalType.DATE)
    private Date datesout;
    @Column(name = "IDSALLE")
    private Short idsalle;

    public Soutenancepcd() {
    }

    public Soutenancepcd(Integer idsoutpcd) {
        this.idsoutpcd = idsoutpcd;
    }

    public Soutenancepcd(Integer idsoutpcd, int idjury, int idaffecpcd) {
        this.idsoutpcd = idsoutpcd;
        this.idjury = idjury;
        this.idaffecpcd = idaffecpcd;
    }

    public Integer getIdsoutpcd() {
        return idsoutpcd;
    }

    public void setIdsoutpcd(Integer idsoutpcd) {
        this.idsoutpcd = idsoutpcd;
    }

    public int getIdjury() {
        return idjury;
    }

    public void setIdjury(int idjury) {
        this.idjury = idjury;
    }

    public int getIdaffecpcd() {
        return idaffecpcd;
    }

    public void setIdaffecpcd(int idaffecpcd) {
        this.idaffecpcd = idaffecpcd;
    }

    public Date getDatesout() {
        return datesout;
    }

    public void setDatesout(Date datesout) {
        this.datesout = datesout;
    }

    public Short getIdsalle() {
        return idsalle;
    }

    public void setIdsalle(Short idsalle) {
        this.idsalle = idsalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsoutpcd != null ? idsoutpcd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soutenancepcd)) {
            return false;
        }
        Soutenancepcd other = (Soutenancepcd) object;
        if ((this.idsoutpcd == null && other.idsoutpcd != null) || (this.idsoutpcd != null && !this.idsoutpcd.equals(other.idsoutpcd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensi.serviceetudiant.Soutenancepcd[ idsoutpcd=" + idsoutpcd + " ]";
    }
    
}
