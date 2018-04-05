package edu.handong.csee.java.lab07.prob2;// package name of lab07 prob02
/**
 * Fried Chicken menu 
 * print out any menu 
 * @author SovanEco(Chhaya)
 *
 */
public class Chicken_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken menu1 = new Chicken("cheese_mustard" , 16000.00,5);//constructor
		Chicken menu2 = new Chicken("Honey_mustard" , 16000.00,5);//constructor
		Chicken menu3 = new Chicken("Spicy_chicken" , 16000.00,1);//constructor

		menu1.setStars(3);// menu1 as object constructor set_stars method
		menu2.setStars(4);// menu2 as object constructor set_stars method
		menu3.setStars(1);// menu3 as object constructor set_stars method

		System.out.println(menu1.getName()+" 's rating is "+ menu1.getStars());// print out (value of num1) 's rating is (value)
		System.out.println(menu2.getName()+" 's rating is "+ menu2.getStars());// print out (value of num2) 's rating is (value)
		System.out.println(menu3.getName()+" 's rating is "+ menu3.getStars());// print out (value of num3) 's rating is (value)


	}

}
