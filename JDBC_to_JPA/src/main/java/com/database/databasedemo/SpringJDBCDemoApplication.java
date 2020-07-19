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


// CommandLineRunner - Command Line Runner is an interface. It is used to 
// execute the code after the Spring Boot application started.

//@SpringBootApplication
public class SpringJDBCDemoApplication implements CommandLineRunner{

	
	  private Logger logger = LoggerFactory.getLogger(this.getClass());
	  
	  @Autowired 
	  PersonJdbcDAO dao;
	  
	public static void main(String[] args) {
		SpringApplication.run(SpringJDBCDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		  logger.info("All users -> {}", dao.findAll());
		  logger.info("user 10001  -> {}", dao.findById(10001));
		  logger.info("Deleting 10001  -> No of Rows Deleted {}",
		  dao.deleteById(10001)); 
		  logger.info("Inserting 10006 -> {}", dao.insert(new
		  Person(10006, "Latchu", "Lucknow", new Date())));
		  logger.info("Update 10005 -> {}", dao.update(new Person(10005, "Achu",
		  "Lucknow", new Date())));
	}
	

}
