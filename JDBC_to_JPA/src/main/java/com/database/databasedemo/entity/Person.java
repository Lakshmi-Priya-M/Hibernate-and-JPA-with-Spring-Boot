 package com.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity 								//  Annotation to map a class to a table
@NamedQuery(name = "find_all_persons", query = "select p from Person p")
//@Table(name="person")	// Annotation used if Class name & Table name are different
public class Person {

	     @Id                         // to denote this is a primary key
	     @GeneratedValue    // automatically id is generated.
		 private int id; 
		 private String name; 
		 private String location; 
		 private Date birthDate;
 
		 public Person()
		 {
			 //Java will not provide default constructor when paramterized constructor 
			 // is present. // A constructor is used to initialize an object. And hence
			// constructor is required to initialize an object. public Person() 			 
		 }
		 
		public Person(int id, String name, String location, Date birthDate) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.birthDate = birthDate;
		}
		
		public Person(String name, String location, Date birthDate) {
			super();
			// Writing this constructor because Id is Auto Generated
			this.name = name;
			this.location = location;
			this.birthDate = birthDate;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Date getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
		}
}