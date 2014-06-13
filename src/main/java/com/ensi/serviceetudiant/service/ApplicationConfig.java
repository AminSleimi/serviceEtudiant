/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ensi.serviceetudiant.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author NIMOA
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.ensi.serviceetudiant.service.AffectationpcdFacadeREST.class);
        resources.add(com.ensi.serviceetudiant.service.AffectationstageFacadeREST.class);
        resources.add(com.ensi.serviceetudiant.service.EtudiantFacadeREST.class);
        resources.add(com.ensi.serviceetudiant.service.GroupeFacadeREST.class);
        resources.add(com.ensi.serviceetudiant.service.JuryFacadeREST.class);
        resources.add(com.ensi.serviceetudiant.service.PropositionpcdFacadeREST.class);
        resources.add(com.ensi.serviceetudiant.service.PropositionstageFacadeREST.class);
        resources.add(com.ensi.serviceetudiant.service.SoutenancepcdFacadeREST.class);
        resources.add(com.ensi.serviceetudiant.service.SoutenancestageFacadeREST.class);
    }
    
}
