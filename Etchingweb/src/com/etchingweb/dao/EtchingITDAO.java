package com.etchingweb.dao;

import java.util.List;

import com.etchingweb.model.EtchingIT;
import com.etchingweb.model.Experience;

public interface EtchingITDAO {
		public abstract boolean saveEtchingIT(EtchingIT etchingit);
		public EtchingIT getEtchingITDetailsByEmailAndPassword(String email,String password);
	
		public abstract boolean saveExperience(Experience experience);
		
		
		
		public void add( Experience experience);

	public void edit(Experience experience);
	public void delete( int experienceid);
	public Experience getexperience(int experienceid);
	public List getAllExperience();
	
	}


