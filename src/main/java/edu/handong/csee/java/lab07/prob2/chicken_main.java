package edu.handong.csee.java.lab07.prob2;// package name of lab07 prob02
/**
 * Fried Chicken menu 
 * print out any menu 
 * @author SovanEco(Chhaya)
 *
 */
public class chicken_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chicken menu1 = new chicken("cheese_mustard" , 16000.00,5);//constructor
		chicken menu2 = new chicken("Honey_mustard" , 16000.00,5);//constructor
		chicken menu3 = new chicken("Spicy_chicken" , 16000.00,1);//constructor

		menu1.set_stars(3);// menu1 as object constructor set_stars method
		menu2.set_stars(4);// menu2 as object constructor set_stars method
		menu3.set_stars(1);// menu3 as object constructor set_stars method

		System.out.println(menu1.get_name()+" 's rating is "+ menu1.get_stars());// print out (value of num1) 's rating is (value)
		System.out.println(menu2.get_name()+" 's rating is "+ menu2.get_stars());// print out (value of num2) 's rating is (value)
		System.out.println(menu3.get_name()+" 's rating is "+ menu3.get_stars());// print out (value of num3) 's rating is (value)


	}

}
