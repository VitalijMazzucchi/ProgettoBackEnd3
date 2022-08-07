package com.epicode.archive;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epicode.landing.Lend;
import com.epicode.publication.Book;
import com.epicode.publication.PublicationAbstract;
import com.epicode.service.LandService;
import com.epicode.service.PublicationsService;
import com.epicode.service.UsersService;

public class Archive implements ArchiveInterface {
	private LandService is = new LandService();
	private PublicationsService ps = new PublicationsService();
	private UsersService us = new UsersService();
	private Logger log = LoggerFactory.getLogger(Archive.class);

	@Override
	public void AddCatalog(PublicationAbstract p) {

		try {
			ps.insert(p);
		} catch (Exception e) {
			log.error("errore a caso");
		}

	}

	@Override
	public void deleteByisbn(String s) {

		try {
			ps.delete(s);
		} catch (Exception e) {
			log.error("errore a caso");
		}

	}

	@Override
	public PublicationAbstract searchByisbn(String s) {
		try {
			return ps.getbyId(s);
		} catch (Exception e) {
			log.error("errore a caso");
			return new Book();
		}

	}

	@Override
	public List<PublicationAbstract> getByYear(Integer i) {
		try {
			return ps.getYaraofPublication(i);
		} catch (Exception e) {
			log.error("errore a caso");
			return new ArrayList<>();
		}

	}

	@Override
	public List<Book> getByAuthor(String s) {
		try {
			return ps.getByAuthore(s);
		} catch (Exception e) {
			log.error("errore a caso");
			return new ArrayList<>();
		}

	}

	@Override
	public List<PublicationAbstract> getByTitle(String s) {
		try {
			return ps.getByTitle(s);
		} catch (Exception e) {
			log.error("errore a caso");
			return new ArrayList<>();
		}

	}

	@Override
	public List<PublicationAbstract> getByTitleNotComplete(String s) {
		try {
			return ps.getByTitleNotComplete(s);
		} catch (Exception e) {
			log.error("errore a caso");
			return new ArrayList<>();
		}

	}

	@Override
	public List<Lend> getListLandByCard(Integer i) {
		try {
			return us.getListLandByCard(i);
		} catch (Exception e) {
			log.error("errore a caso");
			return new ArrayList<>();
		}

	}

	@Override
	public List<Lend> getListLand() {
		try {
			return is.getByExperied();
		} catch (Exception e) {
			log.error("errore a caso");
			return new ArrayList<>();
		}

	}

}
