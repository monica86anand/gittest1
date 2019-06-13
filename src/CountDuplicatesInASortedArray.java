public class CountDuplicatesInASortedArray
{
	public static void main(String[] args)
	{
		int []a ={-2,-2,-1,0,1,2,2,3,3,3};
int count=1;
int index=0;
		for(int i=0;i<a.length;i++)
		{
			if((i+1<=a.length-1 && a[i]!=a[i+1])|| i==a.length-1)
			{
				System.out.println("element" + a[i]+" has occured "+count );
				count=1;
			}
			if(i+1<=a.length-1 && a[i]==a[i+1])
			{
				count=count+1;
			}
		}
		
	}
}