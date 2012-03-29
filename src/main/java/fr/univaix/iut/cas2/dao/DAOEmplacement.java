package fr.univaix.iut.cas2.dao;

import java.util.List;

import fr.univaix.iut.cas2.beans.Emplacement;
import fr.univaix.iut.cas2.beans.EmplacementId;
import fr.univaix.iut.cas2.beans.Modele;

public interface DAOEmplacement extends DAO<Emplacement, EmplacementId> {

    public List<Emplacement> findByModel(Modele model, boolean isResident);
    
}
