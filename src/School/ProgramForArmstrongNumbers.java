package School;
public class ProgramForArmstrongNumbers
{
	public static void main(String[] args)
	{
		int n=121;
		int mod=0;
		int div=153;
		int sum=0;
		while(n>=10)
		{
			mod=n%10;
			n=n/10;
			sum=sum+mod*mod*mod;
		}
		sum=sum+n*n*n;
		if(sum==div)
		{
			System.out.println("number is armstrong");
		}
	}
}