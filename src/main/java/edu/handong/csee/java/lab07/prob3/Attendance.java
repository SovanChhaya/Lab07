package edu.handong.csee.java.lab07.prob3;// package name of lab07 prob03
import java.util.*;//import java util package

/**
 * Random Attendance of student 
 * No need to input number 
 * Random Automatically
 * @author SovanEco(Chhaya)
 *
 */
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

	//getters
	public int get_year() {
		return year;

	}

	//getters
	public String get_id() {
		return Student_id;
	}

	//getters
	public int get_missed () {
		return missed;

	}

	//Setters

	public void set_name(String name) {

		this.name = name;

	}
	//Setters
	public void set_year(int year) {
		this.year = year;

	}

	//Setters
	public void set_id(String Student_id) {
		this.Student_id= Student_id;


	}
	//Setters
	public void set_missed(int missed) {
		this.missed= missed;
	}


}
