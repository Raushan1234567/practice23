package com.masai;

public class Student {
private int roll;
private String Name;
private int Marks;
public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	Name = name;
	Marks = marks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getMarks() {
	return Marks;
}
public void setMarks(int marks) {
	Marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", Name=" + Name + ", Marks=" + Marks + "]";
}


}
