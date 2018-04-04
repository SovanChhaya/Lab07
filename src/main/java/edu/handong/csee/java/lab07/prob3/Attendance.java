package edu.handong.csee.java.lab07.prob3;
import java.util.*;
public class Attendance {
private String name =" ";
private int year = 0;
private String Student_id = " ";
private int missed = 0;

//constructor
public Attendance () {
	this.name = "Null";
	this.year = 0;
	this.Student_id ="Null";
	this.missed = 0;
	
}

public Attendance (String name , int year , String Student_id, int missed)
{
	this.name = name;
	this.year = year;
	this.Student_id = Student_id;
	this.missed = missed;
	
}

//getters

public String get_name() {
	
	return name;
	
}
public int get_year() {
	return year;
	
}
public String get_id() {
	return Student_id;
}
public int get_missed () {
	return missed;
	
}
//Setters

public void set_name(String name) {
	
	this.name = name;
	
}
public void set_year(int year) {
	this.year = year;
	
}
public void set_id(String Student_id) {
	this.Student_id= Student_id;
	
	
}
public void set_missed(int missed) {
	this.missed= missed;
}


}
