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
public class SoutenanceStageBackingBean implements Serializable{
    int SoutenanceStageId;

    public int getSoutenanceStageId() {
        return SoutenanceStageId;
    }

    public void setSoutenanceStageId(int SoutenanceStageId) {
        this.SoutenanceStageId = SoutenanceStageId;
    }
}
