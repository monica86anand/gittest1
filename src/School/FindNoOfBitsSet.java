package School;
public class FindNoOfBitsSet
{
	public static void main(String[] args)
	{
		int i=7;
		int count=0;
		while(i>0)
		{
			i=i&(i-1);
			count=count+1;
		}
		System.out.println(count);
	}
}