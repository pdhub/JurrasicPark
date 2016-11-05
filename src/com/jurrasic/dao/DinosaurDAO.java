package com.jurrasic.dao;

import java.util.List;

import com.jurrasic.model.Dinosaur;

public interface DinosaurDAO {

	public void save(Dinosaur dinosaur);
	public List<Dinosaur> listDinosaurs();
}
