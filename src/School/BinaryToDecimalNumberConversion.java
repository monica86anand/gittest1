package School;
public class BinaryToDecimalNumberConversion
{
	public static void main(String[] args)
	{
		int i=101100;int mod=0;
		int count=0;
		int sum=0;
		while(i>=10)
		{
			
			mod=i%10;
			i=i/10;
			
			if(mod==1)
			{
				sum=sum+(int)Math.pow(2,count);
			}
			count++;
			
		}
		sum=sum+(int)Math.pow(2,count);
		System.out.println(sum);
		
	}
}