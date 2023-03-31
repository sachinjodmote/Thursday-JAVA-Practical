/* 3.Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive".
Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "Type".
Create an object of the Car class and call both the "drive" and "Type" methods. */

class Vehicle
{
    String brand = "TATA";
	String model= "Vitara Brezza";
	int year= 2020;
	public void drive()
	{
	   System.out.println("Brand: "+brand+ "Model: "+model+ "Year: " +year);
	}
}
	class Car extends Vehicle
	{
	    String color= "red";
		public void type()
		{
		  System.out.println("Color: "+color);
		}
		
	}

public class Useinheritance
 {
     public static void main(String args[])
	 {
		 Car v=new Car();
	     v.drive();
	     v.type();
     }
 }
