package net.software.tracking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Developer")
public class Developer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name",nullable=false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "role")
	private String role;
	@Column(name = "days_avalaible")
	private int daysAvailable;
	@Column(name = "contribution")
	private String contribution;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getDaysAvailable() {
		return daysAvailable;
	}
	public void setDaysAvailable(int daysAvailable) {
		this.daysAvailable = daysAvailable;
	}
	public String getContribution() {
		return contribution;
	}
	public void setContribution(String contribution) {
		this.contribution = contribution;
	}
	public Developer(Long id, String firstName, String lastName, String role, int daysAvailable, String contribution) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.daysAvailable = daysAvailable;
		this.contribution = contribution;
	}
	public Developer() {
	
	}
	
	
	

}
