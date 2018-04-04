package edu.handong.csee.java.lab07.prob2;// package name of lab07 prob02

/**
 * Fried Chicken menu 
 * @author SovanEco(Chhaya)
 *
 */
public class chicken {
	private String name;
	private double price;
	private int stars;

	// chicken public method
	public chicken() {
		this.name = " ";
		this.price = 0.0;
		this.stars= 0;
	}
	// method and parameter variable 
	public chicken(String name, double price ,int stars)
	{
		this.name = name;
		this.price = price ;
		this.stars = stars;
	}

	//get_name String method
	public String get_name() {

		return this.name;
	}

	//get_price double method
	public double get_price() {
		return this.price;

	}
	//get_stars int method
	public int get_stars() {
		return this.stars;
	}
	//set_name public void no return value and parameter variable as string
	public void set_name(String name)
	{
		this.name = name;
	}

	//set_name public void no return value and parameter variable as double
	public void set_price(double price)
	{
		this.price = price;
	}

	//set_name public void no return value and parameter variable as int
	public void set_stars(int stars)
	{
		this.stars= stars;
	}




}
