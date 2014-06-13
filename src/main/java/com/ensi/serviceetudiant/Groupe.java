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
@Table(name = "GROUPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupe.findAll", query = "SELECT g FROM Groupe g"),
    @NamedQuery(name = "Groupe.findByIdgroupe", query = "SELECT g FROM Groupe g WHERE g.idgroupe = :idgroupe"),
    @NamedQuery(name = "Groupe.findByIdetud1", query = "SELECT g FROM Groupe g WHERE g.idetud1 = :idetud1"),
    @NamedQuery(name = "Groupe.findByIdetud2", query = "SELECT g FROM Groupe g WHERE g.idetud2 = :idetud2"),
    @NamedQuery(name = "Groupe.findByIdetud3", query = "SELECT g FROM Groupe g WHERE g.idetud3 = :idetud3")})
public class Groupe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGROUPE")
    private Integer idgroupe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDETUD1")
    private int idetud1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDETUD2")
    private int idetud2;
    @Column(name = "IDETUD3")
    private Integer idetud3;

    public Groupe() {
    }

    public Groupe(Integer idgroupe) {
        this.idgroupe = idgroupe;
    }

    public Groupe(Integer idgroupe, int idetud1, int idetud2) {
        this.idgroupe = idgroupe;
        this.idetud1 = idetud1;
        this.idetud2 = idetud2;
    }

    public Integer getIdgroupe() {
        return idgroupe;
    }

    public void setIdgroupe(Integer idgroupe) {
        this.idgroupe = idgroupe;
    }

    public int getIdetud1() {
        return idetud1;
    }

    public void setIdetud1(int idetud1) {
        this.idetud1 = idetud1;
    }

    public int getIdetud2() {
        return idetud2;
    }

    public void setIdetud2(int idetud2) {
        this.idetud2 = idetud2;
    }

    public Integer getIdetud3() {
        return idetud3;
    }

    public void setIdetud3(Integer idetud3) {
        this.idetud3 = idetud3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgroupe != null ? idgroupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupe)) {
            return false;
        }
        Groupe other = (Groupe) object;
        if ((this.idgroupe == null && other.idgroupe != null) || (this.idgroupe != null && !this.idgroupe.equals(other.idgroupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensi.serviceetudiant.Groupe[ idgroupe=" + idgroupe + " ]";
    }
    
}
