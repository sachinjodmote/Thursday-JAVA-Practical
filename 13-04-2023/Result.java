// 1. Write a program to take input of marks of 3 subjects from the user. Check if the total of marks given by the user is greater than 50 else throw an exception saying "You Failed".Or else print Grade is A if the total is greater than 280. Grade B if the total is greater than 200.Grade C if the total is greater than 150. Grade D if the total is greater than 50.




package practicle_1304;

import java.util.Scanner;    //import scanner class package
public class Result          //class 
{

	

	public static void main(String[] args)   //main method 
	{
		Scanner sc=new Scanner(System.in);    //scannner object
		
		int sub1;       //data member
		int sub2;
		int sub3;
		int total;
		
		System.out.println("Enter sub1 marks: ");     //input taking
		sub1=sc.nextInt();
		
		System.out.println("Enter sub2 marks: ");    //input taking
		sub2=sc.nextInt();
		
		System.out.println("Enter sub3 marks: ");     //input taking
		sub3=sc.nextInt();
		
		total=sub1+sub2+sub3;  //  formula to calculate total marks of subject
		
		System.out.println("The total marks is: "+total);   //output
		
		if(total<50)      //if condition
		{
			throw new ArithmeticException("You Failed");    //exception throw message
		}
		else if(total>=280) {
			System.out.println("You Passed with grade 'A' ");     //grade 
		}
		else if(total>=200) {
			System.out.println("You passed with grade 'b'");     //grade
		}
		else if(total>=150) {
			System.out.println("You passed with grade 'c'");    //grade
		}
		else {
			System.out.println("You passed with grade d");     //grade
		}

	}

}
