package com.epicode.landing;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import com.epicode.publication.PublicationAbstract;
import com.epicode.user.User;

@Entity
@NamedQuery(name = "Select.scaduti", query = "SELECT l FROM Lend l WHERE l.dateRefund is NULL AND l.refund = True  ")
public class Lend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private User user;
	@OneToOne
	private PublicationAbstract element;
	private LocalDate startLanding;
	private boolean refund;
	private LocalDate dateRefund;

	public Lend(User user, PublicationAbstract element, LocalDate startLanding, LocalDate dateRefund) {
		super();
		this.user = user;
		this.element = element;
		this.startLanding = startLanding;
		this.refund = startLanding.plusDays(30).isBefore(LocalDate.now());
		this.dateRefund = dateRefund;
	}

	public Lend() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PublicationAbstract getElement() {
		return element;
	}

	public void setElement(PublicationAbstract element) {
		this.element = element;
	}

	public LocalDate getStartLanding() {
		return startLanding;
	}

	public void setStartLanding(LocalDate startLanding) {
		this.startLanding = startLanding;
	}

	public boolean getRefund() {
		return refund;
	}

	public void setRefund(boolean refund) {
		this.refund = refund;
	}

	public LocalDate getDateRefund() {
		return dateRefund;
	}

	public void setDateRefund(LocalDate dateRefund) {
		this.dateRefund = dateRefund;
	}

	@Override
	public String toString() {
		return "Lend [id=" + id + ", user=" + user + ", element=" + element + ", startLanding=" + startLanding
				+ ", refund=" + refund + ", dateRefund=" + dateRefund + "]";
	}

}
