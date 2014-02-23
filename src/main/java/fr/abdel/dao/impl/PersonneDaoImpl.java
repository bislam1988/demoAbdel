package fr.abdel.dao.impl;

import fr.abdel.dao.PersonneDao;
import fr.abdel.model.Personne;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Abdeslem on 16/02/14.
 */
@Stateless
public class PersonneDaoImpl extends HibernateDaoSupport implements PersonneDao {

    @PersistenceContext
    protected EntityManager em;

    @Override
    public List<Personne> listerPersonne() throws DataAccessException {
        List<Personne> personnes;
        /*
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Personne> criteria = cb.createQuery(Personne.class);
        Root<Personne> personne = criteria.from(Personne.class);
        criteria.select(personne).orderBy(cb.asc(personne.get("nom")));
        personnes = em.createQuery(criteria).getResultList();
        */
        personnes = em.createQuery("from Personne").getResultList();
        return personnes;
    }

}
