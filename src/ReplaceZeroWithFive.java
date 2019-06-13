public class ReplaceZeroWithFive
{
	public static void main(String[] args)
	{
		int i=10120  ;
		int mod=0;
		int sum=0;
		int count=0;
		while(i>1)
		{
			mod=i%10;
			i=i/10;
			if(mod==0)
				mod=5;
			sum=sum+mod*(int)Math.pow(10,count);
			count=count+1;
		}
		sum=sum+i*(int)Math.pow(10,count);
		System.out.println(sum);
	}
	
}