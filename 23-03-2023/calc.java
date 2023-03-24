// Write a program create a class calculation, add methods addition,substraction,multiplication,and division to create objects and access those methods.
class Calculation  //declaring class
{
   int a;   //   variable initialization                        
   int b;   //   variable initialization
   int result; // variable initialization
   
   void addition(int a, int b)    //adition method
   {
      result=a+b;  // performing addition
	  System.out.println("Addition:"+result);  // print result
   }
   void substraction(int a, int b)  // substraction method
   {
      result=a-b; //performing substraction
	  System.out.println("Substraction:"+result);  // print result
   }
   void multiplicaction(int a, int b)  // multiplication method
   {
      result=a*b;  // performing multiplication
      System.out.println("multiplicaction:"+result);	  // print result
   }
   void division(int a, int b)   // division method
   {
       result=a/b;  // performing division
       System.out.println("division:"+result);// print result
    }

}
class SumCalculation   //declaring class
{
    public static void main(String args[])  // main method
    {
       Calculation sum=new Calculation();  // creating object
        sum.addition(10,20);          //marameter passing
        sum.substraction(30,20);      //marameter passing
        sum.multiplicaction(2,5);     //marameter passing
        sum.division(2,2);	      //marameter passing
    }
	
}
