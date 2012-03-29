package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.Sortir;
import fr.univaix.iut.cas2.beans.SortirId;
import fr.univaix.iut.cas2.dao.DAOSortir;

public class DAOSortirJPA extends DAOGeneriqueJPA<Sortir, SortirId> implements DAOSortir {
	public DAOSortirJPA(EntityManager entityManager) {
		super(entityManager);
	}
}
