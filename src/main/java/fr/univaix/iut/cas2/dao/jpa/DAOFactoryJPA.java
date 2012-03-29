package fr.univaix.iut.cas2.dao.jpa;

import javax.persistence.EntityManager;

import fr.univaix.iut.cas2.dao.DAOBateau;
import fr.univaix.iut.cas2.dao.DAOEmplacement;
import fr.univaix.iut.cas2.dao.DAOFactory;
import fr.univaix.iut.cas2.dao.DAOModele;
import fr.univaix.iut.cas2.dao.DAOOccuper;
import fr.univaix.iut.cas2.dao.DAOPonton;
import fr.univaix.iut.cas2.dao.DAOPort;
import fr.univaix.iut.cas2.dao.DAOProprietaire;
import fr.univaix.iut.cas2.dao.DAOResident;
import fr.univaix.iut.cas2.dao.DAOSortir;
import fr.univaix.iut.cas2.dao.DAOStationner;
import fr.univaix.iut.cas2.dao.DAOTypeEmplacement;

public class DAOFactoryJPA implements DAOFactory {

	private EntityManager entityManager;

	public DAOFactoryJPA(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOBateau()
	 */
	@Override
	public DAOBateau createDAOBateau() {
		return new DAOBateauJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOEmplacement()
	 */
	@Override
	public DAOEmplacement createDAOEmplacement() {
		return new DAOEmplacementJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOModele()
	 */
	@Override
	public DAOModele createDAOModele() {
		return new DAOModeleJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOOccuper()
	 */
	@Override
	public DAOOccuper createDAOOccuper() {
		return new DAOOccuperJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOPonton()
	 */
	@Override
	public DAOPonton createDAOPonton() {
		return new DAOPontonJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOPort()
	 */
	@Override
	public DAOPort createDAOPort() {
		return new DAOPortJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOPropriétaire()
	 */
	@Override
	public DAOProprietaire createDAOPropriétaire() {
		return new DAOProprietaireJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOResident()
	 */
	@Override
	public DAOResident createDAOResident() {
		return new DAOResidentJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOSortir()
	 */
	@Override
	public DAOSortir createDAOSortir() {
		return new DAOSortirJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOStationner()
	 */
	@Override
	public DAOStationner createDAOStationner() {
		return new DAOStationnerJPA(entityManager);
	}

	/* (non-Javadoc)
	 * @see fr.univaix.iut.cas2.dao.jpa.DAOFactory#createDAOTypeEmplacement()
	 */
	@Override
	public DAOTypeEmplacement createDAOTypeEmplacement() {
		return new DAOTypeEmplacementJPA(entityManager);
	}
}
