package com.epicode.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.epicode.lending.Lend;

@Entity
@NamedQuery(name = "Select.lands", query = "SELECT l FROM Lend l WHERE l.user.numberCard =:numberCard AND l.dateRefund is NULL")
public class User {
	private String name;
	private String surname;
	private String birth;
	@Id
	private Integer numberCard;
	@OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<Lend> lands = new ArrayList<>();

	public User(String name, String surname, String birth, Integer numberCard) {
		super();
		this.name = name;
		this.surname = surname;
		this.birth = birth;
		this.numberCard = numberCard;

	}

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Integer getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(Integer numberCard) {
		this.numberCard = numberCard;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", birth=" + birth + ", numberCard=" + numberCard + "]";
	}

}
