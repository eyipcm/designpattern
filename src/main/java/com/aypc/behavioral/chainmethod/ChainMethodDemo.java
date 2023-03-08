package com.aypc.behavioral.chainmethod;

public class ChainMethodDemo {
	private String name;
	private int age;
	private Gender gender;
	private String mobile;
	
			
	public String getName() {
		return name;
	}
	public ChainMethodDemo setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public ChainMethodDemo setAge(int age) {
		this.age = age;
		return this;
	}
	public Gender getGender() {
		return gender;
	}
	public ChainMethodDemo setGender(Gender gender) {
		this.gender = gender;
		return this;
	}
	public String getMobile() {
		return mobile;
	}
	public ChainMethodDemo setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}
	@Override
	public String toString() {
		return "ChainMethodDemo [name=" + name + ", age=" + age + ", gender=" + gender + ", mobile=" + mobile + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
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
		ChainMethodDemo other = (ChainMethodDemo) obj;
		if (age != other.age)
			return false;
		if (gender != other.gender)
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	// Usage:
	public static void main(String[] args) {
		ChainMethodDemo person = new ChainMethodDemo();
	    String outString = person.setName("Peter").setAge(21).setGender(Gender.MALE).toString();
	    System.out.println(outString);
	}
	
	public enum Gender {
		MALE, FEMALE;
	}
	
}
/*
 * output:
 * ChainMethodDemo [name=Peter, age=21, gender=MALE, mobile=null]
 * */
 