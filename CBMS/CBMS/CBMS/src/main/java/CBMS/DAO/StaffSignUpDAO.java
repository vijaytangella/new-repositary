package CBMS.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import CBMS.DTO.AdminSignUpDTO;
import CBMS.DTO.CustSignUpDTO;
import CBMS.DTO.StaffSignUpDTO;

public class StaffSignUpDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CBMS");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String insert(StaffSignUpDTO addto) {
		if (addto != null) {
			et.begin();
			em.persist(addto);
			et.commit();
			return "Welcome Admin";
		} else {
			return "Error";
		}
	}

	public StaffSignUpDTO fetchById(long ph) {
		StaffSignUpDTO admin = em.find(StaffSignUpDTO.class, ph);
		if (admin != null)
			return admin;
		else
			return null;
	}

	public List<StaffSignUpDTO> fetchAll() {
		Query q = em.createQuery("select data from StaffSignUpDTO data");
		List<StaffSignUpDTO> l = q.getResultList();
		if (l.isEmpty())
			return null;
		else
			return l;
	}
}
