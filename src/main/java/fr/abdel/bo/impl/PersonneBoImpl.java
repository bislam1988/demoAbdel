package fr.abdel.bo.impl;

import fr.abdel.bo.PersonneBo;
import fr.abdel.dao.PersonneDao;
import fr.abdel.model.Personne;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by Abdeslem on 16/02/14.
 */
@Stateless
public class PersonneBoImpl implements PersonneBo {

    @EJB
    private PersonneDao personneDao;

    public PersonneDao getPersonneDao() {
        return personneDao;
    }

    public void setPersonneDao(PersonneDao personneDao) {
        this.personneDao = personneDao;
    }

    @Override
    public List<Personne> listerPersonne() {
        return personneDao.listerPersonne();
    }
}
