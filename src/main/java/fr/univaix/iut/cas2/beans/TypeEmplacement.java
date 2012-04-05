package fr.univaix.iut.cas2.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TypeEmplacement implements Serializable {
	private static final long serialVersionUID = 3440693043836700132L;

	@Id
	@GeneratedValue
	private int idType;
	private int longueur;
	private int largeur;
	private int profondeur;
	
	public TypeEmplacement() {
	}

	public TypeEmplacement(int idType) {
		this.idType = idType;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getProfondeur() {
		return profondeur;
	}

	public void setProfondeur(int profondeur) {
		this.profondeur = profondeur;
	}

	public int getIdType() {
		return idType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idType;
		result = prime * result + largeur;
		result = prime * result + longueur;
		result = prime * result + profondeur;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeEmplacement other = (TypeEmplacement) obj;
		if (idType != other.idType)
			return false;
		if (largeur != other.largeur)
			return false;
		if (longueur != other.longueur)
			return false;
		if (profondeur != other.profondeur)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TypeEmplacement [idType=" + idType + ", longueur=" + longueur
				+ ", largeur=" + largeur + ", pronfondeur=" + profondeur + "]";
	}
	
	
}
