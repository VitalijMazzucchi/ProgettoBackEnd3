package com.epicode.service;

import java.util.List;

import com.epicode.publication.Book;
import com.epicode.publication.PublicationAbstract;
import com.epicode.service.dao.PublicationsDao;

public class PublicationsService {
	PublicationsDao dao = new PublicationsDao();

	public void insert(PublicationAbstract u) {
		dao.insert(u);
	}

	public PublicationAbstract getbyId(String i) {
		return dao.getbyId(i);
	}

	public void delete(String id) {
		dao.delete(id);

	}

	public void modify(PublicationAbstract u) {
		dao.modify(u);
	}

	public List<PublicationAbstract> getYaraofPublication(Integer i) {
		return dao.getYaraofPublication(i);
	}

	public List<PublicationAbstract> getByTitle(String s) {
		return dao.getByTitle(s);
	}

	public List<PublicationAbstract> getByTitleNotComplete(String s) {
		return dao.getByTitleNotComplete(s);
	}

	public List<Book> getByAuthore(String s) {
		return dao.getByAuthore(s);
	}
}
