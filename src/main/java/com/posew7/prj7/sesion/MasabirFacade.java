package com.posew7.prj7.sesion;

import com.posew7.prj7.entity.Masabir;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MasabirFacade extends AbstractFacade<Masabir> {

    @PersistenceContext(unitName = "com.posew7_prj7_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MasabirFacade() {
        super(Masabir.class);
    }

}
