package com.kaushal.service;

import java.util.List;

import com.kaushal.entity.Persion;

public interface PersionService {

	void savePersion(Persion persion);
	List<Persion> fetchPersion();
	void updatePersion(Persion persion);
	void removePersion(int id);
	Persion getPersionById(int id);
}
