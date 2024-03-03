package CBMS.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import CBMS.DTO.AdminSignUpDTO;
import CBMS.DTO.CustSignUpDTO;

public class CustSignUpDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CBMS");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String insert(CustSignUpDTO addto) {
		if (addto != null) {
			et.begin();
			em.persist(addto);
			et.commit();
			return "Welcome Admin";
		} else {
			return "Error";
		}
	}

	public CustSignUpDTO fetchById(long ph) {
		CustSignUpDTO admin = em.find(CustSignUpDTO.class, ph);
		if (admin != null)
			return admin;
		else
			return null;
	}

	public List<CustSignUpDTO> fetchAll() {
		Query q = em.createQuery("select data from CustSignUpDTO data");
		List<CustSignUpDTO> l = q.getResultList();
		if (l.isEmpty())
			return null;
		else
			return l;
	}
}
