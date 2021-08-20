package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.load;

public interface LoadService {

	public List<load> getload();
	
	public load getload1(int shipperid);
	
	public load addLoad(load l1);
	
	public load updateLoad(load l1);
	
	public void deleteLoad(int shipperid);
}
