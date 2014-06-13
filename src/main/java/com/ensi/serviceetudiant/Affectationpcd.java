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
@Table(name = "AFFECTATIONPCD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Affectationpcd.findAll", query = "SELECT a FROM Affectationpcd a"),
    @NamedQuery(name = "Affectationpcd.findByIdaffectation", query = "SELECT a FROM Affectationpcd a WHERE a.idaffectation = :idaffectation"),
    @NamedQuery(name = "Affectationpcd.findByIdgroupe", query = "SELECT a FROM Affectationpcd a WHERE a.idgroupe = :idgroupe"),
    @NamedQuery(name = "Affectationpcd.findByIdpcd", query = "SELECT a FROM Affectationpcd a WHERE a.idpcd = :idpcd")})
public class Affectationpcd implements Serializable {
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
    @Column(name = "IDPCD")
    private int idpcd;

    public Affectationpcd() {
    }

    public Affectationpcd(Integer idaffectation) {
        this.idaffectation = idaffectation;
    }

    public Affectationpcd(Integer idaffectation, int idgroupe, int idpcd) {
        this.idaffectation = idaffectation;
        this.idgroupe = idgroupe;
        this.idpcd = idpcd;
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

    public int getIdpcd() {
        return idpcd;
    }

    public void setIdpcd(int idpcd) {
        this.idpcd = idpcd;
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
        if (!(object instanceof Affectationpcd)) {
            return false;
        }
        Affectationpcd other = (Affectationpcd) object;
        if ((this.idaffectation == null && other.idaffectation != null) || (this.idaffectation != null && !this.idaffectation.equals(other.idaffectation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensi.serviceetudiant.Affectationpcd[ idaffectation=" + idaffectation + " ]";
    }
    
}
