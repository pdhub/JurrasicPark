package com.jurrasic.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jurrasic.dao.DinosaurDAO;
import com.jurrasic.model.Dinosaur;

@Service
public class DinosaurServiceImpl implements DinosaurSevice{

	private DinosaurDAO dinosaurDao;
	
	public void setDinosaurDao(DinosaurDAO dinosaurDao) {
		this.dinosaurDao = dinosaurDao;
	}
	
	public void save(Dinosaur dinosaur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Dinosaur> getAllDinos() {
		return this.dinosaurDao.listDinosaurs();
	}

}
