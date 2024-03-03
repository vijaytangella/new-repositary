package CBMS.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import CBMS.DTO.FeedBackDTO;

public class FeedBackDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CBMS");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String insert(FeedBackDTO dto) {
		if (dto != null) {
			et.begin();
			em.persist(dto);
			et.commit();
			return "Thank You For The FeedBack";
		} else {
			return "An Error Occured";
		}
	}

	public List<FeedBackDTO> fetchAll() {
		Query query = em.createQuery("select data from FeedBackDTO data");
		List<FeedBackDTO> list = query.getResultList();
		if (list.isEmpty()) {
			return null;
		} else {
			return list;
		}
	}
}
