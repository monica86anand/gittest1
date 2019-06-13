public class RepeatedNumbersInAnArray
{
	public static void main(String[] args)
	{
		int[] a={2,3,4,4,1,5};
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[Math.abs(a[i])]>=0)
			{
				a[Math.abs(a[i])]=-a[Math.abs(a[i])];
				
			}
			else
			{
				System.out.print(Math.abs(a[i]));
			}
		}
	}
}