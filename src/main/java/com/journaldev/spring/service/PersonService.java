package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.Person;

public interface PersonService {
	/*
	 * this is the service level
	 * of method to add the details 
	 * of the person
	 * sanjeev
	 */

	public void addPerson(Person p);
	/*public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	*/
}
