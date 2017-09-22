package com.etchingweb.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.etchingweb.dao.EtchingITDAO;
import com.etchingweb.model.EtchingIT;
import com.etchingweb.model.Experience;
import com.etchingweb.service.EtchingITService;



@Service("EtchingITService")
public class EtchingITServiceImpl implements EtchingITService {
	
	@Autowired
	private EtchingITDAO EtchingITDAO;
	

	public EtchingITDAO getEtchingITDAO() {
		return EtchingITDAO;
	}

	public void setEtchingITDAO(EtchingITDAO etchingITDAO) {
		EtchingITDAO = etchingITDAO;
	}

	@Override
	public EtchingIT validateEtchingITCredential(String email, String password) {
		EtchingIT etchingit = getEtchingITDAO().getEtchingITDetailsByEmailAndPassword(email, password);
		return etchingit;
	}

	@Override
	public boolean registerEtchingIT(EtchingIT etchingit) {
		boolean isRegister=false;
		boolean saveStudent = getEtchingITDAO().saveEtchingIT(etchingit);
		if(saveStudent)
			isRegister=true;
		return isRegister;
	}
	@Override
	public boolean registerExperience(Experience experience) {
		boolean isRegister=false;
		boolean saveStudent = getEtchingITDAO().saveExperience(experience);
		if(saveStudent)
			isRegister=true;
		return isRegister;
	}

	@Override

	public void add(Experience experience) {
		EtchingITDAO.add(experience);
	}
	
	@Override

	public void edit(Experience experience) {
		
		EtchingITDAO.edit(experience);
	}

	@Override

	public void delete(int experienceid) {
		EtchingITDAO.delete(experienceid);
		
	}
	
	@Override

	public Experience getexperience(int experienceid) {
		
		return EtchingITDAO.getexperience(experienceid);
	}

	@Override

	public List getAllExperience() {
		
		return EtchingITDAO.getAllExperience();
	}

	
	
	
	
	
	

}
