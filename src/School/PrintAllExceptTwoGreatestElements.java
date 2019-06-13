package School;
public class PrintAllExceptTwoGreatestElements
{
	public static void main(String[] args)
	{
		int [] a={-6,-5,-4,-3,-2,-1,0,1,3};
		int max=a[0];
		int max1=a[1];
		if(a[0]>a[1])
		{
			max=a[0];
			max1=a[1];
		}
		else
		{
			max1=a[0];
			max=a[1];
		}
		for(int i=2;i<a.length;i++)
			
		{
			if(a[i]>max )
			{
				System.out.println(max1);
				max1=max;
				max=a[i];
			}
			else	if(a[i]>max1 && a[i]<max)
			{
				System.out.println(max1);
				max1=a[i];
			}
			else if (a[i]<max && a[i]<max1)
			{
				System.out.println(a[i]);
			}
		}
	}
}