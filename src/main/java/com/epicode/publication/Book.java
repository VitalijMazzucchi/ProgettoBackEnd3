package com.epicode.publication;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Search.author", query = "Select p From Book p WHERE p.author=:author")
public class Book extends PublicationAbstract {
	private String author;
	private String literaryGenre;

	public Book(String isbn, String titolo, Integer yearOfPublication, Integer numberpages, String author,
			String literaryGenre) {
		super(isbn, titolo, yearOfPublication, numberpages);
		this.author = author;
		this.literaryGenre = literaryGenre;
	}

	public Book() {
		super();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLiteraryGenre() {
		return literaryGenre;
	}

	public void setLiteraryGenre(String literaryGenre) {
		this.literaryGenre = literaryGenre;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + author + ", genere=" + literaryGenre + ", toString()=" + super.toString() + "]";
	}

}
