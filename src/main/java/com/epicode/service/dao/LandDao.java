package com.epicode.service.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.epicode.jpautil.JpaUtil;
import com.epicode.landing.Lend;

public class LandDao {

	public void insert(Lend u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
	}

	public Lend getbyId(Integer i) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Lend land = em.find(Lend.class, i);
		em.close();
		return land;
	}

	public void delete(Integer id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(getbyId(id));
		em.getTransaction().commit();
		em.close();
	}

	public void modify(Lend u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		em.close();
	}

	public List<Lend> getByExperied() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query query = em.createNamedQuery("Select.scaduti");
		List<Lend> list = query.getResultList();
		em.close();
		return list;
	}
}
