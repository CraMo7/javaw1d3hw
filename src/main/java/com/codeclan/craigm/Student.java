package com.codeclan.craigm;

public class Student extends User{

	
	
	public Student(){
	}
	
	public Student(String name){
		this.name = name;
	}
	
	@Override
	public String getName(){
		return this.name;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
