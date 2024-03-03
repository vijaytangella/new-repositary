package CBMS.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import CBMS.DTO.AdminSignUpDTO;

public class AdminSignUpDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CBMS");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String insert(AdminSignUpDTO ad) {
		if (ad != null) {
			et.begin();
			em.persist(ad);
			et.commit();
			return "Welcome Admin";
		} else {
			return "Error";
		}
	}
	
	public AdminSignUpDTO fetchById(long ph) {
		AdminSignUpDTO admin = em.find(AdminSignUpDTO.class, ph);
		if(admin!=null)
			return admin;
		else
			return null;
	}
}