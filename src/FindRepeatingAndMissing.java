import java.util.Arrays;



public class FindRepeatingAndMissing
{
	public static void main(String[] args)
	{
		int[] a={4, 6, 6, 2, 5, 1};
		Arrays.sort(a);
		int index=1;
		for(int i =0;i<a.length;i++)
		{
			if(a[i]!=index)
			{
				if(i-1>=0 )
				{
			//	System.out.println("missing elemnet"+index);
				if(a[i]==a[i-1])
				{
				System.out.println("duplicate"+a[i]);
				index=index-1;
				}
				else
				{
					
						System.out.println("missing"+index);
						index=index+1;
					}
				}
			}
			
			if(a[i]==index )
			{index++;

			
			}
			
			
				
			
				
					}
	}
	}
