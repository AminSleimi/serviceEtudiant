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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NIMOA
 */
@Entity
@Table(name = "ETUDIANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etudiant.findAll", query = "SELECT e FROM Etudiant e"),
    @NamedQuery(name = "Etudiant.findByIdinscri", query = "SELECT e FROM Etudiant e WHERE e.idinscri = :idinscri"),
    @NamedQuery(name = "Etudiant.findByNom", query = "SELECT e FROM Etudiant e WHERE e.nom = :nom"),
    @NamedQuery(name = "Etudiant.findByRang", query = "SELECT e FROM Etudiant e WHERE e.rang = :rang"),
    @NamedQuery(name = "Etudiant.findByNiveau", query = "SELECT e FROM Etudiant e WHERE e.niveau = :niveau")})
public class Etudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDINSCRI")
    private Integer idinscri;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOM")
    private String nom;
    @Column(name = "RANG")
    private Short rang;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NIVEAU")
    private short niveau;

    public Etudiant() {
    }

    public Etudiant(Integer idinscri) {
        this.idinscri = idinscri;
    }

    public Etudiant(Integer idinscri, String nom, short niveau) {
        this.idinscri = idinscri;
        this.nom = nom;
        this.niveau = niveau;
    }

    public Integer getIdinscri() {
        return idinscri;
    }

    public void setIdinscri(Integer idinscri) {
        this.idinscri = idinscri;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Short getRang() {
        return rang;
    }

    public void setRang(Short rang) {
        this.rang = rang;
    }

    public short getNiveau() {
        return niveau;
    }

    public void setNiveau(short niveau) {
        this.niveau = niveau;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinscri != null ? idinscri.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.idinscri == null && other.idinscri != null) || (this.idinscri != null && !this.idinscri.equals(other.idinscri))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensi.serviceetudiant.Etudiant[ idinscri=" + idinscri + " ]";
    }
    
}
