public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] a={2,5,8,12,16,23,38,56,72,91};
		int start=0;
		int end=a.length;
		int element=91;
		int mid=0;
		for(int i=start;i<end;i++)
		{
			
			if(a[mid]==element)
			{
				System.out.println("elemnet is at index"+mid);
				break;
			}
			mid=(start+end)/2;
			if(element>a[mid])
			{
				start=mid;
			}
			if(element<a[mid])
			{
				end=mid;
			}
		}
	}
}