/* 1 Write a program in java showing overloading of Add method with 2 and 3 parameters.
In the user passes 2 values method with 2 parameter should be called if he passes 3 values method with 3 parameters should be called */

class Overloading
{
	public void add(int a, int b)
	{
		System.out.println("This method with 2 parameter");
	}
	public void add(int a, int b, int c)
	{
		System.out.println("This Method with 3 parameter");
	}
}
public class UseOverload
{
	public static void main(String args[])
	{
		Overloading x=new Overloading();
		x.add(45,56);
		x.add(44,88,22);
	}
}
