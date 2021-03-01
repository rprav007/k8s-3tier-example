package com.ns;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class Student {

	@Id
	private String id;
	private String firstName;
	private String lastName;

	public Student() {

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Student(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);

	}



}
