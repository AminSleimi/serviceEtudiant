/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ensi.serviceetudiant;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NIMOA
 */
@Entity
@Table(name = "JURY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jury.findAll", query = "SELECT j FROM Jury j"),
    @NamedQuery(name = "Jury.findByIdjury", query = "SELECT j FROM Jury j WHERE j.idjury = :idjury"),
    @NamedQuery(name = "Jury.findByIdpresident", query = "SELECT j FROM Jury j WHERE j.idpresident = :idpresident"),
    @NamedQuery(name = "Jury.findByIdense1", query = "SELECT j FROM Jury j WHERE j.idense1 = :idense1"),
    @NamedQuery(name = "Jury.findByIdense2", query = "SELECT j FROM Jury j WHERE j.idense2 = :idense2")})
public class Jury implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDJURY")
    private Integer idjury;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPRESIDENT")
    private int idpresident;
    @Column(name = "IDENSE1")
    private Integer idense1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDENSE2")
    private int idense2;

    public Jury() {
    }

    public Jury(Integer idjury) {
        this.idjury = idjury;
    }

    public Jury(Integer idjury, int idpresident, int idense2) {
        this.idjury = idjury;
        this.idpresident = idpresident;
        this.idense2 = idense2;
    }

    public Integer getIdjury() {
        return idjury;
    }

    public void setIdjury(Integer idjury) {
        this.idjury = idjury;
    }

    public int getIdpresident() {
        return idpresident;
    }

    public void setIdpresident(int idpresident) {
        this.idpresident = idpresident;
    }

    public Integer getIdense1() {
        return idense1;
    }

    public void setIdense1(Integer idense1) {
        this.idense1 = idense1;
    }

    public int getIdense2() {
        return idense2;
    }

    public void setIdense2(int idense2) {
        this.idense2 = idense2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjury != null ? idjury.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jury)) {
            return false;
        }
        Jury other = (Jury) object;
        if ((this.idjury == null && other.idjury != null) || (this.idjury != null && !this.idjury.equals(other.idjury))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensi.serviceetudiant.Jury[ idjury=" + idjury + " ]";
    }
    
}
