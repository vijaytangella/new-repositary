package CBMS.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import CBMS.DTO.ReferAFriendDTO;

public class ReferAFriendDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CBMS");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public String insert(ReferAFriendDTO dto) {
		if (dto != null) {
			et.begin();
			em.persist(dto);
			et.commit();
			return "Thank You For Referring";
		} else {
			return "An Error Occured";
		}
	}

	public List<ReferAFriendDTO> fetchAll() {
		Query query = em.createQuery("select data from ReferAFriendDTO data");
		List<ReferAFriendDTO> list = query.getResultList();
		if (list.isEmpty()) {
			return null;
		} else {
			return list;
		}
	}
}
