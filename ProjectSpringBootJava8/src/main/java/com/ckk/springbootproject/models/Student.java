package com.ckk.springbootproject.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Student")
public class Student {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	@JsonIgnore
	private int idstudent;
	@Column
	private String sname;
	
	@Column
	private int salary;

	public int getIdstudent() {
		return idstudent;
	}

	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [idstudent=" + idstudent + ", sname=" + sname + ", salary=" + salary + "]";
	}

	public Student(int idstudent, String sname, int salary) {
		super();
		this.idstudent = idstudent;
		this.sname = sname;
		this.salary = salary;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
