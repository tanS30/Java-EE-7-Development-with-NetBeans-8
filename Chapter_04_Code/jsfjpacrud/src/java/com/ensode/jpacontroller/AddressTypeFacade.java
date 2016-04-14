/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ensode.jpacontroller;

import com.ensode.jpa.AddressType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author heffel
 */
@Stateless
public class AddressTypeFacade extends AbstractFacade<AddressType> {
    @PersistenceContext(unitName = "jsfjpacrudPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressTypeFacade() {
        super(AddressType.class);
    }
    
}
