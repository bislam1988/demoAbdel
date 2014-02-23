package fr.abdel.dao;

import fr.abdel.model.Personne;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Abdeslem on 16/02/14.
 */
@Local
public interface PersonneDao {

    List<Personne> listerPersonne();

}
