package School;
public class SecondLargestElementInAnArray1
{
public static void main(String[] args)
{
	int[]a={2,8,7,1,5};
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
	if(a[i]>max)
	{
		max1=max;
		max=a[i];
	}
	else if(a[i]>max1 && a[i]<max)
	{
		max1=a[i];
	}
	}
	if(max1!=max)
	{
	System.out.println(max1);
	}
	System.out.println(max);
	
}
}

