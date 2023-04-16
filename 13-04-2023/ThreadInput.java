//2. Write a program to create thread. Where you will take the input from the user and find if the number is odd or even.

package practicle_1304;
import java.util.Scanner;                      //import scanner class package
public class ThreadInput extends Thread     //by extending thread 
{

	public void run() //thread method
	{
		Scanner s=new Scanner(System.in);    //scanner object
		System.out.println("Enter input: ");   // input taking print statement
		int a=s.nextInt();                 //integer value input taking method
		s.close();
		
		if(a%2==0)        //condition  
		{
			System.out.println("Entered input is even"); //if condition 
		}
		else {
			System.out.println("Entered input is odd");    //else condition
		}
}
}

class Thread1 {

	public static void main(String[] args)     //main method 
	{
		ThreadInput t=new ThreadInput();   //class object creation
		t.start();     //thread start
	}
}

