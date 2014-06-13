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
@Table(name = "SOUTENANCESTAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Soutenancestage.findAll", query = "SELECT s FROM Soutenancestage s"),
    @NamedQuery(name = "Soutenancestage.findByIdsoutstage", query = "SELECT s FROM Soutenancestage s WHERE s.idsoutstage = :idsoutstage"),
    @NamedQuery(name = "Soutenancestage.findByIdjury", query = "SELECT s FROM Soutenancestage s WHERE s.idjury = :idjury"),
    @NamedQuery(name = "Soutenancestage.findByIdaffecstage", query = "SELECT s FROM Soutenancestage s WHERE s.idaffecstage = :idaffecstage"),
    @NamedQuery(name = "Soutenancestage.findByDatesout", query = "SELECT s FROM Soutenancestage s WHERE s.datesout = :datesout"),
    @NamedQuery(name = "Soutenancestage.findByIdsalle", query = "SELECT s FROM Soutenancestage s WHERE s.idsalle = :idsalle")})
public class Soutenancestage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOUTSTAGE")
    private Integer idsoutstage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDJURY")
    private int idjury;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAFFECSTAGE")
    private int idaffecstage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATESOUT")
    @Temporal(TemporalType.DATE)
    private Date datesout;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSALLE")
    private short idsalle;

    public Soutenancestage() {
    }

    public Soutenancestage(Integer idsoutstage) {
        this.idsoutstage = idsoutstage;
    }

    public Soutenancestage(Integer idsoutstage, int idjury, int idaffecstage, Date datesout, short idsalle) {
        this.idsoutstage = idsoutstage;
        this.idjury = idjury;
        this.idaffecstage = idaffecstage;
        this.datesout = datesout;
        this.idsalle = idsalle;
    }

    public Integer getIdsoutstage() {
        return idsoutstage;
    }

    public void setIdsoutstage(Integer idsoutstage) {
        this.idsoutstage = idsoutstage;
    }

    public int getIdjury() {
        return idjury;
    }

    public void setIdjury(int idjury) {
        this.idjury = idjury;
    }

    public int getIdaffecstage() {
        return idaffecstage;
    }

    public void setIdaffecstage(int idaffecstage) {
        this.idaffecstage = idaffecstage;
    }

    public Date getDatesout() {
        return datesout;
    }

    public void setDatesout(Date datesout) {
        this.datesout = datesout;
    }

    public short getIdsalle() {
        return idsalle;
    }

    public void setIdsalle(short idsalle) {
        this.idsalle = idsalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsoutstage != null ? idsoutstage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soutenancestage)) {
            return false;
        }
        Soutenancestage other = (Soutenancestage) object;
        if ((this.idsoutstage == null && other.idsoutstage != null) || (this.idsoutstage != null && !this.idsoutstage.equals(other.idsoutstage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensi.serviceetudiant.Soutenancestage[ idsoutstage=" + idsoutstage + " ]";
    }
    
}
