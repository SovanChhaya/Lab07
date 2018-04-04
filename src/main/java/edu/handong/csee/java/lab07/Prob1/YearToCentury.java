package edu.handong.csee.java.lab07.Prob1;
import java.util.Scanner;
public class YearToCentury {

int year;// class variable

public YearToCentury()
{
	year = 0 ;
	
}

public YearToCentury(int year)
{
	this.year = year;
}


public int Calc_Century() {
	
	if(year % 100 == 0)
		year = year / 100 ;
	
	else {
		year = (year/100) + 1;
	}
	return year ;
}

}
