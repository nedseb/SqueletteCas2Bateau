package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.Ponton;
import fr.univaix.iut.cas2.dao.DAOPonton;

public class DAOPontonJPA extends DAOGeneriqueJPA<Ponton, Integer> implements DAOPonton {
	public DAOPontonJPA(EntityManager entityManager) {
		super(entityManager);
	}
}
