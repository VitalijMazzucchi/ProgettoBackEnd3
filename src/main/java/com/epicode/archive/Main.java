package com.epicode.archive;

import java.time.LocalDate;
import java.util.List;

import com.epicode.lending.Lend;
import com.epicode.publication.Book;
import com.epicode.publication.Magazine;
import com.epicode.publication.Periodicity;
import com.epicode.service.LendService;
import com.epicode.service.UsersService;
import com.epicode.user.User;

public class Main {

	public static void main(String[] args) {
		Archive ar = new Archive();
		UsersService us = new UsersService();
		LendService l = new LendService();

		// Magazine gossip = new Magazine("0", "Gossip", 2022, 100,
		// Periodicity.MONTHLY);
		Magazine sport = new Magazine("1", "SportMania", 1987, 15, Periodicity.SEMI_ANNUAL);
		// Magazine scenza = new Magazine("2", "Scenza con la i", 2020, 50,
		// Periodicity.WEEKLY);

		// Book l1 = new Book("3", "La storia Finita", 1800, 1, "Micheal Ende",
		// "fantascenza");
		// Book l2 = new Book("4", "L uomo che sussurrava ai passanti", 2022, 150, "Bill
		// Vocegrossa", "Thriller");
		Book l3 = new Book("5", "il signore degli spiccioli", 2007, 500, "Mone tina", "Biografia");

		ar.AddCatalog(sport);
		ar.AddCatalog(l3);
		ar.getByAuthor("Mone tina");

		User user = new User("Ereditato", "Salvatore", "25-04-1991", 2201);
		User user1 = new User("Beatrice", "Paoli", "15-04-1998", 2271);
		User user2 = new User("", "Concetto", "17-6-1980", 1000);
		User user3 = new User("30-3-2006", "Marco", "30-3-2006", 1200);
		User user4 = new User("22-12-1990", "Antonio", "22-12-1990", 1122);

		Lend len1 = new Lend(user2, l3, LocalDate.of(2022, 8, 2), null);
		Lend len2 = new Lend(user1, l3, LocalDate.of(2022, 7, 2), null);
		Lend len3 = new Lend(user4, sport, LocalDate.of(2022, 7, 20), LocalDate.of(2022, 8, 1));
		Lend len4 = new Lend(user3, l3, LocalDate.of(2022, 5, 14), LocalDate.of(2022, 6, 1));
		Lend len5 = new Lend(user3, sport, LocalDate.of(2022, 8, 1), null);

		us.insert(user);
		us.insert(user1);
		us.insert(user2);
		us.insert(user3);
		us.insert(user4);

		l.insert(len1);
		l.insert(len2);
		l.insert(len3);
		l.insert(len4);
		l.insert(len5);

		// List<Lend> list = ar.getListLandByCard(1200);
		// for (Lend lend : list) {
		// System.out.println(lend.toString());

		System.out.println(ar.getListLandByCard(1200));
		List<Lend> list = ar.getListLand();
		for (Lend lend : list) {
			System.out.println(lend.toString());
		}
	}

}
