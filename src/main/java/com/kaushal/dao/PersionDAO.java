package com.kaushal.dao;

import java.util.List;

import com.kaushal.entity.Persion;

public interface PersionDAO {

	void savePersion(Persion persion);
	List<Persion> fetchPersion();
	void updatePersion(Persion persion);
	void removePersion(int id);
	Persion getPersionById(int id);
}
