package fr.abdel.dao.impl;

import fr.abdel.dao.PersonneDao;
import fr.abdel.model.Personne;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abdeslem on 16/02/14.
 */
@Stateless
public class PersonneDaoImpl extends HibernateDaoSupport implements PersonneDao {

    public List<Personne> listerPersonne() throws DataAccessException {
        List<Personne> personnes = new ArrayList<Personne>();
        personnes = getHibernateTemplate().find("fr.abdel.model.Personne");
        return personnes;
    }
}
