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
@Table(name = "PROPOSITIONSTAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propositionstage.findAll", query = "SELECT p FROM Propositionstage p"),
    @NamedQuery(name = "Propositionstage.findByIdpropstage", query = "SELECT p FROM Propositionstage p WHERE p.idpropstage = :idpropstage"),
    @NamedQuery(name = "Propositionstage.findByIntitulepropostage", query = "SELECT p FROM Propositionstage p WHERE p.intitulepropostage = :intitulepropostage"),
    @NamedQuery(name = "Propositionstage.findByDescriptionpropostage", query = "SELECT p FROM Propositionstage p WHERE p.descriptionpropostage = :descriptionpropostage"),
    @NamedQuery(name = "Propositionstage.findByEncadrantpropostage", query = "SELECT p FROM Propositionstage p WHERE p.encadrantpropostage = :encadrantpropostage"),
    @NamedQuery(name = "Propositionstage.findByMotcl\u00e9propostage", query = "SELECT p FROM Propositionstage p WHERE p.motcl\u00e9propostage = :motcl\u00e9propostage")})
public class Propositionstage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPROPSTAGE")
    private Integer idpropstage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "INTITULEPROPOSTAGE")
    private String intitulepropostage;
    @Size(max = 255)
    @Column(name = "DESCRIPTIONPROPOSTAGE")
    private String descriptionpropostage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENCADRANTPROPOSTAGE")
    private int encadrantpropostage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MOTCL\u00c9PROPOSTAGE")
    private String motclépropostage;

    public Propositionstage() {
    }

    public Propositionstage(Integer idpropstage) {
        this.idpropstage = idpropstage;
    }

    public Propositionstage(Integer idpropstage, String intitulepropostage, int encadrantpropostage, String motclépropostage) {
        this.idpropstage = idpropstage;
        this.intitulepropostage = intitulepropostage;
        this.encadrantpropostage = encadrantpropostage;
        this.motclépropostage = motclépropostage;
    }

    public Integer getIdpropstage() {
        return idpropstage;
    }

    public void setIdpropstage(Integer idpropstage) {
        this.idpropstage = idpropstage;
    }

    public String getIntitulepropostage() {
        return intitulepropostage;
    }

    public void setIntitulepropostage(String intitulepropostage) {
        this.intitulepropostage = intitulepropostage;
    }

    public String getDescriptionpropostage() {
        return descriptionpropostage;
    }

    public void setDescriptionpropostage(String descriptionpropostage) {
        this.descriptionpropostage = descriptionpropostage;
    }

    public int getEncadrantpropostage() {
        return encadrantpropostage;
    }

    public void setEncadrantpropostage(int encadrantpropostage) {
        this.encadrantpropostage = encadrantpropostage;
    }

    public String getMotclépropostage() {
        return motclépropostage;
    }

    public void setMotclépropostage(String motclépropostage) {
        this.motclépropostage = motclépropostage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpropstage != null ? idpropstage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propositionstage)) {
            return false;
        }
        Propositionstage other = (Propositionstage) object;
        if ((this.idpropstage == null && other.idpropstage != null) || (this.idpropstage != null && !this.idpropstage.equals(other.idpropstage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensi.serviceetudiant.Propositionstage[ idpropstage=" + idpropstage + " ]";
    }
    
}
