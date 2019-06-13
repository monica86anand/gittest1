package School;
public class FindGCDOfANumber
{
	public static void main(String[] args)
	{
		int x=26,y=13;
	System.out.println(	gcd(x,y));
		
	}
	
	public static int gcd(int x,int y)
	{
		if(y==0)
		{
			return x;
		}
		else
			return gcd(y,x%y);
	}
	

}