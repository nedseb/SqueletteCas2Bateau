package fr.univaix.iut.cas2.dao;

import java.util.Collection;

import fr.univaix.iut.cas2.beans.Bateau;
import fr.univaix.iut.cas2.beans.Modele;


public interface DAOBateau extends DAO<Bateau, Integer> {
	public Collection<Bateau> findByName(String nomBateau);
	public Collection<Bateau> findBySerialNumber(String numeroSerie);
	public Collection<Bateau> findByModele(Modele modele);
	
}
