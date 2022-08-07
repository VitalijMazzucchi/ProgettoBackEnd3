package com.epicode.service;

import java.util.List;

import com.epicode.landing.Lend;
import com.epicode.service.dao.LandDao;

public class LandService {
	LandDao dao = new LandDao();

	public void insert(Lend u) {
		dao.insert(u);
	}

	public Lend getbyId(Integer i) {
		return dao.getbyId(i);
	}

	public void delete(Integer id) {
		dao.delete(id);

	}

	public void modify(Lend u) {
		dao.modify(u);
	}

	public List<Lend> getByExperied() {
		return dao.getByExperied();
	}
}
