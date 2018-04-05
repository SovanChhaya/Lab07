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
	public String getName() {

		return name;

	}

	//getters
	public int getYear() {
		return year;

	}

	//getters
	public String getId() {
		return Student_id;
	}

	//getters
	public int getMissed () {
		return missed;

	}

	//Setters

	public void setName(String name) {

		this.name = name;

	}
	//Setters
	public void setYear(int year) {
		this.year = year;

	}

	//Setters
	public void setId(String Student_id) {
		this.Student_id= Student_id;


	}
	//Setters
	public void setMissed(int missed) {
		this.missed= missed;
	}


}
