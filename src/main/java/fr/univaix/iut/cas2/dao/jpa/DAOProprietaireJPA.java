package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.Proprietaire;
import fr.univaix.iut.cas2.dao.DAOProprietaire;

public class DAOProprietaireJPA extends DAOGeneriqueJPA<Proprietaire, Integer> implements DAOProprietaire {

	public DAOProprietaireJPA(EntityManager entityManager) {
		super(entityManager);
	}
}
