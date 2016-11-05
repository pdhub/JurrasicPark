package com.jurrasic.service;

import java.util.List;

import com.jurrasic.model.Dinosaur;

public interface DinosaurSevice {

	public void save(Dinosaur dinosaur);
	public List<Dinosaur> getAllDinos();
}
