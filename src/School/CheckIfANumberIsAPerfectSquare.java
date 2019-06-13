package School;
public class CheckIfANumberIsAPerfectSquare
{
	public static void main(String[] args)
	{
		int start=0;
		int end=225;
	    int n=225;
		int mid=0;
		for(int i=start;i<end;i++)
		{
			mid=(start+end)/2;
			if(mid*mid==n)
			{
				System.out.println("number is a perfect square");
				break;
			}
			if(mid*mid>n)
			{
			end=mid-1;	
			}
			if(mid*mid<n)
			{
				start=mid+1;
			}
		}
	}
}