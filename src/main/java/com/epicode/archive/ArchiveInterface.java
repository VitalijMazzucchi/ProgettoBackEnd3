package com.epicode.archive;

import java.util.List;

import com.epicode.landing.Lend;
import com.epicode.publication.Book;
import com.epicode.publication.PublicationAbstract;

public interface ArchiveInterface {
	void AddCatalog(PublicationAbstract p);

	void deleteByisbn(String s);

	PublicationAbstract searchByisbn(String s);

	List<PublicationAbstract> getByYear(Integer i);

	List<Book> getByAuthor(String s);

	List<PublicationAbstract> getByTitle(String s);

	List<PublicationAbstract> getByTitleNotComplete(String s);

	List<Lend> getListLandByCard(Integer i);

	List<Lend> getListLand();
}
