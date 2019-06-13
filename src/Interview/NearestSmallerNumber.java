package Interview ;

public class NearestSmallerNumber
{
	public static void main(String[] args)
	{
		int arr[] = {1, 6, 4, 10, 2, 5,-1,-2,2};
		int[] a=new int[arr.length];
		int tmp=0;
		
		for(int i=0;i<arr.length;i++)
		{
		
			if(i==0)
			{
				System.out.print(" ");
			}
			else if(i==1)
			{
				System.out.print(arr[0]);
				tmp=arr[0];
			}
			else
			{
				if(arr[i-1]<arr[i])
				{
					System.out.print(arr[i-1]);
					
				}
				else if(arr[i]<arr[i-1] && arr[i] <tmp)
				{
					tmp=arr[i];
					System.out.print(" ");
				}
				else
				{
					System.out.print(tmp);
				}
			}
			
		}
		
	}
}