// 3. Write a program to take 3 number and find the greatest of all the 3 number

class GretestNumber  // class declaration
{
	  public static void main(String args[])   // main method
	  {
	     int a=10;           // value initialization
		 int b=20;       // value initialization
		 int c=30;       // value initialization
		  
		 if(a>b && a>c)   // condition 
		 {
			 System.out.println(a+ "is the greatest");    // print condition statement
		 }
		 else if(b>a && b>c)    // condition 
		 {
			 System.out.println(b+ "is the greater");      // print condition statement
		 }
		 else    // condition 
		 {
			 System.out.println(c+ "is the greater");    // print condition statement
		 }
	 
	  }
}
