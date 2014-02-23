package fr.abdel.bean;

import fr.abdel.bo.PersonneBo;
import fr.abdel.model.Personne;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Abdeslem on 16/02/14.
 */
@Stateless
public class PersonneBean implements Serializable {

    @EJB
    private PersonneBo personneBo;

    public Long id;
    public String email;
    public String nom;
    public String prenom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public PersonneBo getPersonneBo() {
        return personneBo;
    }

    public void setPersonneBo(PersonneBo personneBo) {
        this.personneBo = personneBo;
    }

    public List<Personne> listerPersonne() {
        return personneBo.listerPersonne();
    }
}
