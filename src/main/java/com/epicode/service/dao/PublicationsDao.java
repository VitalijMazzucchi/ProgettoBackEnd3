package com.epicode.service.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.epicode.jpautil.JpaUtil;
import com.epicode.publication.Book;
import com.epicode.publication.PublicationAbstract;

public class PublicationsDao {
	public void insert(PublicationAbstract u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
	}

	public PublicationAbstract getbyId(String i) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		PublicationAbstract land = em.find(PublicationAbstract.class, i);
		em.close();
		return land;
	}

	public void delete(String id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(getbyId(id));
		em.getTransaction().commit();
		em.close();
	}

	public void modify(PublicationAbstract u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		em.close();
	}

	public List<PublicationAbstract> getYaraofPublication(Integer i) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query query = em.createNamedQuery("Search.yearOfPublication");
		query.setParameter("yearOfPublication", i);
		List<PublicationAbstract> list = query.getResultList();
		em.close();
		return list;
	}

	public List<PublicationAbstract> getByTitle(String s) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query query = em.createNamedQuery("Search.title");
		query.setParameter("title", s);
		List<PublicationAbstract> list = query.getResultList();
		em.close();
		return list;
	}

	public List<PublicationAbstract> getByTitleNotComplete(String s) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query query = em.createNamedQuery("Search.title");
		String like = "%" + s + "%";
		query.setParameter("title", like);
		List<PublicationAbstract> list = query.getResultList();
		em.close();
		return list;
	}

	public List<Book> getByAuthore(String s) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Query query = em.createNamedQuery("Search.author");
		query.setParameter("author", s);
		List<Book> list = query.getResultList();
		em.close();
		return list;
	}

}
