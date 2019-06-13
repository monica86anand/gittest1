package School;
public class DecimalToBinaryConversion
{
	public static void main(String[] args)
	{
		DecimalToBinaryConversion db=new DecimalToBinaryConversion();
		db.convertIntToBinary(5);
	}
	
	public void  convertIntToBinary(int n)
	{
		  if (n > 1) 
			  convertIntToBinary(n/2); 
		  
		    /* step 2 */
		    System.out.print(n % 2); 
	}
}