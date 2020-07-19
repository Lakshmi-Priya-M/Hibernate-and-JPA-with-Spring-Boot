package com.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.databasedemo.entity.Person;
import com.database.databasedemo.jdbc.PersonJdbcDAO;
import com.database.databasedemo.jpa.PersonJpaRepository;


// CommandLineRunner - Command Line Runner is an interface. It is used to 
// execute the code after the Spring Boot application started.

@SpringBootApplication
public class JPADemoApplication implements CommandLineRunner{

	
	  private Logger logger = LoggerFactory.getLogger(this.getClass());
	  
	 /*
	  * @Autowired PersonJdbcDAO dao;
	  */
	 
	  @Autowired
	  PersonJpaRepository repository;
	
	 public static void main(String[] args) {
		SpringApplication.run(JPADemoApplication.class, args);
	 }

	 @Override
	  public void run(String... args) throws Exception {
	
		 logger.info("user 10002  -> {}", repository.findById(10002));
		 logger.info("Inserting 10006 -> {}", repository.insert(new Person(10006, "Latchu", "Lucknow", new Date())));
		 logger.info("Update 10005 -> {}", repository.update(new Person(10005, "Achu", "Lucknow", new Date())));
		 repository.deleteById(10002);
		 // we cannot use logger.info since it returns void
		 logger.info("All users -> {}", repository.findAll());
	 }
	

}
