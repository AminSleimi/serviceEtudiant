/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ensi.serviceEtudiant.client;

import com.ensi.serviceetudiant.Affectationstage;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 *
 * @author NIMOA
 */
@Named
@RequestScoped
public class AffectationStageClientBean {
    Client client;
    WebTarget target;

    @PostConstruct
    public void init() {
        client = ClientBuilder.newClient();
        target = client.target("http://localhost:8080/serviceEtudiant/webresources/affectationstage/");
    }

    @PreDestroy
    public void destroy() {
        client.close();
    }

    public Affectationstage[] getAffectationstage() {
        return target.request().get(Affectationstage[].class);
    }
}
