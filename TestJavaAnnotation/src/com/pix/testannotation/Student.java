package com.pix.testannotation;

public class Student {
	public String name;
	public int age;

	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:" + this.name + ",age:" + this.age;
	}
}
