package fr.univaix.iut.cas2.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.univaix.iut.cas2.beans.Modele;
import fr.univaix.iut.cas2.dao.DAOBateau;
import fr.univaix.iut.cas2.dao.DAOFactory;
import fr.univaix.iut.cas2.dao.jpa.DAOFactoryJPA;

public class App 
{
    public static void main( String[] args )
    {
        // Initializes the Entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPortuaire");
        EntityManager em = emf.createEntityManager();
        
        DAOFactory daof = new DAOFactoryJPA(em);
        DAOBateau daoBateau = daof.createDAOBateau();
        System.out.println(daoBateau.findByName("SLICE OF LIFE"));
        System.out.println(daoBateau.findBySerialNumber("MOD1"));
        System.out.println(daoBateau.findByModele(new Modele(1)));
        em.close();
        emf.close();
    }
}
