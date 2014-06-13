/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ensi.serviceEtudiant.client;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author NIMOA
 */
@Named
@SessionScoped

public class AffectationStageBackingBean implements Serializable{
    int AffectationStageId;

    public int getAffectationStageId() {
        return AffectationStageId;
    }

    public void setAffectationStageId(int AffectationStageId) {
        this.AffectationStageId = AffectationStageId;
    }
}
