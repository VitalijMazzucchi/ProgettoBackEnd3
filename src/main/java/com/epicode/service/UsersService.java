package com.epicode.service;

import java.util.List;

import com.epicode.landing.Lend;
import com.epicode.service.dao.UsersDao;
import com.epicode.user.User;

public class UsersService {
	UsersDao dao = new UsersDao();

	public void insert(User u) {
		dao.insert(u);
	}

	public User getbyId(Integer i) {
		return dao.getbyId(i);
	}

	public void delete(Integer id) {
		dao.delete(id);

	}

	public void modify(User u) {
		dao.modify(u);
	}

	public List<Lend> getListLandByCard(Integer i) {

		return dao.getListLandByCard(i);
	}
}
