package com.web.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="emp_tab")
public class Employee {
	@Id
	@Column(name="EMP_ID")
	@GeneratedValue(generator="emp_id")
	@GenericGenerator(name="emp_id",strategy="increment")
	private Long empId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="CONT_NUMBER")
	private String contNumber;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContNumber() {
		return contNumber;
	}
	public void setContNumber(String contNumber) {
		this.contNumber = contNumber;
	}
	public Employee(Long empId) {
		super();
		this.empId = empId;
	}
	public Employee() {
		super();
	}
	
	
	

}
