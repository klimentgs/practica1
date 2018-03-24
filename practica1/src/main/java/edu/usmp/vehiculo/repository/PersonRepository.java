package edu.usmp.vehiculo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import edu.usmp.vehiculo.model.Person;

public interface PersonRepository 
extends Repository<Person,Integer>
{

	void save(Person person);
	
	List<Person> findAll();
}
