//3. Create two thread.one thread is finding average of first 50 numbers and other thread is printing square of number store in array arr={10,15,20,25,30}.

package practicle_1304;
class FirstThread extends Thread     //by extending thread method    //first thread
{
	public void run()             //thread run method
	{   
	 int t=0;                      //value initialization
	 double a;
	 for(int i=1;i<=50;i++)
	 {
		 t=t+i;               // calculating the total of first 50
	 }
	 System.out.println("Total Of first 50 numbers is:" +t);    // printing total
	 a=t/50;
	 System.out.println("Average Of first 50 numbers is:" +a);	  //printing average
	}
}
class SecondThread extends Thread         // by extending thread // second thread
{    
	int[] arr= {10,15,20,25,30};        //given array
	
	public void run()     // thread run method
	
	{
		for (int i = 0; i < arr.length; i++)    
		{
            System.out.println("Square of " + arr[i] + " = " + (arr[i] * arr[i]));  //printing and calculating the square of array
           try { Thread.sleep(1000);      //1sec pause in between thread execution
           }
           catch (InterruptedException i1)    //exception handled with try catch block for sleep 
           {
        	   System.out.println("");
           }
           }
	}
}


public class TwoThread 
{

	public static void main(String[] args) 
	{
		FirstThread t1=new FirstThread();
		SecondThread t2=new SecondThread();
		t1.start();
		t2.start();

	}

}
