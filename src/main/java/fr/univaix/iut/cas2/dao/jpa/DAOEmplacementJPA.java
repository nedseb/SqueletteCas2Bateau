package fr.univaix.iut.cas2.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.Emplacement;
import fr.univaix.iut.cas2.beans.EmplacementId;
import fr.univaix.iut.cas2.beans.Modele;
import fr.univaix.iut.cas2.dao.DAOEmplacement;

public class DAOEmplacementJPA extends DAOGeneriqueJPA<Emplacement, EmplacementId>
		implements DAOEmplacement {

	public DAOEmplacementJPA(EntityManager entityManager) {
		super(entityManager);
	}
	
	@Override
	public List<Emplacement> findByModel(Modele model, boolean isResident) {
		// TODO Auto-generated method stub
		return null;
	}

}
