package edu.handong.csee.java.lab07.Prob1;// package name

import java.util.Scanner;// import Scanner package for keyboard

/**
 * Calculating from year to Century 
 * User input year
 * @author SovanEco(Chhaya)
 *
 */
public class YearToCentury_main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr = 0;
		Scanner keyboard = new Scanner(System.in);// constructor keykoard 

		System.out.println("Input The Year : ");// print out Input the year
		yr = keyboard.nextInt();// user input year

		YearToCentury year = new YearToCentury(yr);// Constructor 

		System.out.println(yr + " is " + 	year.Calc_Century() + " the century" );// print out is (result) the century

	}

}
