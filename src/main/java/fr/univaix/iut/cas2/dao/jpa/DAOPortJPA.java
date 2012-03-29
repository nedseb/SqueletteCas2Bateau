package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.Port;
import fr.univaix.iut.cas2.dao.DAOPort;

public class DAOPortJPA extends DAOGeneriqueJPA<Port, String> implements DAOPort {
	public DAOPortJPA(EntityManager entityManager) {
		super(entityManager);
	}
}
