/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ensi.serviceEtudiant.client;

import com.ensi.serviceetudiant.Soutenancestage;
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
public class SoutenanceStageClientBean {
    Client client;
    WebTarget target;

    @PostConstruct
    public void init() {
        client = ClientBuilder.newClient();
        target = client.target("http://localhost:8080/serviceEtudiant/webresources/soutenancestage/");
    }

    @PreDestroy
    public void destroy() {
        client.close();
    }

    public Soutenancestage[] getSoutenancestage() {
        return target.request().get(Soutenancestage[].class);
    }
}
