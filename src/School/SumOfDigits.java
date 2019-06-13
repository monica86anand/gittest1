package School;
public class SumOfDigits
{
	public static void main(String[] args)
	{
		int i=10;
		int div=0;
		int sum=0;
		while(i>=10)
		{
			div=i%10;
			i=i/10;
			sum=sum+div;
		}
		sum=sum+i;
		System.out.println(sum);
	}
}