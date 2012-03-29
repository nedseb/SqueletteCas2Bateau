package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.Resident;
import fr.univaix.iut.cas2.dao.DAOResident;

public class DAOResidentJPA extends DAOGeneriqueJPA<Resident, Integer> implements DAOResident {
	public DAOResidentJPA(EntityManager entityManager) {
		super(entityManager);
	}
}
