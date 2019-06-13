public class CalculateExp { 
	
	public static void main(String[] args)
	{
		System.out.println(power(2,1));
	}
	
	static int power(int x,int n)
	{
		int y=0;
		if(n==0)
			return 1;
		else if(n%2==0)
		{
			y=power(x,n/2);
			return y*y;
		}
		else
		{
			return x*power(x,n-1);
		}
	}
	
}
      
  