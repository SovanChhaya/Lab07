package edu.handong.csee.java.lab07.prob2;// package name of lab07 prob02

/**
 * Fried Chicken menu 
 * @author SovanEco(Chhaya)
 *
 */
public class Chicken {
	private String name;
	private double price;
	private int stars;

	// chicken public method
	public Chicken() {
		this.name = " ";
		this.price = 0.0;
		this.stars= 0;
	}
	// method and parameter variable 
	public Chicken(String name, double price ,int stars)
	{
		this.name = name;
		this.price = price ;
		this.stars = stars;
	}

	//get_name String method
	public String getName() {

		return this.name;
	}

	//get_price double method
	public double getPrice() {
		return this.price;

	}
	//get_stars int method
	public int getStars() {
		return this.stars;
	}
	//set_name public void no return value and parameter variable as string
	public void setName(String name)
	{
		this.name = name;
	}

	//set_name public void no return value and parameter variable as double
	public void setPrice(double price)
	{
		this.price = price;
	}

	//set_name public void no return value and parameter variable as int
	public void setStars(int stars)
	{
		this.stars= stars;
	}




}
