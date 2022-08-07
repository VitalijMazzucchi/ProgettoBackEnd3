package com.epicode.publication;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name = "Search.yearOfPublication", query = "Select p From PublicationAbstract p WHERE p.yearOfPublication=:yearOfPublication")
@NamedQuery(name = "Search.title", query = "Select p From PublicationAbstract p WHERE p.title=:title")
@NamedQuery(name = "Search.title.nocomplete", query = "Select p From PublicationAbstract p WHERE p.title LIKE :title ")
public abstract class PublicationAbstract {
	@Id
	private String isbn;
	private String title;
	private Integer yearOfPublication;
	private Integer numberpages;;

	public PublicationAbstract(String isbn, String titolo, Integer yearOfPublication, Integer numberpages) {
		this.isbn = isbn;
		this.title = titolo;
		this.yearOfPublication = yearOfPublication;
		this.numberpages = numberpages;
	}

	public PublicationAbstract() {
		super();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(Integer yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public int getNumberpages() {
		return numberpages;
	}

	public void setNumberpages(Integer numberpages) {
		this.numberpages = numberpages;
	}

	@Override
	public String toString() {
		return "TestoAbstract [isbn=" + isbn + ", titolo=" + title + ", annoPubblicazione=" + yearOfPublication
				+ ", numeroPagine=" + numberpages + "]";
	}

}
