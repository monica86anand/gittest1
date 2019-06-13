package School;
public class SecondLargestElementInAnArray
{
public static void main(String[] args)
{
	int[]a={10, 5, 10};
	int max=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		
		}
	}
	int max2=max;
	boolean flag=false;
	for(int i=0;i<a.length;i++)
	{
	if(Math.abs(max-a[i])<max2 && max-a[i]!=0)
	{
		max2=a[i];
		flag=true;
	}
		
	}
	if(flag==false)
	{
		System.out.println("There is no second largest element");
	}
	else
	{
	System.out.println(max2);
	}
}
}

