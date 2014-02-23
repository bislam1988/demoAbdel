package fr.abdel.bo;

import fr.abdel.model.Personne;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Abdeslem on 16/02/14.
 */
@Local
public interface PersonneBo {

    List<Personne> listerPersonne();
}
