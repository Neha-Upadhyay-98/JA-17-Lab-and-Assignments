package com.capgemini.authorapp.model;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	/**
	 * default constructor
	 */
	public Author() {
		super();
	}
	/**
	 * parameterized constructor
	 * @param name stores the name of author
	 * @param email stores the 
	 * @param gender
	 */
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	public void validateName() {
		// TODO Auto-generated method stub
		if(this.name.isEmpty()){
			throw new RuntimeException("Name cannot be null or empty");
		}
	}
	public void validateEmail() {
		// TODO Auto-generated method stub
		if(!this.email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")){
			throw new RuntimeException("Email is not valid");
		}
	}
	public void validateGender() {
		// TODO Auto-generated method stub
		if(this.gender!='m' && this.gender!='f' && this.gender!='u' && this.gender==' '){
			throw new RuntimeException("Gender is not valid");
		}
	}
	

}
