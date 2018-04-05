package edu.handong.csee.java.lab07.prob3;// package name of lab07 prob03
import java.util.Random;//import Random package for RandomGenerator 

/**
 * Random Attendance of student 
 * No need to input number 
 * Random Automatically
 * @author SovanEco(Chhaya)
 *
 */
public class Attendance_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Attendance s_1 = new Attendance();// object constructor Attendance 
		Attendance s_2 = new Attendance();// object constructor Attendance 
		Attendance s_3 = new Attendance("Lucas",1 ,"21833222",0);// object constructor Attendance 
		Attendance s_4 = new Attendance (" Martha ", 2 , " 21733444",0);// object constructor Attendance 

		s_1.setName("Jess"); s_1.setYear(4); s_1.setMissed(0);s_1.setId("21400999");
		s_2.setName("kent"); s_2.setMissed(0);s_2.setId("21700111"); s_2.setYear(2);

		Random randomGenerator = new Random();// Random constructor  for package

		s_1.setMissed(randomGenerator.nextInt(10));
		s_2.setMissed(randomGenerator.nextInt(10));
		s_3.setMissed(randomGenerator.nextInt(10));
		s_4.setMissed(randomGenerator.nextInt(10));

		//conditional for s_1 
		if(s_1.getMissed()>6)
		{
			//print out I'm sorry  (value of s_1) you're fail this course
			System.out.println("I'm sorry" + s_1.getName()+"  you're fail this course ");

			//print out (value of (s_1 get_name) Number of absence and value of (s_1)
			System.out .println(s_1.getName()+"  Number of absence :"+ s_1.getMissed());
		}
		else 
			// print out we'll see about the grade and (s_1.get_name value)
			System.out .println(" We'll see about the grade"  + s_1.getName());




		//conditional for s_2 
		if(s_2.getMissed()>6)
		{
			//print out I'm sorry  (value of s_2) you're fail this course
			System.out.println("I'm sorry " + s_2.getName()+"  you're fail this course");

			//print out (value of (s_2 get_name) Number of absence and value of (s_2)
			System.out .println(s_2.getName()+"  Number of absence :"+ s_2.getMissed());
		}
		else 
			// print out we'll see about the grade and (s_2.get_name value)
			System.out .println(" We'll see about the grade"  + s_2.getName());




		//conditional for s_3
		if(s_3.getMissed()>6)
		{
			//print out I'm sorry  (value of s_3) you're fail this course
			System.out.println("I'm sorry " + s_3.getName()+"  you're fail this course ");

			//print out (value of (s_3get_name) Number of absence and value of (s_3)
			System.out .println(s_3.getName()+"  Number of absence :"+ s_3.getMissed());
		}
		else 
			// print out we'll see about the grade and (s_3.get_name value)
			System.out .println(" We'll see about the grade "  + s_3.getName());



		//conditional for s_4
		if(s_4.getMissed()>6)
		{
			//print out I'm sorry  (value of s_4) you're fail this course
			System.out.println("I'm sorry" + s_4.getName()+"  you're fail this course ");

			//print out (value of (s_4 get_name) Number of absence and value of (s_4)
			System.out .println(s_4.getName()+"  Number of absence :"+ s_4.getMissed());
		}
		else 
			// print out we'll see about the grade and (s_4.get_name value)
			System.out .println(" We'll see about the grade "  + s_4.getName());
	}

}
