package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
/*
 * this is add person details 
 * having the particular fields
 * sanjeev
 * (non-Javadoc)
 * @see com.journaldev.spring.dao.PersonDAO#addPerson(com.journaldev.spring.model.Person)
 */
	@Override
	public void addPerson(Person p) {
		
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Person saved successfully, Person Details="+p);
	}

	
}
