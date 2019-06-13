import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PrintNos1toNWithoutLoops
{
	public static void main(String[] args) throws IOException
	{
		  BufferedReader reader =
                  new BufferedReader(new InputStreamReader(System.in));
       String no = reader.readLine();
       String no1 = reader.readLine();
       String[] b=no1.split(" ");
       int[] a=new int[b.length];
       int m=0;
       for(int i=0;i<b.length;i++)
       {
    	  a[m]=Integer.parseInt(b[i]);
    	  m++;
       }
     //  int n=reader.read();
       System.out.println(no1); 
     /*  int[]a =new int[3];*/
			for(int j=0;j<a.length;j++)
			{
	        for(int i=1;i<=a[j];i++)
	        {
	            if(i%3==0 && i%5==0)
	            {
	               System.out.println("FizzBuzz");
	            }
	            else if(i%3==0)
	            {
	                System.out.println("Fizz");
	            }
	            else if(i%5==0)
	            {
	                System.out.println("Buzz");
	            }
	            else
	            {
	                System.out.println(i);
	            }
	            
	         }// Reading input from STDIN
			}

	    }
	

	
	public static int printN(int n)
	{
		if(n>0)
		{
			printN(n-1);
			System.out.println(n);
		}
		return 0;
	}
}