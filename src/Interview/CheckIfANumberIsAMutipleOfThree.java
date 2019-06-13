package Interview;
public class CheckIfANumberIsAMutipleOfThree
{
	public static void main(String[] args)
	{
	int	n=11;
	
		 int odd_count = 0; 
	        int even_count = 0; 
	  
	     
	        while (n != 0) { 
	            /* If odd bit is set then 
	        increment odd counter */
	            if ((n & 1) != 0) 
	                odd_count++; 
	  
	            /* If even bit is set then 
	        increment even counter */
	            if ((n & 2) != 0) 
	                even_count++; 
	  
	            n = n >> 2; 
	}
	}
}