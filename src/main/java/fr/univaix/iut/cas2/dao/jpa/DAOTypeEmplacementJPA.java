package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.TypeEmplacement;
import fr.univaix.iut.cas2.dao.DAOTypeEmplacement;

public class DAOTypeEmplacementJPA extends DAOGeneriqueJPA<TypeEmplacement, Integer> implements DAOTypeEmplacement {
	public DAOTypeEmplacementJPA(EntityManager entityManager) {
		super(entityManager);
	}
}
