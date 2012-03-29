package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.Modele;
import fr.univaix.iut.cas2.dao.DAOModele;

public class DAOModeleJPA extends DAOGeneriqueJPA<Modele, Integer> implements DAOModele {

	public DAOModeleJPA(EntityManager entityManager) {
		super(entityManager);
	}
}
