package fr.univaix.iut.cas2.dao;


public interface DAOFactory {

	public abstract DAOBateau createDAOBateau();

	public abstract DAOEmplacement createDAOEmplacement();

	public abstract DAOModele createDAOModele();

	public abstract DAOOccuper createDAOOccuper();

	public abstract DAOPonton createDAOPonton();

	public abstract DAOPort createDAOPort();

	public abstract DAOProprietaire createDAOPropriétaire();

	public abstract DAOResident createDAOResident();

	public abstract DAOSortir createDAOSortir();

	public abstract DAOStationner createDAOStationner();

	public abstract DAOTypeEmplacement createDAOTypeEmplacement();

}