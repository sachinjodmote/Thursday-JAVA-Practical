/* 2. Create a class named 'Rectangle' with two data members 'length' and 'breadth' 
and two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length and breadth
of the rectangle.Print the area and perimeter of a rectangle */

class Rectangle
{
    double length,breadth;
    double area, perimeter;
	
	public void printArea(double a, double b)
	{
		this.length=a;
		this.breadth=b;
		area=a*b;
	    System.out.println("Area:" +area);
	}
	public void printParametere(double a, double b)
	{
	    this.length=a;
		this.breadth=b;
		perimeter=2*(a+b);
        System.out.println("Perimeter:"  + perimeter);
	}
}
class UseRectangle
{
   public static void main(String args[])
   { Rectangle r= new Rectangle();
   
   r.printArea(4.0,5.0);
   r.printParametere(4.0,5.0);
    //System.out.println("Perimeter" + r.printArea);
   }
}
