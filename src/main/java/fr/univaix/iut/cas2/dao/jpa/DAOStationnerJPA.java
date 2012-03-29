package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.beans.Stationner;
import fr.univaix.iut.cas2.beans.StationnerId;
import fr.univaix.iut.cas2.dao.DAOStationner;

public class DAOStationnerJPA extends DAOGeneriqueJPA<Stationner, StationnerId> implements DAOStationner {
	public DAOStationnerJPA(EntityManager entityManager) {
		super(entityManager);
	}
}
