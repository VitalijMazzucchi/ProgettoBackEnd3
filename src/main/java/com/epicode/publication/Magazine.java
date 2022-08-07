package com.epicode.publication;

import javax.persistence.Entity;

@Entity
public class Magazine extends PublicationAbstract {

	private Periodicity periodicity;

	public Magazine(String isbn, String titolo, Integer yearOfPublication, Integer numberpages,
			Periodicity periodicity) {
		super(isbn, titolo, yearOfPublication, numberpages);
		this.periodicity = periodicity;
	}

	public Magazine() {
		super();
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicity + ", toString()=" + super.toString() + "]";
	}

}
