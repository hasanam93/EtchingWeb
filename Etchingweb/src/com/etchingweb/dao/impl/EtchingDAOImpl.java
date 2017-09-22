package com.etchingweb.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.etchingweb.dao.EtchingITDAO;
import com.etchingweb.model.EtchingIT;
import com.etchingweb.model.Experience;

@Repository("EtchingITDAO")
public class EtchingDAOImpl implements EtchingITDAO {
	
	@Autowired
	private SessionFactory session;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Override
	public boolean saveEtchingIT(EtchingIT etchingit) {
		int id = (Integer)hibernateTemplate.save(etchingit);
		if(id>0)
			return true;
		return false;
	}
	@Override
	public boolean saveExperience(Experience experience) {
		int id = (Integer)hibernateTemplate.save(experience);
		if(id>0)
			return true;
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public EtchingIT getEtchingITDetailsByEmailAndPassword(String email, String password) {
		
		DetachedCriteria detachedCriteria =  DetachedCriteria.forClass(EtchingIT.class);
		detachedCriteria.add(Restrictions.eq("email", email));
		
		detachedCriteria.add(Restrictions.eq("password", password));
		
		List<EtchingIT> findByCriteria = (List<EtchingIT>) hibernateTemplate.findByCriteria(detachedCriteria);
		if(findByCriteria !=null && findByCriteria.size()>0)
		return findByCriteria.get(0);
		else
			return null;
	}
	@Override
	public void add(Experience experience) {
		session.getCurrentSession().save(experience);
		
	}
	
	@Override
	public void edit(Experience experience) {
		session.getCurrentSession().update(experience);
		
	}
	@Override
	public void delete(int experienceid) {
		session.getCurrentSession().delete(getexperience(experienceid));
		
	}
	@Override
	public Experience getexperience(int experienceid) {
		return (Experience)session.getCurrentSession().get(Experience.class, experienceid);
	}
	@Override
	public List getAllExperience() {
		return session.getCurrentSession().createQuery("from experience").list();
	}
	
	
	

}

