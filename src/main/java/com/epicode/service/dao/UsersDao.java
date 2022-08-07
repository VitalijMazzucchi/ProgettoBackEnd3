package com.epicode.service.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.epicode.jpautil.JpaUtil;
import com.epicode.landing.Lend;
import com.epicode.user.User;

public class UsersDao {

	public void insert(User u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
	}

	public User getbyId(Integer i) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		User user = em.find(User.class, i);
		em.close();
		return user;
	}

	public void delete(Integer id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(getbyId(id));
		em.getTransaction().commit();
		em.close();
	}

	public void modify(User u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		em.close();
	}

	public List<Lend> getListLandByCard(Integer i) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query query = em.createNamedQuery("Select.lands");
		query.setParameter("numberCard", i);
		List<Lend> list = query.getResultList();
		em.close();
		return list;
	}
}
