package edu.handong.csee.java.lab07.Prob1;// package name for laob07 prob01

/**
 * Calculating from year to Century 
 * 
 * the condition to calculate from year to century
 * @author SovanEco(Chhaya)
 *
 */
// YearToCentury class 
public class YearToCentury {

	int year;// class variable

	// year ToCentury public method
	public YearToCentury()
	{
		year = 0 ;

	}
	//method and parameter variable
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
