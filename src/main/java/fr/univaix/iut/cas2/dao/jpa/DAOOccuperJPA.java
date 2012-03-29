package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.Occuper;
import fr.univaix.iut.cas2.beans.OccuperId;
import fr.univaix.iut.cas2.dao.DAOOccuper;

public class DAOOccuperJPA extends DAOGeneriqueJPA<Occuper, OccuperId> implements DAOOccuper {

	public DAOOccuperJPA(EntityManager entityManager) {
		super(entityManager);
	}
}
