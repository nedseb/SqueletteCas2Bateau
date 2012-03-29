package fr.univaix.iut.cas2.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import fr.univaix.iut.cas2.beans.Bateau;
import fr.univaix.iut.cas2.beans.Modele;
import fr.univaix.iut.cas2.dao.DAOBateau;

public class DAOBateauJPA extends DAOGeneriqueJPA<Bateau, Integer> implements DAOBateau {
	public DAOBateauJPA(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Bateau> findByName(String nomBateau) {
		TypedQuery<Bateau> query = entityManager.createNamedQuery(Bateau.FIND_BY_NAME, Bateau.class);
		query.setParameter("fnomBateau", nomBateau);
		return query.getResultList();
	}

	@Override
	public List<Bateau> findBySerialNumber(String numeroSerie) {
		TypedQuery<Bateau> query = entityManager.createNamedQuery(Bateau.FIND_BY_SERIAL_NUMBER, Bateau.class);
		query.setParameter("fnumeroSerie", numeroSerie);
		return query.getResultList();
	}

	@Override
	public List<Bateau> findByModele(Modele modele) {
		TypedQuery<Bateau> query = entityManager.createNamedQuery(Bateau.FIND_BY_MODELE, Bateau.class);
		query.setParameter("fmodele", modele);
		return query.getResultList();
	}
}
