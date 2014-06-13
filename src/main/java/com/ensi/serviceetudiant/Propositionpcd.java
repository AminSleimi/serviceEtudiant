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
@Table(name = "PROPOSITIONPCD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propositionpcd.findAll", query = "SELECT p FROM Propositionpcd p"),
    @NamedQuery(name = "Propositionpcd.findByIdpropopcd", query = "SELECT p FROM Propositionpcd p WHERE p.idpropopcd = :idpropopcd"),
    @NamedQuery(name = "Propositionpcd.findByIntitulepropopcd", query = "SELECT p FROM Propositionpcd p WHERE p.intitulepropopcd = :intitulepropopcd"),
    @NamedQuery(name = "Propositionpcd.findByDescriptionpropopcd", query = "SELECT p FROM Propositionpcd p WHERE p.descriptionpropopcd = :descriptionpropopcd"),
    @NamedQuery(name = "Propositionpcd.findByEncadrantpropopcd", query = "SELECT p FROM Propositionpcd p WHERE p.encadrantpropopcd = :encadrantpropopcd"),
    @NamedQuery(name = "Propositionpcd.findByMotclepropopcd", query = "SELECT p FROM Propositionpcd p WHERE p.motclepropopcd = :motclepropopcd")})
public class Propositionpcd implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPROPOPCD")
    private Integer idpropopcd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "INTITULEPROPOPCD")
    private String intitulepropopcd;
    @Size(max = 255)
    @Column(name = "DESCRIPTIONPROPOPCD")
    private String descriptionpropopcd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENCADRANTPROPOPCD")
    private int encadrantpropopcd;
    @Size(max = 50)
    @Column(name = "MOTCLEPROPOPCD")
    private String motclepropopcd;

    public Propositionpcd() {
    }

    public Propositionpcd(Integer idpropopcd) {
        this.idpropopcd = idpropopcd;
    }

    public Propositionpcd(Integer idpropopcd, String intitulepropopcd, int encadrantpropopcd) {
        this.idpropopcd = idpropopcd;
        this.intitulepropopcd = intitulepropopcd;
        this.encadrantpropopcd = encadrantpropopcd;
    }

    public Integer getIdpropopcd() {
        return idpropopcd;
    }

    public void setIdpropopcd(Integer idpropopcd) {
        this.idpropopcd = idpropopcd;
    }

    public String getIntitulepropopcd() {
        return intitulepropopcd;
    }

    public void setIntitulepropopcd(String intitulepropopcd) {
        this.intitulepropopcd = intitulepropopcd;
    }

    public String getDescriptionpropopcd() {
        return descriptionpropopcd;
    }

    public void setDescriptionpropopcd(String descriptionpropopcd) {
        this.descriptionpropopcd = descriptionpropopcd;
    }

    public int getEncadrantpropopcd() {
        return encadrantpropopcd;
    }

    public void setEncadrantpropopcd(int encadrantpropopcd) {
        this.encadrantpropopcd = encadrantpropopcd;
    }

    public String getMotclepropopcd() {
        return motclepropopcd;
    }

    public void setMotclepropopcd(String motclepropopcd) {
        this.motclepropopcd = motclepropopcd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpropopcd != null ? idpropopcd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propositionpcd)) {
            return false;
        }
        Propositionpcd other = (Propositionpcd) object;
        if ((this.idpropopcd == null && other.idpropopcd != null) || (this.idpropopcd != null && !this.idpropopcd.equals(other.idpropopcd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensi.serviceetudiant.Propositionpcd[ idpropopcd=" + idpropopcd + " ]";
    }
    
}
