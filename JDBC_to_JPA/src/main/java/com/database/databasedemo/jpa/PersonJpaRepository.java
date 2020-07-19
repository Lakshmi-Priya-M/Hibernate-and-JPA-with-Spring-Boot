package com.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.database.databasedemo.entity.Person;

// Repository
// Transaction - All of them must be successfull or All of them must to be failed. 
//                      This must be used in business service impl. For now it is used in repositary class.
@Repository
@Transactional
public class PersonJpaRepository {

	// Connect to the database
	@PersistenceContext
	EntityManager entityManager;
	// EntityManager - Manages the entities. All the operations performing in a sessions 
	//                          are stored in Entity Manager.
	// All the operations are stored in persistence through an interface EntityManager.
	
	public List<Person> findAll()
	{
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}
	
	public Person findById(int id) 
	{ 
		  return entityManager.find(Person.class, id) ;
		  // There are number of default methods in EntityManager.
		  // entityManager.find(entityClass, primaryKey) is one among them.

	}  
	
	public Person update(Person person) 
	{ 
		  return entityManager.merge(person) ;
		  // To insert or update, entityManager.merge() method is used.
		  // If Id is present in person object then it will update the record of that Id.
		  // If Id is not present in person object then it will insert it as a new record.

	}
	
	public Person insert(Person person) 
	{ 
		  return entityManager.merge(person) ;
		  // To insert or update, entityManager.merge() method is used.
		  // If Id is present in person object then it will update the record of that Id.
	      // If Id is not present in person object then it will insert it as a new record.

	}
	
	public void deleteById(int id) 
	{ 
		Person person = findById(id);
		entityManager.remove(person);
		// entityManager.remove() doesn't return anything.
		// That is why return type is void.
		// Before removing a person, we need to find the person.
	}
}
