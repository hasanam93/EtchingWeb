package com.etchingweb.service;

import java.util.List;

import com.etchingweb.model.EtchingIT;
import com.etchingweb.model.Experience;

public interface EtchingITService {

	
	public abstract EtchingIT validateEtchingITCredential(String email,	String password);
	public abstract boolean registerEtchingIT(EtchingIT etchingit);
	
	public abstract boolean registerExperience(Experience experience);

	public void add( Experience experience);
	public void edit(Experience experience);
	public void delete( int experienceid);
	public Experience getexperience(int experienceid);
	public List getAllExperience();
}