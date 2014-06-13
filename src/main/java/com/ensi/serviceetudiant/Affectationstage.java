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
@Table(name = "AFFECTATIONSTAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Affectationstage.findAll", query = "SELECT a FROM Affectationstage a"),
    @NamedQuery(name = "Affectationstage.findByIdaffectation", query = "SELECT a FROM Affectationstage a WHERE a.idaffectation = :idaffectation"),
    @NamedQuery(name = "Affectationstage.findByIdgroupe", query = "SELECT a FROM Affectationstage a WHERE a.idgroupe = :idgroupe"),
    @NamedQuery(name = "Affectationstage.findByIdstage", query = "SELECT a FROM Affectationstage a WHERE a.idstage = :idstage")})
public class Affectationstage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAFFECTATION")
    private Integer idaffectation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGROUPE")
    private int idgroupe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSTAGE")
    private int idstage;

    public Affectationstage() {
    }

    public Affectationstage(Integer idaffectation) {
        this.idaffectation = idaffectation;
    }

    public Affectationstage(Integer idaffectation, int idgroupe, int idstage) {
        this.idaffectation = idaffectation;
        this.idgroupe = idgroupe;
        this.idstage = idstage;
    }

    public Integer getIdaffectation() {
        return idaffectation;
    }

    public void setIdaffectation(Integer idaffectation) {
        this.idaffectation = idaffectation;
    }

    public int getIdgroupe() {
        return idgroupe;
    }

    public void setIdgroupe(int idgroupe) {
        this.idgroupe = idgroupe;
    }

    public int getIdstage() {
        return idstage;
    }

    public void setIdstage(int idstage) {
        this.idstage = idstage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaffectation != null ? idaffectation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Affectationstage)) {
            return false;
        }
        Affectationstage other = (Affectationstage) object;
        if ((this.idaffectation == null && other.idaffectation != null) || (this.idaffectation != null && !this.idaffectation.equals(other.idaffectation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensi.serviceetudiant.Affectationstage[ idaffectation=" + idaffectation + " ]";
    }
    
}
