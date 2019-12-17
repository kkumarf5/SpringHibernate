package com.kaushal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kaushal.dao.PersionDAO;
import com.kaushal.entity.Persion;

@Service
public class PersionServiceImpl implements PersionService {
	
	private PersionDAO persionDao;
	
	public PersionDAO getPersionDao() {
		return persionDao;
	}

	@Autowired
	@Qualifier(value="persionDAO")
	public void setPersionDao(PersionDAO persionDao) {
		this.persionDao = persionDao;
	}

	@Override
	@Transactional
	public void savePersion(Persion persion) {
		// TODO Auto-generated method stub
		
		this.persionDao.savePersion(persion);
	}

	@Override
	@Transactional
	public List<Persion> fetchPersion() {
		// TODO Auto-generated method stub
		return this.persionDao.fetchPersion();
	}

	@Override
	@Transactional
	public void updatePersion(Persion persion) {
		// TODO Auto-generated method stub
		this.persionDao.updatePersion(persion);

	}

	@Override
	@Transactional
	public void removePersion(int id) {
		// TODO Auto-generated method stub
		this.persionDao.removePersion(id);
	}

	@Override
	@Transactional
	public Persion getPersionById(int id) {
		// TODO Auto-generated method stub
		return this.persionDao.getPersionById(1);
	}

}
