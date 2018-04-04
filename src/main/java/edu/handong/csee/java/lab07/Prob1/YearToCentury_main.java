package edu.handong.csee.java.lab07.Prob1;
import java.util.Scanner;
public class YearToCentury_main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr = 0;
	Scanner keyboard = new Scanner(System.in);
	
	
	
	System.out.println("Input The Year : ");
	yr = keyboard.nextInt();
	
	YearToCentury year = new YearToCentury(yr);
	
	System.out.println(yr + " is " + 
	year.Calc_Century() + " the century" );

	}

}
