package School;
public class BinarySearch
{
	public static void main(String[] args)
	{
	int []a ={1,2,4,5};
	int start=0;
	int end=a.length-1;
	int n=1;
	int mid=0;
	for(int i=start;i<=end;i++)
	{
		mid=(start+end)/2;
		if(a[mid]==n)
		{
			System.out.println("elemnt is present");
			System.out.println(mid);
			
			break;
		}
		 if(n>a[mid])
		{
			start=mid+1;
			
			
		}
		if(n<a[mid])
		{
			end=mid;
		}
	}
	}
}
