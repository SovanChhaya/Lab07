package edu.handong.csee.java.lab07.prob2;

public class chicken_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
chicken menu1 = new chicken("cheese_mustard" , 16000.00,5);
chicken menu2 = new chicken("Honey_mustard" , 16000.00,5);
chicken menu3 = new chicken("Spicy_chicken" , 16000.00,1);

	menu1.set_stars(3);
	menu2.set_stars(4);
	menu3.set_stars(1);
	
	System.out.println(menu1.get_name()+" 's rating is "+ menu1.get_stars());
	System.out.println(menu2.get_name()+" 's rating is "+ menu2.get_stars());
	System.out.println(menu3.get_name()+" 's rating is "+ menu3.get_stars());
	
		
	}

}
