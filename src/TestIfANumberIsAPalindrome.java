public class TestIfANumberIsAPalindrome
{
	public static void main(String[] args)
	{
		int i=1221;
		int temp=i;
		int mod=0;
		int sum = 0;
		while(i>=10)
		{
			mod=i%10;
			i=i/10;
		
		
		sum=sum*10+mod*10;	
	//	n=(int)Math.pow(10, j);
	//	j=j+1;
	//	n=10;
		}
		if(sum+i==temp
				)
		{
			System.out.println("num is a pal");
		}
	}
}