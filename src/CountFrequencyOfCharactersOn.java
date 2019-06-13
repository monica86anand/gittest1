import java.util.*;
import java.lang.Math;
public class CountFrequencyOfCharactersOn
{
	public static void main(String[] args)
	{
	int[] arr={1,2,1,2,4};
for(int i=0;i<arr.length;i++)
{
	 if (arr[Math.abs(arr[i])] >= 0) 
         arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
     else
         System.out.print(Math.abs(arr[i]) + " "); 
}
	
	}
	}



